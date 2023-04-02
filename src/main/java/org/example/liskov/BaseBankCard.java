package org.example.liskov;

public class BaseBankCard implements IPaymentInstrument {
    IPaymentInstrumentValidator basicValidator;
    IFraudChecker fraudChecker;
    IPaymentGatewayHandler gatewayHandler;

    public BaseBankCard(IPaymentInstrumentValidator basicValidator, IFraudChecker fraudChecker, IPaymentGatewayHandler gatewayHandler) {
        this.basicValidator = basicValidator;
        this.fraudChecker = fraudChecker;
        this.gatewayHandler = gatewayHandler;
    }

    @Override
    public void validate() throws PaymentInstrumentInvalidException {
        basicValidator.validate();
    }

    @Override
    public PaymentResponse collectPayment() throws PaymentFailedException {
        PaymentResponse response = new PaymentResponse();
        try {
            fraudChecker.runFraudChecks();
            PaymentGatewayResponse paymentGatewayResponse = gatewayHandler.handlePayment();
            response.setIndentifier(paymentGatewayResponse.getFingerprint());
        } catch (FraudDetectedException e) {
            //exception handling
        }

        return response;
    }
}
