package com.xtoshii.simple.service.impl;

import com.xtoshii.simple.api.response.BaseResponse;
import com.xtoshii.simple.common.dataobject.SysUserDO;
import com.xtoshii.simple.common.dto.SysUserRegistrationDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class SysUserServiceImplTest {

    @Resource
    SysUserServiceImpl sysUserService;

    @Test
    void selectByIdTest() {
        String userId = "11ecd9ac-becb-b642-b7b3-98e7f45696fc";
        SysUserDO sysUserDO = sysUserService.selectById(userId);
        log.info("userId:{},select sysUserDO:{}",userId,sysUserDO);
        assertEquals(userId, Objects.requireNonNull(sysUserDO).getId());
    }
}