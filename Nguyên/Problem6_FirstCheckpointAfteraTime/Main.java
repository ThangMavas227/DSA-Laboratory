package Problem6_FirstCheckpointAfteraTime;

import java.util.Scanner;

public class Main {
        private static void runTest(int[] a, int target, int expectedIndex) {
        int actualIndex = CheckpointSearch.findFirstCheckpointAfter(a, target);
        System.out.print("target: " + target + "  expected: " + expectedIndex + "  actual: " + actualIndex + ": ");
        
        if (actualIndex == a.length) {
            System.out.println("NO CHECKPOINT");
        } else {
            System.out.println("value: " + a[actualIndex]);
        }
    }
    public static void main(String[] args) {
        int[] time = {12, 20, 20, 35, 50};
        System.out.println("testcase");
        runTest(time, 20, 3); 
        runTest(time, 26, 3);
        runTest(time, 5, 0); 
        runTest(time, 60, 5); 
        System.out.println("testcase from the problem description");
        int[] emptyTime = {};
        runTest(emptyTime, 10, 0); 
        int[] singleTime = {20};
        runTest(singleTime, 10, 0); 
        runTest(singleTime, 20, 1); 
        runTest(singleTime, 30, 1); 
        int[] allEqual = {10, 10, 10};
        runTest(allEqual, 10, 3);
        System.out.println("testcase from user input");
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a time to search (or type 'e'): ");
        
        while(scanner.hasNext()) {
            if(scanner.hasNextInt()) {
                int target = scanner.nextInt();
                int index = CheckpointSearch.findFirstCheckpointAfter(time, target);
                System.out.print("target: " + target + " -> result index: " + index + " -> ");
                if (index == time.length) {
                    System.out.println("NO CHECKPOINT");
                } else {
                    System.out.println("value: " + time[index]);
                }
                System.out.print("enter a time to search (or type 'e'): ");
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("e")) {
                    break;
                } else {
                           scanner.close();
                }
            }
        }
        scanner.close();
    }

}