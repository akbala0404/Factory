package com.company;

public class ViolinFactory implements InstrumentFactory{
    @Override
    public Instruments createOrchestra() {
        return new Violin();
    }
}
