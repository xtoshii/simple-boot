package com.xtoshii.simple.common.dto;

import lombok.*;
import lombok.experimental.Accessors;

@Data
@Builder
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class SysUserRegistrationDTO {

    private String username;

    private String password;

}
