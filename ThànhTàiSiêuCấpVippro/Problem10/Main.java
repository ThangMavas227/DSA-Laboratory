package ThànhTàiSiêuCấpVippro.Problem10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 7, 3, 4};
        long S = 10;

        int[] result = ShortestUpload.shortestUpload(arr, S);

        System.out.println("Result: " + Arrays.toString(result));
        System.out.println("Minimum length: " + result[0]);
        System.out.println("Start index: " + result[1]);
        System.out.println("End index: " + result[2]);

        if (result[0] > 0) {
            long total = SumOfBest.sumOfBest(arr, result[1], result[2]);
            System.out.println("Selected total: " + total);
        } else {
            System.out.println("Selected total: 0");
        }
    }
}
