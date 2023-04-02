package org.example.liskov;

public interface IPaymentInstrumentValidator {
    void validate() throws PaymentInstrumentInvalidException;
}
