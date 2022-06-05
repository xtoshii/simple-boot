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

    /**
     * 需要更新信息的用户的id
     *
     * @mock 11ecd9ac-becb-b642-b7b3-98e7f45696fc
     */
    @NotBlank
    private String id;

    /**
     * 该用户的用户名，更新前后均可
     *
     * @mock jobs
     */
    @NotBlank
    private String username;

    /**
     * 该用户的密码，更新前后均可
     *
     * @mock 123456
     */
    @NotBlank
    private String password;
}
