package com.loiane.javaBasico.Thread.Repository;

import java.util.List;

import com.loiane.javaBasico.Thread.domain.Order;

public class OrderRepository {
    
    public List<Order> listOrdes = List.of(
        new Order(1),
        new Order(2));

    public List<Order> listOrdes() {
        return listOrdes;
    }
}
