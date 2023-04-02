package org.example.liskov;

public interface IFraudChecker {
    void runFraudChecks() throws FraudDetectedException;
}
