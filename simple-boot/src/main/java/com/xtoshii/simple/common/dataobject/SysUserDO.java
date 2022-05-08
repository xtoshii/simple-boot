package com.xtoshii.simple.common.dataobject;

import java.util.Date;

public class SysUserDO {

    private Integer id;

    private String username;

    private String password;

    private Date createTime;

    private Date updateTime;

    public SysUserDO(Integer id, String username, String password, Date createTime, Date updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public SysUserDO() {
    }

    public static SysUserDOBuilder builder() {
        return new SysUserDOBuilder();
    }

    public Integer getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public SysUserDO setId(Integer id) {
        this.id = id;
        return this;
    }

    public SysUserDO setUsername(String username) {
        this.username = username;
        return this;
    }

    public SysUserDO setPassword(String password) {
        this.password = password;
        return this;
    }

    public SysUserDO setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public SysUserDO setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SysUserDO)) return false;
        final SysUserDO other = (SysUserDO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
        final Object this$password = this.getPassword();
        final Object other$password = other.getPassword();
        if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        final Object this$updateTime = this.getUpdateTime();
        final Object other$updateTime = other.getUpdateTime();
        if (this$updateTime == null ? other$updateTime != null : !this$updateTime.equals(other$updateTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SysUserDO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $password = this.getPassword();
        result = result * PRIME + ($password == null ? 43 : $password.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $updateTime = this.getUpdateTime();
        result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "SysUserDO(id=" + this.getId() + ", username=" + this.getUsername() + ", password=" + this.getPassword() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ")";
    }

    public static class SysUserDOBuilder {
        private Integer id;
        private String username;
        private String password;
        private Date createTime;
        private Date updateTime;

        SysUserDOBuilder() {
        }

        public SysUserDOBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public SysUserDOBuilder username(String username) {
            this.username = username;
            return this;
        }

        public SysUserDOBuilder password(String password) {
            this.password = password;
            return this;
        }

        public SysUserDOBuilder createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public SysUserDOBuilder updateTime(Date updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public SysUserDO build() {
            return new SysUserDO(id, username, password, createTime, updateTime);
        }

        public String toString() {
            return "SysUserDO.SysUserDOBuilder(id=" + this.id + ", username=" + this.username + ", password=" + this.password + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ")";
        }
    }
}
