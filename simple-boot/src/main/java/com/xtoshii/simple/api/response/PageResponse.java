package com.xtoshii.simple.api.response;



import java.util.Collection;
import java.util.Objects;

/**
 * 统一分页响应
 *
 * @param <T>
 */
public class PageResponse<T> extends Response {

    private static final long serialVersionUID = -8404784790940409224L;

    /**
     * 数据总数
     */
    private Integer totalCount;

    /**
     * 一页的数据量
     */
    private Integer pageSize;

    /**
     * 当前页数
     */
    private Integer pageIndex;

    /**
     * 具体数据
     */
    private Collection<T> data;

    public PageResponse(Integer totalCount, Integer pageSize, Integer pageIndex, Collection<T> data) {
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
        this.data = data;
    }

    public PageResponse() {
    }

    /**
     * @param data       需要返回的具体数据
     * @param totalCount 该查询的数据总数
     * @param pageIndex  当前页数
     * @param pageSize   每一页的大小
     * @param <T>        返回数据的类型
     * @return PageResponse
     */
    public static <T> PageResponse<T> succeed(Collection<T> data, int totalCount, int pageIndex, int pageSize) {
        PageResponse<T> pageResponse = new PageResponse<>();
        pageResponse.setData(data)
                .setTotalCount(totalCount)
                .setPageIndex(pageIndex)
                .setPageSize(pageSize)
                .setSuccess(true);
        pageResponse.setErrorCode(200);

        return pageResponse;
    }


    public Integer getTotalCount() {
        return this.totalCount;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public Collection<T> getData() {
        return this.data;
    }

    public PageResponse<T> setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public PageResponse<T> setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public PageResponse<T> setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    public PageResponse<T> setData(Collection<T> data) {
        this.data = data;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PageResponse)) return false;
        if (!super.equals(o)) return false;
        PageResponse<?> that = (PageResponse<?>) o;
        return Objects.equals(totalCount, that.totalCount) && Objects.equals(pageSize, that.pageSize) && Objects.equals(pageIndex, that.pageIndex) && Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), totalCount, pageSize, pageIndex, data);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PageResponse{");
        sb.append("totalCount=").append(totalCount);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", pageIndex=").append(pageIndex);
        sb.append(", data=").append(data);
        sb.append(", success=").append(success);
        sb.append(", errorMsg='").append(errorMsg).append('\'');
        sb.append(", errorCode=").append(errorCode);
        sb.append('}');
        return sb.toString();
    }
}
