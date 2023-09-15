package com.loiane.javaBasico.Thread.test;

import com.loiane.javaBasico.Thread.Repository.OrderRpository;
import com.loiane.javaBasico.Thread.bean.OrderService;
import com.loiane.javaBasico.Thread.bean.PaymentService;
import com.loiane.javaBasico.Thread.bean.ProductsService;
import com.loiane.javaBasico.Thread.domain.Order;
@SuppressWarnings("all")
public class OrderControllerTwo {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Thread thread2 = new Thread(() -> newOrder());
            Thread thread3 = new Thread(() -> newOrder());
            Thread thread4 = new Thread(() -> newOrder());
            Thread thread5 = new Thread(() -> newOrder());
            Thread thread6 = new Thread(() -> newOrder());
            
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
            thread6.start();
            
        }
        
    }

    public static synchronized void newOrder() {
        System.out.println(Thread.currentThread().getName());
        var orderRepository = new OrderRpository();
        var orderService = new OrderService();
        var paymentService = new PaymentService();
        var productService = new ProductsService();

        var order = orderRepository.getOrder();

        System.out.println("\n-----------------------------------------\n");
        
        order.setId(1);

        System.out.println("alterando status do pedido");

        confirm(order, orderService, paymentService, productService);

        System.out.println("pagamento confirmado");

        System.out.println(order);

        System.out.println("\n-----------------------------------------\n");
    }

    public static Order confirm(Order order, OrderService orderService,
            PaymentService paymentService, ProductsService productsService) {

        synchronized (order.getId()) {

            orderService.confirmPaymentOrder(order);
            productsService.confirmPaymentProducts(order.getProducts());
            paymentService.confirmPayment(order.getPayment());
        }

        return order;

    }

}
