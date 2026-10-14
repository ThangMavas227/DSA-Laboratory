package Problem10;

public class ShortestUpload {
    public static int[] shortestUpload(int[] arr, long S) {
        int left = 0;
        long sum = 0;

        int minLength = Integer.MAX_VALUE;
        int bStart = -1;
        int bEnd = -1;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum >= S) {
                int length = right - left + 1;

                if (length < minLength) {
                    minLength = length;
                    bStart = left;
                    bEnd = right;
                }

                sum -= arr[left];
                left++;
            }
        }

        if (bStart == -1) {
            return new int[]{0, -1, -1};
        } return new int[]{minLength, bStart, bEnd};
        }
}
