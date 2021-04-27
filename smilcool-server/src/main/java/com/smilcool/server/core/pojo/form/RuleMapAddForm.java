package com.smilcool.server.core.pojo.form;

import com.smilcool.server.common.enums.PermissionType;
import com.smilcool.server.common.util.validation.EnumValidation;
import lombok.Data;
import sun.jvm.hotspot.debugger.cdbg.EnumType;

import javax.validation.constraints.NotBlank;

@Data
public class RuleMapAddForm {
    @NotBlank(message = "请求地址不能为空")
    private String url;

    @NotBlank(message = "描述不能为空")
    private String description;

    @EnumValidation(value = PermissionType.class, field = "type")
    private Integer type;

    private Boolean authc;

    private Boolean useRoles;

    private String roles;

    private Boolean usePerms;

    private String perms;

    private Boolean useRest;

    private String rest;

    private Integer seq;

    private Integer state;

    private String remark;
}