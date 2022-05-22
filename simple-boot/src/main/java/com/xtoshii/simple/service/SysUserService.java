package com.xtoshii.simple.service;

import com.xtoshii.simple.api.response.Response;
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

    Response register(SysUserRegistrationDTO registrationDTO);

    Response update(UpdateSysUserDTO updateSysUserDTO);

    SysUserDO selectById(String id);
}
