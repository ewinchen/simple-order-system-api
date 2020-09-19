package com.ewin.sos.exception;

import com.ewin.sos.enums.ErrorCodeEnum;

public class NotFoundException extends CustomException {

  private static final long serialVersionUID = 7221511511595556988L;

  public NotFoundException() {
    super(ErrorCodeEnum.A0001, "资源不存在");
  }

  public NotFoundException(String message) {
    super(ErrorCodeEnum.A0001, message);
  }

}
