package com.ljt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.ZonedDateTime;

import static java.time.ZonedDateTime.now;

@Repository
public class OrderDaoImpl implements OrderDao{
    @Autowired
    JdbcTemplate orderJdbcTemplate;

    @Override
    public void insertOrder() {
        orderJdbcTemplate.execute("insert into ordertest(id,privice,msg) values(3,10,'11')");
    }
}
