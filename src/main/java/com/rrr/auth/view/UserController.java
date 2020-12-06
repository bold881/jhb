package com.rrr.auth.view;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.rrr.common.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author daifeng
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
@Slf4j
public class UserController {

    private static final String ADMIN_INFO = "{\n" +
            "    \"roles\": [\n" +
            "        \"admin\"\n" +
            "    ],\n" +
            "    \"introduction\": \"I am a super administrator\",\n" +
            "    \"avatar\": \"https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif\",\n" +
            "    \"name\": \"Super Admin\"\n" +
            "}";

    @GetMapping("/info")
    public CommonResult userInfo() {
        return CommonResult.success(JSON.parseObject(ADMIN_INFO));
    }
}
