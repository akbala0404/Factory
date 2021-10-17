package com.company;

public class Main {

    public static void main(String[] args) {
		InstrumentFactory factory =new PianoFactory();
		Instruments instruments= factory.createOrchestra();
		instruments.display();

		factory=new ViolinFactory();
		Instruments instruments1= factory.createOrchestra();
		instruments1.display();
    }
}
