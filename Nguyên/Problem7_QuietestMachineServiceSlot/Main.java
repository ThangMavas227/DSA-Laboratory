package Problem7_QuietestMachineServiceSlot;

public class Main {
    public static void main(String[] args) {
        System.out.println("example test case");
        int[] exampleArr = {8, 2, 5, 1, 4, 2, 7};
        int exampleK = 3;
        System.out.print("arr: [");
        for (int i = 0; i < exampleArr.length; i++) System.out.print(exampleArr[i] + " ");
        System.out.println("], k = " + exampleK);
        runTest("example", exampleArr, exampleK);

        int[] kIsOne = {5, 2, 8, 1};
        runTest("k = 1", kIsOne, 1);

        int[] kIsN = {3, 1, 4};
        runTest("k = n", kIsN, 3);

        int[] allZeros = {0, 0, 0, 0};
        runTest("all 0", allZeros, 2);

        int[] equalPositive = {5, 5, 5, 5};
        runTest("equal positive", equalPositive, 2);

        int[] earliestTie = {2, 1, 2, 1}; 
        runTest("earliest tie", earliestTie, 2);

        int[] largeSum = {Integer.MAX_VALUE, 10, Integer.MAX_VALUE};
        runTest("large sum", largeSum, 2);
        
        try {
            ServiceWindow.calculateSlidingWindow(exampleArr, 0); 
            System.out.println("k=0 failed to catch exception");
        } catch (IllegalArgumentException e) {
            System.out.println("k=0 Caught exception: " + e.getMessage());
        }

        try {
            ServiceWindow.calculateSlidingWindow(exampleArr, 10); // k > n
            System.out.println("k>n failed to catch exception");
        } catch (IllegalArgumentException e) {
            System.out.println("k>n Caught exception: " + e.getMessage());
        }
    }

    private static void runTest(String testName, int[] arr, int k) {
        System.out.println("test " + testName);
        
        Result resA = ServiceWindow.calculateIndependentSum(arr, k);
        System.out.println("method a " + resA);
        
        Result resB = ServiceWindow.calculateSlidingWindow(arr, k);
        System.out.println("method b " + resB);

        if (resA.minSum == resB.minSum && resA.startIndex == resB.startIndex) {
            System.out.println("same result");
            if (resA.operationsCount != resB.operationsCount) {
                long difference = resA.operationsCount - resB.operationsCount;
                System.out.println("method B " + difference + " operations less than method A");
            }
        } else {
            System.out.println("different results");
        }
    }
}