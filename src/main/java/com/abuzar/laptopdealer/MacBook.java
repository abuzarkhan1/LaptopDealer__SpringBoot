package com.abuzar.laptopdealer;

public class MacBook implements Brand{


    Processors processors;
    public MacBook(Processors processors) {
        this.processors = processors;
    }

    @Override
    public void showDetails() {
        System.out.println("You have Purchased Macbook With "+ processors.showProcessorDetails()  + " "  + "Processor");
    }
}
