package com.xtoshii.simple.common.dataobject;

import lombok.Data;

@Data
public class BaseDO {

    protected Integer id;

    protected Long createTime;

    protected Long updateTime;

    protected int deleted;
}
