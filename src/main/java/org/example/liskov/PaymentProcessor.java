package org.example.liskov;

class PaymentProcessor {
    void process(OrderDetails orderDetails, IPaymentInstrument paymentInstrument) {
        try {
            paymentInstrument.validate();

            PaymentResponse paymentResponse = paymentInstrument.collectPayment();
            saveToDatabase(orderDetails, paymentResponse.getIndentifier());
        } catch (PaymentInstrumentInvalidException e) {
            throw new RuntimeException(e);
        } catch (PaymentFailedException e) {
            throw new RuntimeException(e);
        }
    }

    void saveToDatabase(
            OrderDetails orderDetails,
            String identifier) {
        // save fingerprint and order details in DB
        System.out.printf("save fingerprint and order details in DB");
    }
}
