package org.example.liskov;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        CreditCard creditCard = new CreditCard(new BankcardBasicValidator(), new ThirdpartyFraudChecker(), new PaymentGatewayHandler());
        DebitCard debitCard = new DebitCard(new BankcardBasicValidator(), new ThirdpartyFraudChecker(), new PaymentGatewayHandler());
        RewardsCard rewardsCard = new RewardsCard();

        processor.process(new OrderDetails(), creditCard);
        processor.process(new OrderDetails(), debitCard);
        processor.process(new OrderDetails(), rewardsCard);
    }
}
