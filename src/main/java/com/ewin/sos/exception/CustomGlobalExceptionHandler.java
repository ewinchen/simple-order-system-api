package com.ewin.sos.exception;

import com.ewin.sos.enums.ErrorCodeEnum;
import com.ewin.sos.vo.res.ResponseVo;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {

    // 进入Controller后发生的异常
    @ExceptionHandler
    protected ResponseEntity<ResponseVo<Object>> handleExceptionController(Throwable e) {

        ResponseVo<Object> responseVo = new ResponseVo<>();
        // 捕获自定义异常，自定义异常已包含错误码
        if (e instanceof CustomException) {
            responseVo.setCode(((CustomException) e).getErrorCode());
            responseVo.setMessage(e.getMessage());
            // 未自定义的异常，统一为系统错误，必须打印堆栈
        } else {
            e.printStackTrace();
            responseVo.setCode(ErrorCodeEnum.B0001.getErrorCode());
            responseVo.setData(e.getClass().getSimpleName() + " > " + e.getMessage());
            responseVo.setMessage("系统错误，请联系管理员");
        }
        return new ResponseEntity<>(responseVo, HttpStatus.OK);
    }

    // 没有进入Controller发生的异常
    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, @Nullable Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {

        ResponseVo<Object> responseVo = new ResponseVo<>();
        if (status.value() >= 400 && status.value() < 500) {
            responseVo.setCode(ErrorCodeEnum.A0001.getErrorCode());
            responseVo.setData(ex.getClass().getSimpleName() + " > " + ex.getMessage());
            responseVo.setMessage("请求发生错误，请联系管理员");
        } else {
            ex.printStackTrace();
            responseVo.setCode(ErrorCodeEnum.B0001.getErrorCode());
            responseVo.setMessage("系统错误，请联系管理员");
        }

        return new ResponseEntity<>(responseVo, HttpStatus.OK);
    }

}
