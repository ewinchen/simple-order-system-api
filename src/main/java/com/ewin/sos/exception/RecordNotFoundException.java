package com.ewin.sos.exception;

public class RecordNotFoundException extends Exception {

  private static final long serialVersionUID = 1L;

  public RecordNotFoundException() {
    super("记录不存在，请检查");
  }

}
