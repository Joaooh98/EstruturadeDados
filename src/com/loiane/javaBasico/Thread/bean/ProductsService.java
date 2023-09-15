package com.loiane.javaBasico.Thread.bean;

import com.loiane.javaBasico.Thread.domain.Products;

public class ProductsService {
    
    public void confirmPaymentProducts(Products products){
        products.setStatusReserve("Aprovado");;
    }
}
