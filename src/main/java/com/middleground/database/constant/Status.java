package com.middleground.database.constant;

public enum Status {
    /**********************************************************************************
     * 1开头 系统模块
     **********************************************************************************/

    SUCCESS(0, "成功"),
    SYSTEM_ERROR(10001, "系统异常"),
    MISS_REQUIRED_PARAMETER(10002, "缺失必要的参数"),
    MISS_REQUIRED_PARAMETERS(10003, "请输入必填项 {0}"),
    URL_ERROR(10004, "请求URL不存在"),
    DATE_ERROR(10005, "错误的日期"),
    APITOKEN_INVALID(10006, "apiToken已失效"),
    REQUEST_INVALID(10008, "请求过期，请重新请求"),
    SIGN_ERROR(10009, "token验签失败"),


    /**********************************************************************************
     * 2开头 用户模块
     **********************************************************************************/
    ERROR_INCORRECT_USERNAME_OR_PASSWORD(20001, "账号或密码错误，请重新填写"),
    USER_IS_NOT_LOGIN(20002, "用户未登录"),
    SMS_CODE_ERROR(20003, "验证码错误"),
    ACCOUNT_NO_TRGIDTERED(20004,"该手机号未注册"),
    SMS_CODE_SENT_ERROR(20005, "验证码获取失败"),
    ERROR_ID_CARD(20006, "身份证号码不正确"),
    patient_info_no_complete(20007,"患者基本信息不完善"),
    RESTPASSWORD_ERROR(20008, "重置密码失败"),
    PASSWORD_INCONSISTENCY(20009, "密码不一致"),
    OLD_PASSWORD_ERROR(20010, "原密码错误"),
    END_TIME_INCORRECT(20011,"请输入大于当前日期的结束日期"),

    /**********************************************************************************
     * 3开头 用户购买注册模块
     **********************************************************************************/
    ORDER_FAIL(30001,"下单失败"),
    ORDER_PRICE_LESS_THAN_ZERO(30002, "支付金额小于0"),
    PAY_SUCCESS(30003, "支付成功"),
    PAY_FAIL(30004, "支付失败"),
    DOCTOR_NOT_EXIST(30011,"不存在该医生，请联系管理员"),
    SMS_CODE_PAST_DUE(30013, "验证码已过期，请重新请求"),
    REGISTERED(30014, "您已注册成功，无需重复购买"),
    PREPAY_ERROR(30015, "您已请求购买，无需重复请求"),
    PREPAY_CREATE_ERROR(30016, "生成订单失败，请联系管理员"),
    NETEASE_ACCOUNT_ERROR(30017, "网易云信账号生成失败"),

    /**
     * 4开头 我的模块
     */
    ONLY_DELETE_ONESELF_UPLOAD(40001,"只能删除自己上传的化验单"),
    DRUG_END_TIME_GT_CURRENT_DATE(40002,"服药结束日期不能超过当前日期"),


    EXPORT_EMPTY(50005, "导出内容为空"),
    NEED_FILES(50006, "未上传文件"),

    EXCEL_EXPORT_FAIL(90002, "导入失败"),
    FILE_UPLOAD_FALL(90003,"文件上传失败"),


    ;

    private Integer code;
    private String msg;

    private Status(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String getMsg(Integer code) {
        for (Status value : Status.values()) {
            if (value.getCode().equals(code)) {
                return value.msg;
            }
        }
        return "";
    }

    public Integer getCode() {
        return code;
    }

    private void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    private void setMsg(String msg) {
        this.msg = msg;
    }
}
