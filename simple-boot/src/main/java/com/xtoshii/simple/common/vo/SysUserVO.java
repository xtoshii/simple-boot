package com.xtoshii.simple.common.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Data
public class SysUserVO {

    private Integer id;

    private String username;

    private Date createTime;

    private Date updateTime;
}
