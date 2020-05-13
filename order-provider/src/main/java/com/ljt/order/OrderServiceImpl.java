package com.ljt.order;

import com.ljt.IUserService;
import com.ljt.dao.OrderDao;
import com.ljt.dto.DebitRequest;
import com.ljt.dto.DebitResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 * 订单业务层实现
 */
@Service(value = "orderService")
public class OrderServiceImpl implements IOrderServices{
    // JTA分布式事务
    @Autowired
    JtaTransactionManager springTransactionManager;

    @Autowired
    OrderDao orderDao;

    @Autowired
    IUserService userService;

    @Override
    public DoOrderResponse doOrder(DoOrderRequest request) {
        System.out.println("run order");
        DoOrderResponse response=new DoOrderResponse();
        //order下单后调用user更新余额
        UserTransaction userTransaction=springTransactionManager.getUserTransaction();
        try {
            userTransaction.begin(); //开启事务
            orderDao.insertOrder();
            DebitResponse response1 = userService.debit(new DebitRequest());
            userTransaction.commit(); //事务提交
        }catch(Exception e){
            e.printStackTrace();
            try {
                userTransaction.rollback(); // 事务回滚
            } catch (SystemException e1) {
                e1.printStackTrace();
            }
        }
        response.setCode("000000");
        return response;
    }
}
