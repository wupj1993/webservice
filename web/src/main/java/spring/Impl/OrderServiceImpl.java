package spring.Impl;


import spring.dao.OrderWs;
import spring.daomain.Order;

import javax.jws.WebService;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/19.9:11
 * ****************************************************
 */
@WebService
public class OrderServiceImpl implements OrderWs {
    public Order getOrderById(int id) {
        return new Order("飞机",id,66666666);
    }
}
