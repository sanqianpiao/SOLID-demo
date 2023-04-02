package org.example.liskov;

import lombok.AllArgsConstructor;


public class PaymentInstrumentInvalidException extends Exception {
    public PaymentInstrumentInvalidException(String message) {
        super(message);
    }
}
