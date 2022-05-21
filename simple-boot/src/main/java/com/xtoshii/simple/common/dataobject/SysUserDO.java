package com.xtoshii.simple.common.dataobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;



@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
public class SysUserDO extends BaseDO {

    private String username;

    private String password;

}
