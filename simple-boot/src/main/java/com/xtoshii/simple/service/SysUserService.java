package com.xtoshii.simple.service;

import com.xtoshii.simple.api.response.BaseResponse;
import com.xtoshii.simple.common.dataobject.SysUserDO;
import com.xtoshii.simple.common.dto.SysUserRegistrationDTO;
import com.xtoshii.simple.common.dto.UpdateSysUserDTO;

/**
 * @program: simple-boot
 * @description:
 * @author: xtoshii
 * @create: 2022-05-22 15:49
 **/
public interface SysUserService {

    BaseResponse register(SysUserRegistrationDTO registrationDTO);

    BaseResponse update(UpdateSysUserDTO updateSysUserDTO);

    SysUserDO selectById(String id);
}
