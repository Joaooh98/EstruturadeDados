package com.loiane.javaBasico.Thread.test;

import java.util.List;

import com.loiane.javaBasico.Thread.Repository.OrderRepository;
import com.loiane.javaBasico.Thread.domain.Order;

public class OrderController {
    public static void main(String[] args) {
        var orderRepository = new OrderRepository();
        
        List<Order> list = orderRepository.listOrdes();

        for (Order order : list) {
            System.out.println(order.getId());
        }
    }
}
