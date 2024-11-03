package hu.petrik.szuperhosprojekt;

public class Main {

    public static void main(String[] args) {
        try {
            Kepregeny.szereplok("src/test/resources/szuperhos.txt");
            Kepregeny.szuperhosok();
        } catch (Exception e) {
            System.out.println("Hiba történt: " + e.getMessage());
        }
    }
}