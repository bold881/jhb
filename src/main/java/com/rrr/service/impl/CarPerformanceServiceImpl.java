package com.rrr.service.impl;

import com.rrr.dao.CarPerformanceMapper;
import com.rrr.service.CarPerformanceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
