package com.ewin.sos.util;

import com.ewin.sos.enums.ErrorCodeEnum;
import com.ewin.sos.vo.ResponseVo;

public class ApiUtil {

    public static <T> ResponseVo<T> successVo(T data) {
        ResponseVo<T> responseVo = new ResponseVo<>();
        responseVo.setCode(ErrorCodeEnum.OK.getErrorCode());
        responseVo.setMessage("OK");
        responseVo.setData(data);
        return responseVo;
    }
}
