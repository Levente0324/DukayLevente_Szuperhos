package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {
    public static List<Szuperhos> szuperhosLista = new ArrayList<>();

    public static void szereplok(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] adatok = sor.split(" ");
                String hosTipus = adatok[0];
                int kutyuSzam = Integer.parseInt(adatok[1]);
                Szuperhos hos;
                if (hosTipus.equals("Vasember")) {
                    hos = new Vasember();
                } else {
                    hos = new Batman();
                }
                for (int i = 0; i < kutyuSzam; i++) {
                    ((Milliardos) hos).kutyutKeszit();
                }
                szuperhosLista.add(hos);
            }
        }
    }

    public static void szuperhosok() {
        for (Szuperhos hos : szuperhosLista) {
            System.out.println(hos);
        }
    }

    public static void main(String[] args) {
        try {
            szereplok("szuperhosok.txt");
            szuperhosok();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
