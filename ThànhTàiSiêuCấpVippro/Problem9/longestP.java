package ThànhTàiSiêuCấpVippro.Problem9;

public class longestP {
    public static void longestPlaylist(int[] arr, long S) {
        int left = 0;
        long sum = 0;

        int maxLength = 0;
        int bStart = -1;
        int bEnd = -1;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > S) {
                sum -= arr[left];
                left++;
            }

            int length = right - left + 1;

            if (length > maxLength) {
                maxLength = length;
                bStart = left;
                bEnd = right;
            }
        }

        if(maxLength == 0 ){
            System.out.println("Length: 0");
            System.out.println("Start index: -1");
            System.out.println("End index: -1");
        } else {
            System.out.println("Maximum length: " + maxLength);
            System.out.println("Start index: " + bStart);
            System.out.println("End index: " + bEnd);
        }

        if(maxLength > 0) {
            System.out.println("Selected total: " + SumOB.sumOfBest(arr, bStart, bEnd));
        } else {
            System.out.println("Selected total: 0");
        }
    }
}
