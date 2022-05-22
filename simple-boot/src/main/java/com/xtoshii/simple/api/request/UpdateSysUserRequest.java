package com.xtoshii.simple.api.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: simple-boot
 * @description:
 * @create: 2022-05-22 17:33
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateSysUserRequest {

    private String id;

    private String username;

    private String password;
}
