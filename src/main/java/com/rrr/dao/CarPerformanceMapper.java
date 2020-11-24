package com.rrr.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author daifeng
 */
@Mapper
public interface CarPerformanceMapper {

    /**
     * 获取所有的指标名称
     * @return 指标名称列表，不重复
     */
    List<String> getCarIndexNames();
}
