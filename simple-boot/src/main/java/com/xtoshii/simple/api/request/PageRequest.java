package com.xtoshii.simple.api.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 分页查询请求实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class PageRequest implements Serializable {

    private static final long serialVersionUID = -1883368150797167240L;


    /**
     * 数据总数
     */
    private int totalCount;

    /**
     * 每一页大小
     */
    private int pageSize;


    /**
     * 要查询第几页
     */
    private int pageIndex;


    /**
     * 数据排序键
     */
    private String orderBy;

    /**
     * 数据排序方式，默认为DESC
     */
    private String orderDirection;

}
