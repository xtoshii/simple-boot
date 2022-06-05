package com.xtoshii.simple.api.response;


import java.io.Serializable;
import java.util.Objects;

/**
 * 通用响应父类，定义公共字段
 */
public class BaseResponse<T> implements Serializable {


    private static final long serialVersionUID = -7386630904240550159L;

    /**
     * 本次请求是否成功
     *
     * @mock true
     */
    protected Boolean success;

    /**
     * 错误消息
     *
     * @mock null
     */
    protected String errorMsg;

    /**
     * 错误码
     * 类似http响应码：
     * 200 成功
     * 400 客户端错误
     * 500 服务端错误
     *
     * @mock 200
     */
    protected Integer errorCode;

    /**
     * 返回数据
     *
     * @mock request succeed
     */
    private T data;

    public BaseResponse(Boolean success, String errorMsg, Integer errorCode, T data) {
        this.success = success;
        this.errorMsg = errorMsg;
        this.errorCode = errorCode;
        this.data = data;
    }

    public BaseResponse() {
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

    public BaseResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public BaseResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    public BaseResponse setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseResponse<?> that = (BaseResponse<?>) o;
        return Objects.equals(success, that.success) && Objects.equals(errorMsg, that.errorMsg) && Objects.equals(errorCode, that.errorCode) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, errorMsg, errorCode, data);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseResponse{");
        sb.append("success=").append(success);
        sb.append(", errorMsg='").append(errorMsg).append('\'');
        sb.append(", errorCode=").append(errorCode);
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }

    public static <T> BaseResponse<T> succeed(T data) {
        return new BaseResponse<>(true, null, null, data);
    }

    public static <T> BaseResponse fail(String errorMsg) {
        return new BaseResponse(false, errorMsg, 500, null);
    }

    public static <T> BaseResponse fail(String errorMsg, Integer errorCode) {
        return new BaseResponse(false, errorMsg, errorCode, null);
    }

    public static BaseResponse SYSTEM_ERROR = new BaseResponse(false, "system error,please try again", 500, null);

    public static BaseResponse INVALID_INPUT = new BaseResponse(false, "invalid parameters,please check your input", 400, null);
}
