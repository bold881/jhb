package com.rrr.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.rrr.common.CommonResult;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author daifeng
 */
@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    private static final String USER_NAME = "admin";
//    private static final String PSWD = "!qaz@wsx";
    private static final String PSWD = "111111";
    private static final String ERR_MSG = "用户名或密码不正确";

    @PostMapping("/login")
    public CommonResult login(@RequestBody String params) {
        JSONObject bodyParams = JSON.parseObject(params);
        String userName = bodyParams.getString("username");
        String password = bodyParams.getString("password");
        Assert.notNull(userName, "用户名不能为空！");
        Assert.notNull(password, "密码不能为空！");
        if(!userName.equals(USER_NAME)) {
            return CommonResult.validateFailed(ERR_MSG);
        }

        if(!password.equals(PSWD)) {
            return CommonResult.validateFailed(ERR_MSG);
        }

        return CommonResult.success(userName);
    }
}
