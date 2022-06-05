package com.xtoshii.simple.api.request;


import java.io.Serializable;
import java.util.Objects;

/**
 * 分页查询请求实体类
 */
public class PageRequest implements Serializable {

    private static final long serialVersionUID = -1883368150797167240L;


    /**
     * 数据总数
     */

    protected Integer totalCount;

    /**
     * 每一页大小
     */


    protected Integer pageSize;


    /**
     * 要查询第几页
     */

    protected Integer pageIndex;


    /**
     * 数据排序键
     */
    protected String orderBy;

    /**
     * 数据排序方式，默认为DESC
     */
    protected String orderDirection;

    public PageRequest(int totalCount, int pageSize, int pageIndex, String orderBy, String orderDirection) {
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
        this.orderBy = orderBy;
        this.orderDirection = orderDirection;
    }

    public PageRequest() {
    }


    public Integer getTotalCount() {
        if (Objects.isNull(totalCount) || totalCount <= 0) {
            return 0;
        }
        return this.totalCount;
    }

    public Integer getPageSize() {
        if (Objects.isNull(pageSize) || pageSize <= 0 || pageSize >= 100) {
            return 10;
        }
        return this.pageSize;
    }

    public Integer getPageIndex() {
        if (Objects.isNull(pageIndex) || pageIndex > getTotalCount()) {
            return 1;
        }
        return this.pageIndex;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public String getOrderDirection() {
        return this.orderDirection;
    }

    public PageRequest setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public PageRequest setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public PageRequest setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    public PageRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public PageRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PageRequest)) return false;
        PageRequest that = (PageRequest) o;
        return totalCount.equals(that.totalCount) && pageSize.equals(that.pageSize) && pageIndex.equals(that.pageIndex) && Objects.equals(orderBy, that.orderBy) && Objects.equals(orderDirection, that.orderDirection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, pageSize, pageIndex, orderBy, orderDirection);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PageRequest{");
        sb.append("totalCount=").append(totalCount);
        sb.append(", pageSize=").append(pageSize);
        sb.append(", pageIndex=").append(pageIndex);
        sb.append(", orderBy='").append(orderBy).append('\'');
        sb.append(", orderDirection='").append(orderDirection).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
