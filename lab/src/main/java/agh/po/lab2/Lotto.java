package agh.po.lab2;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;


public class Lotto {

    private static Scanner sc;
    public static void main(String[] args) {

        sc = new Scanner(System.in);
        int n = 6;
        int[] arr = new int[n];
        int[] arra = new int[n];


        for (int i = 0; i < 6; i++) {
            System.out.print("Type your numbers: ");
            int x = sc.nextInt();
            System.out.println();
            arra[i] = x;

        }

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int liczba;

            do {
                liczba = random.nextInt(49) + 1;
            } while (czyZawiera(arr, liczba, i));

            arr[i] = liczba;
        }

        System.out.println(Arrays.toString(arr));



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


