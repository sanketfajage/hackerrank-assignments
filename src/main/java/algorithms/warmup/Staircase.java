package algorithms.warmup;

import java.util.Scanner;

public class Staircase {

    // Complete the staircase function below.
    private static void staircase(int n) {
        for (int j = 0; j < n; j++) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i < n - j ? " " : "#");
            }
            System.out.println("");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        staircase(n);
        scanner.close();
    }
}
