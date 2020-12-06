package com.rrr.performanceidx.dao;

import com.rrr.performanceidx.model.CarPerformance;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 插入一条记录
     * @param carPerformance
     * @return
     */
    int insert(CarPerformance carPerformance);

    /**
     * 查找是否存在同样的记录
     * @param carPerformance
     * @return
     */
    int countByName(CarPerformance carPerformance);

    /**
     * 更新记录
     * @param carPerformance
     * @return
     */
    int update(CarPerformance carPerformance);

    /**
     * 通过指标名称查询
     * @param carIdxName
     * @return
     */
    List<CarPerformance> getByIdxName(@Param("carIdxName") String carIdxName);

    /**
     * 通过主键Id删除记录
     * @param carPerformance
     * @return
     */
    int delete(CarPerformance carPerformance);
}
