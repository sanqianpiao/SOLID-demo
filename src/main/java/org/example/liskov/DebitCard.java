package org.example.liskov;

class DebitCard extends BaseBankCard {
    public DebitCard(IPaymentInstrumentValidator basicValidator, IFraudChecker fraudChecker, IPaymentGatewayHandler gatewayHandler) {
        super(basicValidator, fraudChecker, gatewayHandler);
    }
    // debit card-specific code
}
