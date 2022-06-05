package com.xtoshii.simple.api.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

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

    @NotBlank
    private String id;

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
