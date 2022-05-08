package com.xtoshii.simple.common.vo;

import java.util.Date;

public class SysUserVO {

    private Integer id;

    private String username;

    private Date createTime;

    private Date updateTime;

    public SysUserVO(Integer id, String username, Date createTime, Date updateTime) {
        this.id = id;
        this.username = username;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public SysUserVO() {
    }

    public static SysUserVOBuilder builder() {
        return new SysUserVOBuilder();
    }

    public Integer getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public SysUserVO setId(Integer id) {
        this.id = id;
        return this;
    }

    public SysUserVO setUsername(String username) {
        this.username = username;
        return this;
    }

    public SysUserVO setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public SysUserVO setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SysUserVO)) return false;
        final SysUserVO other = (SysUserVO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$username = this.getUsername();
        final Object other$username = other.getUsername();
        if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
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
        return other instanceof SysUserVO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $username = this.getUsername();
        result = result * PRIME + ($username == null ? 43 : $username.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $updateTime = this.getUpdateTime();
        result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "SysUserVO(id=" + this.getId() + ", username=" + this.getUsername() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ")";
    }

    public static class SysUserVOBuilder {
        private Integer id;
        private String username;
        private Date createTime;
        private Date updateTime;

        SysUserVOBuilder() {
        }

        public SysUserVOBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public SysUserVOBuilder username(String username) {
            this.username = username;
            return this;
        }

        public SysUserVOBuilder createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public SysUserVOBuilder updateTime(Date updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public SysUserVO build() {
            return new SysUserVO(id, username, createTime, updateTime);
        }

        public String toString() {
            return "SysUserVO.SysUserVOBuilder(id=" + this.id + ", username=" + this.username + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ")";
        }
    }
}
