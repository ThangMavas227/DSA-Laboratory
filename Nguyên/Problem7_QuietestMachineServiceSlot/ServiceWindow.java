package Problem7_QuietestMachineServiceSlot;

public class ServiceWindow {

    // a
    public static Result calculateIndependentSum(int[] arr, int k) {
        if (k < 1 || k > arr.length) {
            throw new IllegalArgumentException("Invalid window size k");
        }
        
        long bestSum = Long.MAX_VALUE;
        int bestStart = -1;
        long opsCount = 0; 
        
        for (int i = 0; i <= arr.length - k; i++) {
            long currentSum = 0;
            for (int j = 0; j < k; j++) {
                currentSum += arr[i + j];
                opsCount++; 
            }
            if (currentSum < bestSum) {
                bestSum = currentSum;
                bestStart = i;
            }
        }

        return new Result(bestSum, bestStart, bestStart + k - 1, opsCount);
    }

    //b
    public static Result calculateSlidingWindow(int[] arr, int k) {
        if (k < 1 || k > arr.length) {
            throw new IllegalArgumentException("Invalid window size k");
        }
        
        long currentSum = 0;
        long opsCount = 0; 
        
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
            opsCount++; 
        }
        
        long bestSum = currentSum;
        int bestStart = 0;
        
        for (int right = k; right < arr.length; right++) {
            currentSum = currentSum - arr[right - k] + arr[right];
            opsCount += 2; 
            if (currentSum < bestSum) {
                bestSum = currentSum;
                bestStart = right - k + 1;
            }
        }
        
        return new Result(bestSum, bestStart, bestStart + k - 1, opsCount);
    }
}