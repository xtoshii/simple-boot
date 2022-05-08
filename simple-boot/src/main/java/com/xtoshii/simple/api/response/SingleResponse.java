package com.xtoshii.simple.api.response;


import java.util.Objects;

/**
 * 返回通用响应类
 *
 * @param <T>
 */

public class SingleResponse<T> extends Response {

    private static final long serialVersionUID = -7972199935574383407L;

    /**
     * 返回的具体数据
     */
    private T data;

    public SingleResponse(T data) {
        this.data = data;
    }

    public SingleResponse() {
    }


    /**
     * 表示本次请求成功返回的数据静态方法
     *
     * @param data 具体返回的数据
     * @param <T>  返回的数据的类型
     * @return SingleResponse
     */
    public static <T> SingleResponse<T> succeed(T data) {
        SingleResponse<T> singleResponse = new SingleResponse<>();
        singleResponse.setSuccess(true);
        singleResponse.setData(data);
        return singleResponse;
    }

    /**
     * 表示请求失败的返回数据静态方法
     *
     * @param errorCode 错误码
     * @param errorMsg  错误消息
     * @return SingleResponse
     */
    public static <T> SingleResponse<T> fail(int errorCode, String errorMsg) {
        SingleResponse<T> singleResponse = new SingleResponse<>();
        singleResponse.setSuccess(false);
        singleResponse.setErrorCode(errorCode);
        singleResponse.setErrorMsg(errorMsg);
        return singleResponse;
    }

    /**
     * 表示请求失败的返回数据静态方法
     *
     * @param errorMsg 错误消息
     * @return SingleResponse
     */
    public static <T> SingleResponse<T> fail(String errorMsg) {
        SingleResponse<T> singleResponse = new SingleResponse<>();
        singleResponse.setSuccess(false);
        singleResponse.setErrorMsg(errorMsg);
        return singleResponse;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SingleResponse)) return false;
        if (!super.equals(o)) return false;
        SingleResponse<?> that = (SingleResponse<?>) o;
        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), data);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SingleResponse{");
        sb.append("success=").append(success);
        sb.append(", errorMsg='").append(errorMsg).append('\'');
        sb.append(", errorCode=").append(errorCode);
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
