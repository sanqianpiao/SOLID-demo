package org.example.liskov;

public interface IPaymentGatewayHandler {
    PaymentGatewayResponse handlePayment() throws PaymentFailedException;
}
