
package agh.po.lab2;


import java.util.ArrayList;
import java.util.Random;

public class Lotto6 {

    public static void main(String[] args) {


        int n = 6;

        if (args.length != n) {
            System.out.println("Podaj dokladnie 6 liczb");
            return;
        }

        ArrayList<Integer> typy = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int liczba;
            liczba = Integer.parseInt(args[i]);


            if (liczba < 1 || liczba > 49) {
                System.out.println("Liczby tylko z zakresu 1-49");
                return;
            }

            if (typy.contains(liczba)) {
                System.out.println("liczby sie nie moga powtarzac");
                return;
            }

            typy.add(liczba);

        }

        ArrayList<Integer> liczbylos = new ArrayList<>();
        Random random = new Random();

        int hits = 0;
        long proby = 0;

        long start = System.currentTimeMillis();

        while (hits < n) {
            proby++;
            liczbylos.clear();
            hits = 0;


        while (liczbylos.size() < n) {
            int liczba = random.nextInt(49) + 1;

            if (!liczbylos.contains(liczba)) {
                liczbylos.add(liczba);
            }
        }

            for (int liczba : typy) {
                if (liczbylos.contains(liczba)) {
                    hits++;
                }
            }



    }

        long stop = System.currentTimeMillis();
        long czasTrwania = stop - start;


        System.out.println("Twoje typy: " + typy);
        System.out.println("trafiono 6/6");
        System.out.println("Liczba losowan potrzebnych do pelnego trafienia: " + proby);
        System.out.println("Laczny czas dzialania programu " + czasTrwania + "ms (" + (czasTrwania / 1000.0 + "s)"));

    }

}



