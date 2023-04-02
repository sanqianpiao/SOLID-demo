package org.example.liskov;

public interface IPaymentInstrument {
    void validate() throws PaymentInstrumentInvalidException;

    PaymentResponse collectPayment() throws PaymentFailedException;
}
