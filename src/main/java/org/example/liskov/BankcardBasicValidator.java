package org.example.liskov;

public class BankcardBasicValidator implements IPaymentInstrumentValidator {
    @Override
    public void validate() throws PaymentInstrumentInvalidException {
        System.out.printf("validate");
    }
}
