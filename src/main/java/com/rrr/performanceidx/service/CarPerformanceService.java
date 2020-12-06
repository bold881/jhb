package com.rrr.performanceidx.service;

import com.rrr.performanceidx.model.CarPerformance;

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

    /**
     * 添加指标名称
     * @param carIdxName 指标名称
     * @param carServiceName 竞品车系名称
     * @param carIdxValue 指标值
     * @return
     */
    List<CarPerformance> addPerformanceIdx(String carIdxName, String carServiceName, int carIdxValue);

    /**
     * 通过指标名称查询指标列表
     * @param idxName
     * @return
     */
    List<CarPerformance> getCarPerformanceByIdx(String idxName);

    /**
     * 通过主键ID删除记录
     * @param id
     * @param idxName
     * @return
     */
    List<CarPerformance> deleteById(long id, String idxName);
}
