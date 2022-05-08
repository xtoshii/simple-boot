package com.xtoshii.simple.api.response;


import java.io.Serializable;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * 通用响应父类，定义公共字段
 */
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

    public Response(Boolean success, String errorMsg, Integer errorCode) {
        this.success = success;
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
    }

    public Response() {
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }

    public Response setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Response setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public Response setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Response)) return false;
        Response response = (Response) o;
        return Objects.equals(success, response.success) && Objects.equals(errorMsg, response.errorMsg) && Objects.equals(errorCode, response.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, errorMsg, errorCode);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Response{");
        sb.append("success=").append(success);
        sb.append(", errorMsg='").append(errorMsg).append('\'');
        sb.append(", errorCode=").append(errorCode);
        sb.append('}');
        return sb.toString();
    }
}
