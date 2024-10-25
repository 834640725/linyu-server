package com.cershy.linyuserver.admin.vo.user;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class CreateUserVo {
    @NotNull(message = "账号不能为空")
    private String account;
    @NotNull(message = "用户名不能为空")
    private String name;
    @Email(message = "邮箱格式有误")
    private String email;
    private String phone;
}