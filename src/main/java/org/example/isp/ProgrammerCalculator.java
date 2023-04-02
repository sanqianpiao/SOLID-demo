package org.example.isp;

public class ProgrammerCalculator implements BasicDisplay, ProgrammerDisplay {
    @Override
    public void basicView() {
        System.out.printf("ProgrammerCalculator: basicView");
    }

    @Override
    public void programmerView() {
        System.out.printf("ProgrammerCalculator: programmerView");
    }
}
