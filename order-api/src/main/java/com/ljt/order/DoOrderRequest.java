package com.ljt.order;

import java.io.Serializable;

/**
 * 请求
 */
public class DoOrderRequest implements Serializable {
    private static final long serialVersionUID = -8963022784725130006L;

    private String name;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoOrderRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
