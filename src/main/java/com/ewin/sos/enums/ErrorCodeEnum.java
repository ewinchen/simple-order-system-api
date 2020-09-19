package com.ewin.sos.enums;

public enum ErrorCodeEnum {
    OK("00000", "成功"),
    A0001("A0001", "用户错误"),
    A0200("A0200", "未登录或登录已过期"),
    B0001("B0001", "系统错误"),
    C0001("C0001", "第三方系统错误");

    private final String errorCode;

    private final String description;

    ErrorCodeEnum(String errorCode, String description) {
        this.errorCode = errorCode;
        this.description = description;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getDescription() {
        return description;
    }


}
