package com.ewin.sos.exception;

public class RecordNotFoundException extends Exception {

  public RecordNotFoundException() {
    super("记录不存在，请检查");
  }

}
