package org.example.isp;

public class ScientificCalculator implements CalculatorDisplay {
    @Override
    public void basicView() {
        System.out.printf("basicView");
    }

    @Override
    public void programmerView() {
        throw new RuntimeException("Not supported");
    }

    @Override
    public void scientificView() {
        System.out.printf("scientificView");
    }
}
