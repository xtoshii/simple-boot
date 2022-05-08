package com.xtoshii.simple.controller;

import com.xtoshii.simple.api.request.SysUserRegistrationRequest;
import com.xtoshii.simple.api.response.Response;
import com.xtoshii.simple.api.response.SingleResponse;
import com.xtoshii.simple.common.converter.SysUserConverter;
import com.xtoshii.simple.common.dto.SysUserRegistrationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysUserController {

    @Autowired
    SysUserConverter sysUserConverter;

    @PostMapping("/user/register")
    public Response register(@RequestBody SysUserRegistrationRequest registrationRequest){
        SysUserRegistrationDTO registrationDTO = sysUserConverter.toRegistrationDTO(registrationRequest);
        return SingleResponse.succeed(registrationDTO);
    }
}
