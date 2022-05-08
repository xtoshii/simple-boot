package com.xtoshii.simple.api.response;


import lombok.*;
import lombok.experimental.Accessors;

import java.util.Collection;

/**
 * 统一分页响应
 *
 * @param <T>
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
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
}
