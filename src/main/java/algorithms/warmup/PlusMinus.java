package algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {

    // Complete the plusMinus function below.
    private static void plusMinus(int[] arr) {
        int size = arr.length;
        float positiveCnt = 0;
        float negativeCnt = 0;
        float zeroCnt = 0;

        for (int value : arr) {
            if (value > 0) {
                positiveCnt += 1;
            } else if (value < 0) {
                negativeCnt += 1;
            } else {
                zeroCnt += 1;
            }
        }

        System.out.printf("%.5f\n", (positiveCnt / size));
        System.out.printf("%.5f\n", (negativeCnt / size));
        System.out.printf("%.5f\n", (zeroCnt / size));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);
        scanner.close();
    }
}
