package com.abuzar.laptopdealer;

public class Lenovo implements Brand{

    Processors processors;
    public Lenovo(Processors processors) {
        this.processors = processors;
    }

    @Override
    public void showDetails() {
        System.out.println("You Have Purchased Lenovo With " + processors.showProcessorDetails() + " " +  "Processor");
    }
}
