package com.xtoshii.simple.controller;

import com.xtoshii.simple.api.request.SelectSysUserRequest;
import com.xtoshii.simple.api.request.SysUserRegistrationRequest;
import com.xtoshii.simple.api.request.UpdateSysUserRequest;
import com.xtoshii.simple.api.response.BaseResponse;
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

    /**
     * @param registrationRequest 注册用户请求
     * @return BaseResponse
     * @apiNote 用户注册接口
     */
    @PostMapping("/user/register")
    public BaseResponse register(@RequestBody SysUserRegistrationRequest registrationRequest) {
        SysUserRegistrationDTO registrationDTO = sysUserConverter.toRegistrationDTO(registrationRequest);
        return sysUserService.register(registrationDTO);
    }


    /**
     * @param updateSysUserRequest updateSysUserRequest
     * @return BaseResponse
     * @apiNote 用户更新信息接口
     */
    @PostMapping("/user/update")
    public BaseResponse update(@RequestBody UpdateSysUserRequest updateSysUserRequest) {
        UpdateSysUserDTO updateSysUserDTO = sysUserConverter.toUpdateSysUserDTO(updateSysUserRequest);
        return sysUserService.update(updateSysUserDTO);
    }

    /**
     * @param selectSysUserRequest selectSysUserRequest
     * @return BaseResponse
     * @apiNote 根据用户id查询用户
     */
    @PostMapping("/user/select")
    public BaseResponse select(@RequestBody SelectSysUserRequest selectSysUserRequest) {
        return BaseResponse.succeed(sysUserService.selectById(selectSysUserRequest.getId()));
    }

}
