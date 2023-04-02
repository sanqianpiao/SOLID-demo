package org.example.liskov;

public class RewardsCard implements IPaymentInstrument {
    String name;
    String cardNumber;


    @Override
    public void validate() throws PaymentInstrumentInvalidException {

    }

    @Override
    public PaymentResponse collectPayment() throws PaymentFailedException {
        PaymentResponse response = new PaymentResponse();
        response.setIndentifier(cardNumber);
        return response;
    }
}
