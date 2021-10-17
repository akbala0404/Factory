package com.company;

public class PianoFactory implements InstrumentFactory{
    @Override
    public Instruments createOrchestra() {
        return new Piano();
    }
}
