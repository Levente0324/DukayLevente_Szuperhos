package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos {

    public Vasember() {
        super(150, true);
    }

    @Override
    public void kutyutKeszit() {
        Random rnd = new Random();
        double novelSzuperero = rnd.nextDouble() * 10;
        setSzuperero(mekkoraAzEreje() + novelSzuperero);
    }

    @Override
    public boolean megmentiAVilagot() {
        return mekkoraAzEreje() > 1000;
    }

    @Override
    public String toString() {
        return "Vasember: " + super.toString();
    }
}
