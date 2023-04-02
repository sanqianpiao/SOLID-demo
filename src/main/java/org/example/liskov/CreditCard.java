package org.example.liskov;


class CreditCard extends PaymentInstrument {

    @Override
    void validate() throws PaymentInstrumentInvalidException {
        super.validate();
        // additional validations for credit cards
    }
    // other credit card-specific code
}
