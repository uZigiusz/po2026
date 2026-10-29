package agh.po.lab3;

public class CodingBat {


    boolean doubleX(String str) {
        ;
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all


        if (i + 1 >= str.length()) return false;
        return str.substring(i + 1, i + 2).equals("x");


    }

    public int last2(String str) {
        // Screen out too-short string case.
        if (str.length() < 2) return 0;

        String end = str.substring(str.length()-2);
        // Note: substring() with 1 value goes through the end of the string
        int count = 0;

        // Check each substring length 2 starting at i
        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }

    public String stringTimes(String str, int n) {
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + str;  // could use += here
        }
        return result;
    }


    public static void main(String[] args) {

        CodingBat newobj1 = new CodingBat();
        System.out.println(newobj1);
        System.out.println(newobj1.doubleX("axxbb"));
        System.out.println(newobj1.doubleX("xaxx"));
        System.out.println(newobj1.last2("hixxhi"));
        System.out.println(newobj1.stringTimes("hi", 2));




    }
}



