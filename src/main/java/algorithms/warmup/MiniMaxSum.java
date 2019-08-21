package algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    private static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);

        int[] minArr = Arrays.copyOfRange(arr, 0, 4);
        int[] maxArr = Arrays.copyOfRange(arr, arr.length - 4, arr.length);

        System.out.println(sumArray(minArr) + " " + sumArray(maxArr));
    }

    private static long sumArray(int[] arr) {
        long sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);
        scanner.close();
    }
}
