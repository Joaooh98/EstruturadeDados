package com.loiane.javaBasico.Thread.bean;

import com.loiane.javaBasico.Thread.domain.Order;

public class OrderService {
    
    public void confirmPaymentOrder(Order order){
        order.setStatus("Aguardando Faturamento");
    }
}
