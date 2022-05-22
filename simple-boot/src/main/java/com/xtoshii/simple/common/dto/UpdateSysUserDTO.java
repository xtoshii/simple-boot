package com.xtoshii.simple.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @program: simple-boot
 * @description:
 * @create: 2022-05-22 17:34
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
public class UpdateSysUserDTO {

    private String id;

    private String username;

    private String password;
}
