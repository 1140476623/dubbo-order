package com.ljt;

import com.ljt.order.DoOrderRequest;
import com.ljt.order.IOrderServices;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //将"service-common.xml","service-order.xml","service-provider.xml"复制到classpath下测试
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]
                {"service-common.xml","service-order.xml","service-provider.xml"});
        IOrderServices orderService = (IOrderServices) context.getBean("orderService");
        orderService.doOrder(new DoOrderRequest());
    }
}
