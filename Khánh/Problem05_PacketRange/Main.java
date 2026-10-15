package Problem05_PacketRange;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        Arrays.sort(a);

        int first = findFirst(a, target);
        int last = findLast(a, target);

        if (first == -1) {
            System.out.println("First index: -1");
            System.out.println("Last index: -1");
            System.out.println("Count: 0");
        } else {
            int count = last - first + 1; // tần suất = last - first + 1
            System.out.println("First index: " + first);
            System.out.println("Last index: " + last);
            System.out.println("Count: " + count);
        }
    }

    // Binary search biến thể 1: tìm vị trí XUẤT HIỆN ĐẦU TIÊN của target
    static int findFirst(int[] a, int target) {
        int low = 0;
        int high = a.length - 1;
        int result = -1; 

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == target) {
                result = mid;      
                high = mid - 1;   
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    // Binary search biến thể 2: tìm vị trí XUẤT HIỆN CUỐI CÙNG của target
    static int findLast(int[] a, int target) {
        int low = 0;
        int high = a.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == target) {
                result = mid;      
                low = mid + 1;     
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}

