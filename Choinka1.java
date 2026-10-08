public class Choinka1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            for (int n = 1; n <= i; n++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
