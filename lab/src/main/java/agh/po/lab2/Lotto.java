
package agh.po.lab2;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 6;
        int[] userTypes = new int[n];

        System.out.println("Podaj 6 różnych liczb z zakresu 1-49:");

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj liczbę " + (i + 1) + ": ");

            if (!scanner.hasNextInt()) {
                System.out.println("Błąd! Musisz podać liczbę całkowitą.");
                scanner.close();
                return;
            }

            userTypes[i] = scanner.nextInt();

            if (userTypes[i] < 1 || userTypes[i] > 49) {
                System.out.println("Błąd! Liczba musi być z zakresu 1-49.");
                scanner.close();
                return;
            }

            for (int j = 0; j < i; j++) {
                if (userTypes[i] == userTypes[j]) {
                    System.out.println("Błąd! Nie można podawać powtarzających się liczb.");
                    scanner.close();
                    return;
                }
            }
        }

        scanner.close();

        int[] drawnNumbers = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int liczba;

            do {
                liczba = random.nextInt(49) + 1;
            } while (czyZawiera(drawnNumbers, liczba, i));

            drawnNumbers[i] = liczba;
        }

        int hits = 0;

        for (int userNum : userTypes) {
            if (czyZawiera(drawnNumbers, userNum, n)) {
                hits++;
            }
        }

        System.out.println();
        System.out.println("Twoje typy: " + Arrays.toString(userTypes));
        System.out.println("Wylosowane liczby: " + Arrays.toString(drawnNumbers));
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
