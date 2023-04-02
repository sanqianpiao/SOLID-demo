package org.example.liskov;

public class PaymentGatewayResponse {
    String fingerprint;

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }
}
