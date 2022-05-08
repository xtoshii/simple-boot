package com.xtoshii.simple.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 通用响应父类，定义公共字段
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Response implements Serializable {


    private static final long serialVersionUID = -7386630904240550159L;

    /**
     * 本次请求成功
     */
    protected Boolean success;

    /**
     * 错误消息
     */
    protected String errorMsg;

    /**
     * 错误码
     * 类似http响应码：
     * 200 成功
     * 400 客户端错误
     * 500 服务端错误
     */
    protected Integer errorCode;

}
