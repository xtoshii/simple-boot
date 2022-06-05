package com.xtoshii.simple.controller;

import com.xtoshii.simple.api.request.SelectSysUserRequest;
import com.xtoshii.simple.api.request.SysUserRegistrationRequest;
import com.xtoshii.simple.api.request.UpdateSysUserRequest;
import com.xtoshii.simple.api.response.BaseResponse;
import com.xtoshii.simple.common.converter.SysUserConverter;
import com.xtoshii.simple.common.dto.SysUserRegistrationDTO;
import com.xtoshii.simple.common.dto.UpdateSysUserDTO;
import com.xtoshii.simple.service.SysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
     * @apiNote 用户注册接口
     * @param registrationRequest 注册用户请求
     * @return BaseResponse
     */
    @PostMapping("/user/register")
    public BaseResponse register(@RequestBody SysUserRegistrationRequest registrationRequest) {
        SysUserRegistrationDTO registrationDTO = sysUserConverter.toRegistrationDTO(registrationRequest);
        return sysUserService.register(registrationDTO);
    }


    /**
     * @apiNote 用户更新信息接口
     * @param updateSysUserRequest updateSysUserRequest
     * @return BaseResponse
     */
    @PostMapping("/user/update")
    public BaseResponse update(@RequestBody UpdateSysUserRequest updateSysUserRequest) {
        UpdateSysUserDTO updateSysUserDTO = sysUserConverter.toUpdateSysUserDTO(updateSysUserRequest);
        return sysUserService.update(updateSysUserDTO);
    }

    /**
     * @apiNote 根据用户id查询用户
     * @param selectSysUserRequest selectSysUserRequest
     * @return BaseResponse
     */
    @PostMapping("/user/select")
    public BaseResponse select(@RequestBody SelectSysUserRequest selectSysUserRequest) {
        return BaseResponse.succeed(sysUserService.selectById(selectSysUserRequest.getId()));
    }

}
