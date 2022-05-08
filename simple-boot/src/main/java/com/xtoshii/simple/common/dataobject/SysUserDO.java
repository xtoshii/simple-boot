package com.xtoshii.simple.common.dataobject;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class SysUserDO {

    private Integer id;

    private String username;

    private String password;

    private Date createTime;

    private Date updateTime;
}
