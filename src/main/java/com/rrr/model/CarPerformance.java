package com.rrr.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @author daifeng
 */
@Data
@Builder
public class CarPerformance {
    private Long id;

    private String carServiceName;

    private String carIdxName;

    private Integer carIdxValue;

    private Date createTime;

    private Date updateTime;
}
