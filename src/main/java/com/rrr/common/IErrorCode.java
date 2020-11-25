package com.rrr.common;

/**
 * 封装API的错误码
 *
 * @author macro
 * @date 2019/4/19
 */
public interface IErrorCode {
    /**
     * 获取错误码
     * @return
     */
    long getCode();

    /**
     * 获取错误信息
     * @return
     */
    String getMessage();
}
