package com.ljt.order;

/**
 * 订单接口
 */
public interface IOrderServices {
    /*
     * 下单操作
     */
    DoOrderResponse doOrder(DoOrderRequest request);
}
