package com.ewin.sos.exception;

import com.ewin.sos.enums.ErrorCodeEnum;

public class CustomException extends RuntimeException {

    private static final long serialVersionUID = 3626549613010403125L;
    private ErrorCodeEnum errorCodeEnum;

    public CustomException(ErrorCodeEnum errorCode, String message) {
        super(message);
        this.errorCodeEnum = errorCode;
    }

    public String getErrorCodeEnum() {
        return errorCodeEnum.getErrorCode();
    }

    public void setErrorCodeEnum(ErrorCodeEnum errorCodeEnum) {
        this.errorCodeEnum = errorCodeEnum;
    }

    public String getErrorCode() {
        return errorCodeEnum.getErrorCode();
    }
}
