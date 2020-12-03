package com.middleground.database.exception;


import com.middleground.database.constant.Status;

import java.text.MessageFormat;

/**
 * 自定义异常
 * @author jinzhiyuan
 * @date 2020-8-19
 */
public class CommonException extends RuntimeException {
    private Integer code;
    private Status status;

    public CommonException() {
        super();
    }

    public CommonException(String message) {
        super(message);
    }

    public CommonException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public CommonException(Status status , Object... params) {
        this(status.getCode(), MessageFormat.format(status.getMsg(), params));
        this.status = status;
        this.code = status.getCode();
    }

    public CommonException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommonException(Throwable cause) {
        super(cause);
    }


    public Integer getCode() {
        return code;
    }
}
