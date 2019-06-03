package com.neuedu.Test03;



public class InstrumentTest {
    public static void main(String[] args) {
        Instrument instrument=new Wind();
        instrument.play();
        System.out.println();

        Instrument instrument1=new Brass();
        instrument1.play();

    }

}
