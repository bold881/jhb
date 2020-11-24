package com.rrr.controller;

import com.rrr.service.CarPerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daifeng
 */
@RestController
@RequestMapping("/api")
public class CarPerformanceController {

    @Autowired
    private CarPerformanceService carPerformanceService;

    @GetMapping("/uniqueCarIdxNames")
    public String getUniqueCarIdxNames() {
        carPerformanceService.getCarIndexNames();
        return "ok";
    }
}
