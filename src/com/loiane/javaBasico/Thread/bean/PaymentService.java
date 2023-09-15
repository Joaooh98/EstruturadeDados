package com.loiane.javaBasico.Thread.bean;

import com.loiane.javaBasico.Thread.domain.InstallmentTitle;
import com.loiane.javaBasico.Thread.domain.Payment;

public class PaymentService {
    
    public void confirmPayment(Payment payment){
        InstallmentTitle installmentTitle = new InstallmentTitle(1);
        payment.setInstallmentTitle(installmentTitle);
    }
}
