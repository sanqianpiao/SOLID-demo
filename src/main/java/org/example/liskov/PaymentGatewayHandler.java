package org.example.liskov;

public class PaymentGatewayHandler implements IPaymentGatewayHandler{
    @Override
    public PaymentGatewayResponse handlePayment() throws PaymentFailedException {
        PaymentGatewayResponse response = new PaymentGatewayResponse();
        response.setFingerprint(String.valueOf(Math.random()));
        return response;
    }
}
