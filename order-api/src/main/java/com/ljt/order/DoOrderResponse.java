package com.ljt.order;

import java.io.Serializable;

/**
 * 响应
 */
public class DoOrderResponse implements Serializable {
    private static final long serialVersionUID = -187562731928095789L;

    /**
     * 响应数据
     */
    private Object data;

    /**
     * 响应状态码
     */
    private String code;

    /**
     * 备注
     */
    private String remark;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "DoOrderResponse{" +
                "data=" + data +
                ", code='" + code + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
