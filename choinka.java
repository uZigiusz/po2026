import java.util.Scanner;
public class choinka {

    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.print("How many stars: ");
        int x = sc.nextInt();
        System.out.println();

        for(int i = 1; i <= x; i++){
            for(int n = 1; n <=i; n++){
                System.out.print("*");
            }
        
        System.out.print("\n");
        }
    }
}


