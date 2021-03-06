package com.xtoshii.simple.api.request;


import javax.validation.constraints.NotBlank;
import java.util.Objects;


public class SysUserRegistrationRequest {

    /**
     * 注册用户名
     *
     * @mock jobs
     */
    @NotBlank
    private String username;

    /**
     * 注册用户密码
     *
     * @mock 123456
     */
    @NotBlank
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SysUserRegistrationRequest)) {
            return false;
        }
        SysUserRegistrationRequest that = (SysUserRegistrationRequest) o;
        return Objects.equals(username, that.username) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SysUserRegistrationRequest{");
        sb.append("username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
