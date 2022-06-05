package com.xtoshii.simple.api.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @program: simple-boot
 * @description:
 * @create: 2022-05-22 18:15
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SelectSysUserRequest {

    @NotBlank
    private String id;
}
