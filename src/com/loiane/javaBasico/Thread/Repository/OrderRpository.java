package com.loiane.javaBasico.Thread.Repository;

import com.loiane.javaBasico.Thread.domain.Order;
import com.loiane.javaBasico.Thread.domain.Payment;
import com.loiane.javaBasico.Thread.domain.Products;

public class OrderRpository {

    public Order getOrder() {

        Products product = new Products(1, "mascara", "negociada");

        Payment payment = new Payment(25, "cartao", null);
        
        Order order = new Order(null, "Aguardando Pagamento", product, payment);

        return order;
    }
}
