package com.rrr.performanceidx.view;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.rrr.common.CommonResult;
import com.rrr.performanceidx.model.CarPerformance;
import com.rrr.performanceidx.service.CarPerformanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author daifeng
 */
@RestController
@RequestMapping("/api")
@CrossOrigin
@Slf4j
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
        int carIdxValue = body.getIntValue("carIdxValue");

        List<CarPerformance> carPerformances = carPerformanceService.addPerformanceIdx(
                carIdxName,
                carServiceName,
                carIdxValue
        );
        return CommonResult.success(carPerformances);
    }

    /**
     * 通过指标名称查询性能指标
     * @param params
     * @return
     */
    @PostMapping("/getPerformancesByIdx")
    public CommonResult getCarPerformanceByIdx(@RequestBody String params) {
        JSONObject rawParams = JSON.parseObject(params);
        String idxName = rawParams.getString("idxName");
        List<CarPerformance> performances = carPerformanceService.getCarPerformanceByIdx(idxName);
        return CommonResult.success(performances);
    }

    @PostMapping("/deleteById")
    public CommonResult deleteById(@RequestBody String params) {
        log.info(params);
        JSONObject inObj = JSON.parseObject(params);
        long id = inObj.getLong("id");
        String idxName = inObj.getString("idxName");
        List<CarPerformance> list = carPerformanceService.deleteById(id, idxName);
        return CommonResult.success(list);
    }
}
