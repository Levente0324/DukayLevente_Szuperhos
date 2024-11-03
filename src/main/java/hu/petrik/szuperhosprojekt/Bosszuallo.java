package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }

    @Override
    public boolean legyoziE(Szuperhos masikSzuperhos) {
        if (masikSzuperhos instanceof Batman) {
            return this.szuperero >= 2 * masikSzuperhos.mekkoraAzEreje();
        }
        return masikSzuperhos.mekkoraAzEreje() < this.szuperero && ((Bosszuallo) masikSzuperhos).isVanEGyengesege();
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    @Override
    public String toString() {
        String gyengeseg = vanEGyengesege ? "van gyengesége" : "nincs gyengesége";
        return MessageFormat.format("Szupererő: {0,number,#.##}; {1}", szuperero, gyengeseg);
    }

    public double getSzuperero() {
        return szuperero;
    }

    public void setVanEGyengesege(boolean b) {
        this.vanEGyengesege = b;
    }
}
