package com.abuzar.laptopdealer;

public class Dell implements Brand{

    Processors processors;
    public Dell(Processors processors) {
        this.processors = processors;
    }


    @Override
    public void showDetails() {
        System.out.println("dell" + processors.showProcessorDetails());
    }
}
