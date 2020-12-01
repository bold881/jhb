package com.rrr.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.rrr.common.CommonResult;
import com.rrr.service.CarPerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author daifeng
 */
@RestController
@RequestMapping("/api")
@CrossOrigin
public class CarPerformanceController {

    @Autowired
    private CarPerformanceService carPerformanceService;

    /**
     * 查询指标名称
     * @return
     */
    @GetMapping("/uniqueCarIdxNames")
    public CommonResult getUniqueCarIdxNames() {
        List<String> carIdxNames = carPerformanceService.getCarIndexNames();
        return CommonResult.success(carIdxNames);
    }

    /**
     * 添加性能指标
     * @param params
     * @return
     */
    @PostMapping("/addPerformanceIdx")
    public CommonResult addPerformanceIdx(@RequestBody String params) {
        JSONObject body = JSON.parseObject(params);
        String carIdxName = body.getString("carIdxName");
        String carServiceName = body.getString("carServiceName");
        String carIdxValue = body.getString("carIdxValue");
    }
}
