package agh.po.lab3;

public class CodingBat {
    boolean doubleX(String str) {

        boolean doubleX(String str) {
            int i = str.indexOf("x");
            if (i == -1) return false; // no "x" at all


            if (i+1 >= str.length()) return false;
            return str.substring(i+1, i+2).equals("x");


        }

    public static void main(String[] args) {

            CodingBat newobj1 = new CodingBat();
            System.out.println(newobj1);



        }



