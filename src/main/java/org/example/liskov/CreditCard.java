package org.example.liskov;


class CreditCard extends BaseBankCard {

    public CreditCard(IPaymentInstrumentValidator basicValidator, IFraudChecker fraudChecker, IPaymentGatewayHandler gatewayHandler) {
        super(basicValidator, fraudChecker, gatewayHandler);
    }

    @Override
    public void validate() throws PaymentInstrumentInvalidException {
        basicValidator.validate();
        // additional validations for credit cards
    }
}
