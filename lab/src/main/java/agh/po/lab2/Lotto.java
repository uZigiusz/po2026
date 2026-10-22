
package agh.po.lab2;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 6;
        int[] typy = new int[n];

        System.out.println("Podaj 6 różnych liczb z zakresu 1-49:");

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbę " + (i + 1) + ": ");

            typy[i] = scanner.nextInt();

            if (typy[i] < 1 || typy[i] > 49) {
                System.out.println("tylko z zakresu 1-49.");
                scanner.close();
                return;
            }

            for (int j = 0; j < i; j++) {
                if (typy[i] == typy[j]) {
                    System.out.println("nie mozna powtarzac");
                    scanner.close();
                    return;
                }
            }
        }

        scanner.close();

        int[] liczbylos = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int liczba;

            do {
                liczba = random.nextInt(49) + 1;
            } while (czyZawiera(liczbylos, liczba, i));

            liczbylos[i] = liczba;
        }

        int hits = 0;

        for (int userNum : typy) {
            if (czyZawiera(liczbylos, userNum, n)) {
                hits++;
            }
        }

        System.out.println();
        System.out.println("Twoje typy: " + Arrays.toString(typy));
        System.out.println("Wylosowane liczby: " + Arrays.toString(liczbylos));
        System.out.println("Liczba trafień: " + hits);
    }

    public static boolean czyZawiera(int[] arr, int liczba, int koniec) {
        for (int i = 0; i < koniec; i++) {
            if (arr[i] == liczba) {
                return true;
            }
        }

        return false;
    }
}
