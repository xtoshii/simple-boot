package com.xtoshii.simple.common.dataobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class BaseDO {

    protected Date createTime;

    protected String createUser;

    protected Date updateTime;

    protected String updateUser;

    protected Integer deleted;
}
