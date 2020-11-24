package com.rrr.model;

import lombok.Data;

import java.util.Date;

/**
 * @author daifeng
 */
@Data
public class CarPerformance {
    private Long id;

    private String carServiceName;

    private String carIdxName;

    private String carIdxValue;

    private Date createTime;

    private Date updateTime;
}
