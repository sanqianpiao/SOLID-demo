package org.example.liskov;

class PaymentProcessor {
    void process(OrderDetails orderDetails, PaymentInstrument paymentInstrument) {
        try {
            paymentInstrument.validate();
            paymentInstrument.runFraudChecks();
            paymentInstrument.sendToPaymentGateway();
            saveToDatabase(orderDetails, paymentInstrument);
        } catch (PaymentInstrumentInvalidException e) {
            throw new RuntimeException(e);
        } catch (FraudDetectedException e) {
            throw new RuntimeException(e);
        } catch (PaymentFailedException e) {
            throw new RuntimeException(e);
        }
    }

    void saveToDatabase(
            OrderDetails orderDetails,
            PaymentInstrument paymentInstrument) {
        String fingerprint = paymentInstrument.getFingerprint();
        // save fingerprint and order details in DB
    }
}
