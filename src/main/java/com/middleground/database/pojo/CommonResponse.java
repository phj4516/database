package com.middleground.database.pojo;

import com.middleground.database.constant.Status;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * 自定义返回类
 *
 * @author jinzhiyuan
 * @create 2020-08-19 14:56
 **/
@Data
public class CommonResponse<T> implements Serializable {

    private int code;
    private String msg;
    private T data;
    private Date timestamp = new Date();

    public CommonResponse() {
        this(Status.SUCCESS.getCode(), Status.SUCCESS.getMsg());
    }

    public CommonResponse(int code, String msg) {
        this(null, code, msg);
    }

    public CommonResponse(T data) {
        this(data, Status.SUCCESS.getCode(), Status.SUCCESS.getMsg());
    }

    public CommonResponse(T data, int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }

}
