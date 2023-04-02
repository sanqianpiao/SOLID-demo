package org.example.liskov;

import java.util.Date;

abstract class PaymentInstrument implements IPaymentInstrument, IFraudChecker {
    String name;
    String cardNumber;
    String verificationCode;
    Date expiryDate;
    String fingerprint;

    @Override
    public void validate() throws PaymentInstrumentInvalidException {
        // basic validation on name, expiryDate etc.
        if (name == null || name.isEmpty()) {
            throw new PaymentInstrumentInvalidException("Name is invalid");
        }
        // other validations
    }

    @Override
    public void runFraudChecks() throws FraudDetectedException {
        // run checks against a third-party system
    }

    void sendToPaymentGateway() throws PaymentFailedException {
        // send details to payment gateway (PG) and set fingerprint from
        // the payment gateway response
    }

    public String getFingerprint() {
        return this.fingerprint;
    }
}
