package com.xtoshii.simple.controller;

import com.xtoshii.simple.api.request.SelectSysUserRequest;
import com.xtoshii.simple.api.request.SysUserRegistrationRequest;
import com.xtoshii.simple.api.request.UpdateSysUserRequest;
import com.xtoshii.simple.api.response.Response;
import com.xtoshii.simple.api.response.SingleResponse;
import com.xtoshii.simple.common.converter.SysUserConverter;
import com.xtoshii.simple.common.dto.SysUserRegistrationDTO;
import com.xtoshii.simple.common.dto.UpdateSysUserDTO;
import com.xtoshii.simple.service.SysUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysUserController {

    final SysUserConverter sysUserConverter;

    final SysUserService sysUserService;

    public SysUserController(SysUserConverter sysUserConverter, SysUserService sysUserService) {
        this.sysUserConverter = sysUserConverter;
        this.sysUserService = sysUserService;
    }

    @PostMapping("/user/register")
    public Response register(@RequestBody SysUserRegistrationRequest registrationRequest) {
        SysUserRegistrationDTO registrationDTO = sysUserConverter.toRegistrationDTO(registrationRequest);
        return sysUserService.register(registrationDTO);
    }

    @PostMapping("/user/update")
    public Response update(@RequestBody UpdateSysUserRequest updateSysUserRequest) {
        UpdateSysUserDTO updateSysUserDTO = sysUserConverter.toUpdateSysUserDTO(updateSysUserRequest);
        return sysUserService.update(updateSysUserDTO);
    }

    @PostMapping("/user/select")
    public Response select(@RequestBody SelectSysUserRequest selectSysUserRequest) {
        return SingleResponse.succeed(sysUserService.selectById(selectSysUserRequest.getId()));
    }
}
