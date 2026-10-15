package Problem05_PacketRange;
import java.util.Arrays;

public class TestDriver {
    static void runTest(int[] sorted, int target) {
        int first = Main.findFirst(sorted, target);
        int last = Main.findLast(sorted, target);
        int count = (first == -1) ? 0 : last - first + 1;

        
        System.out.println("Sorted values: " + Arrays.toString(sorted));
        System.out.println("Target: " + target);
        System.out.println("First index: " + first);
        System.out.println("Last index: " + last);
        System.out.println("Count: " + count);
        System.out.println();
    }

    public static void main(String[] args) {
        runTest(new int[]{1, 3, 5, 7}, 5);
        runTest(new int[]{2, 2, 2, 5, 7}, 2);
        runTest(new int[]{1, 3, 9, 9, 9}, 9);
        runTest(new int[]{4, 4, 4, 4, 4}, 4);
        runTest(new int[]{1, 3, 5, 7}, 4);
        runTest(new int[]{}, 3);
    }
}