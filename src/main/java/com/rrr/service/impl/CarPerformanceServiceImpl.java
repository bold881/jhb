package com.rrr.service.impl;

import com.rrr.dao.CarPerformanceMapper;
import com.rrr.model.CarPerformance;
import com.rrr.service.CarPerformanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author daifeng
 */
@Service
@Slf4j
public class CarPerformanceServiceImpl implements CarPerformanceService {

    @Autowired
    private CarPerformanceMapper carPerformanceMapper;

    @Override
    public List<String> getCarIndexNames() {
        return carPerformanceMapper.getCarIndexNames();
    }

    @Override
    public List<CarPerformance> addPerformanceIdx(String carIdxName, String carServiceName, int carIdxValue) {
        CarPerformance carPerformance = CarPerformance.builder()
                .carIdxName(carIdxName)
                .carServiceName(carServiceName)
                .carIdxValue(carIdxValue)
                .createTime(new Date())
                .updateTime(new Date())
                .build();
        // 检查记录是否存在，不存在则插入，存在则更新
        if(carPerformanceMapper.countByName(carPerformance) > 0) {
            carPerformanceMapper.update(carPerformance);
        } else {
            carPerformanceMapper.insert(carPerformance);
        }

        // 返回当前指标名称的列表
        return carPerformanceMapper.getByIdxName(carIdxName);
    }

}
