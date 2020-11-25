package com.rrr.controller;

import com.rrr.common.CommonResult;
import com.rrr.service.CarPerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/uniqueCarIdxNames")
    public CommonResult getUniqueCarIdxNames() {
        List<String> carIdxNames = carPerformanceService.getCarIndexNames();
        return CommonResult.success(carIdxNames);
    }
}
