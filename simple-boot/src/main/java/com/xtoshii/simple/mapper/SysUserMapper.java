package com.xtoshii.simple.mapper;


import com.xtoshii.simple.common.dataobject.SysUserDO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper {

    Integer insertSysUser(SysUserDO sysUser);

    SysUserDO selectById(@Param("id") String id);

    Integer updateById(SysUserDO sysUser);

}
