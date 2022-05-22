package com.xtoshii.simple.service.impl;

import com.xtoshii.simple.api.response.Response;
import com.xtoshii.simple.api.response.SingleResponse;
import com.xtoshii.simple.common.converter.SysUserConverter;
import com.xtoshii.simple.common.dataobject.SysUserDO;
import com.xtoshii.simple.common.dto.SysUserRegistrationDTO;
import com.xtoshii.simple.common.dto.UpdateSysUserDTO;
import com.xtoshii.simple.mapper.SysUserMapper;
import com.xtoshii.simple.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Objects;

/**
 * @program: simple-boot
 * @description:
 * @create: 2022-05-22 15:50
 **/

@Service
@Slf4j
public class SysUserServiceImpl implements SysUserService {

    final SysUserConverter sysUserConverter;

    final SysUserMapper sysUserMapper;

    public SysUserServiceImpl(SysUserConverter sysUserConverter, SysUserMapper sysUserMapper) {
        this.sysUserConverter = sysUserConverter;
        this.sysUserMapper = sysUserMapper;
    }

    @Override
    public Response register(SysUserRegistrationDTO registrationDTO) {
        try {
            SysUserDO sysUserDO = sysUserConverter.toSysUserDO(registrationDTO);
            Date now = new Date();
            sysUserDO.setCreateTime(now)
                    .setUpdateTime(now);
            sysUserMapper.insertSysUser(sysUserDO);
            return SingleResponse.succeed("success!");
        } catch (Exception e) {
            log.error("register: {} error:{}", registrationDTO, e);
            return Response.SYSTEM_ERROR;
        }

    }

    @Override
    public Response update(UpdateSysUserDTO updateSysUserDTO) {
        try {
            SysUserDO sysUserDO = selectById(updateSysUserDTO.getId());

            if (Objects.isNull(sysUserDO)) {
                return SingleResponse.fail("not exist the user or user information is not match ");
            }
            SysUserDO updateUserDO = sysUserConverter.toSysUserDO(updateSysUserDTO);
            sysUserMapper.updateById(updateUserDO);
            return SingleResponse.succeed("success");
        } catch (Exception e) {
            log.error("update:{} error:{}", updateSysUserDTO, e);
            return Response.SYSTEM_ERROR;
        }
    }

    @Override
    @Nullable
    public SysUserDO selectById(String id) {
        if (StringUtils.isBlank(id)) {
            return null;
        }
        return sysUserMapper.selectById(id);
    }
}
