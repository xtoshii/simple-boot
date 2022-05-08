package com.xtoshii.simple.common.converter;

import com.xtoshii.simple.api.request.SysUserRegistrationRequest;
import com.xtoshii.simple.common.dto.SysUserRegistrationDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SysUserConverter {

    @Mapping(source = "username",target = "username")
    @Mapping(source = "password",target = "password")
    SysUserRegistrationDTO toRegistrationDTO(SysUserRegistrationRequest registrationRequest);
}
