package com.easypan.entity.enums;


public enum ResponseCodeEnum {
    CODE_200(200, "Request Successful"),
    CODE_404(404, "Request Address Not Found"),
    CODE_600(600, "Request Parameter Error"),
    CODE_601(601, "Information Already Exists"),
    CODE_500(500, "Server Returned an Error, Please Contact the Administrator"),
    CODE_901(901, "Session Timeout, Please Log in Again"),
    CODE_902(902, "Share Link Does Not Exist or Has Expired"),
    CODE_903(903, "Share Validation Expired, Please Revalidate"),
    CODE_904(904, "Insufficient Disk Space, Please Expand");
    private Integer code;

    private String msg;

    ResponseCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
