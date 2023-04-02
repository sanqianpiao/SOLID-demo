package org.example.isp;

public class ScientificCalculator implements BasicDisplay, ScientificDisplay {
    @Override
    public void basicView() {
        System.out.printf("ScientificCalculator: basicView");
    }

    @Override
    public void scientificView() {
        System.out.printf("ScientificCalculator: scientificView");
    }
}
