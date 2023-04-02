package org.example.isp;

public class ProgrammerCalculator implements CalculatorDisplay {
    @Override
    public void basicView() {
        System.out.printf("basicView");
    }

    @Override
    public void programmerView() {
        System.out.printf("programmerView");
    }

    @Override
    public void scientificView() {
        throw new RuntimeException("Not supported");
    }
}
