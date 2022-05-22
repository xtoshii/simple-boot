package com.xtoshii.simple.common.converter;

import com.xtoshii.simple.api.request.SysUserRegistrationRequest;
import com.xtoshii.simple.api.request.UpdateSysUserRequest;
import com.xtoshii.simple.common.dataobject.SysUserDO;
import com.xtoshii.simple.common.dto.SysUserRegistrationDTO;
import com.xtoshii.simple.common.dto.UpdateSysUserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SysUserConverter {

    @Mapping(source = "username", target = "username")
    @Mapping(source = "password", target = "password")
    SysUserRegistrationDTO toRegistrationDTO(SysUserRegistrationRequest registrationRequest);

    @Mapping(source = "username", target = "username")
    @Mapping(source = "password", target = "password")
    SysUserDO toSysUserDO(SysUserRegistrationDTO registrationDTO);


    @Mapping(source = "id", target = "id")
    @Mapping(source = "username", target = "username")
    @Mapping(source = "password", target = "password")
    UpdateSysUserDTO toUpdateSysUserDTO(UpdateSysUserRequest updateSysUserRequest);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "username", target = "username")
    @Mapping(source = "password", target = "password")
    SysUserDO toSysUserDO(UpdateSysUserDTO updateSysUserDTO);
}
