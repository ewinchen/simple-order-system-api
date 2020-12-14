package com.ewin.sos.vo.res;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseVo<T> implements Serializable {

    private static final long serialVersionUID = -3904436750661962325L;

    private String code;

    private String message;

    private T data;

}
