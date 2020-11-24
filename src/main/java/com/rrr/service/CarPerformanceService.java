package com.rrr.service;

import java.util.List;

/**
 * @author daifeng
 */
public interface CarPerformanceService {

    /**
     * 获取所有的指标名称
     * @return 指标名称列表，不重复
     */
    List<String> getCarIndexNames();
}
