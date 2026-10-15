package Problem2_RepairProductionTimeOrder;
import java.util.Arrays;
public class testsDrive {
    public static void main(String[] args) {
       int[][] tests = {
        {1, 2, 4, 3, 5, 6, 8, 7, 9, 10},
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
        {10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
        {},
        {5},
        {3, 1, 3, 2, 2}
       };

       String[] testNames = {
       "Nearly Sorted","Ascending","Descending","Empty Array","Single Value","Repeated Values"
       };

       for(int t = 0; t < tests.length; t++){
        int[] arr = tests[t];
        System.out.println("Test: " + testNames[t]);
        System.out.println("Original: " + Arrays.toString(arr));

        int[] selectionArr = arr.clone();
        int[] insertionArr = arr.clone();

        

        SelectionSort select = new SelectionSort(selectionArr);
        InsertionSort insert =  new InsertionSort(insertionArr);

        select.selectionSort();
        insert.insertionSort();
        
       System.out.println("Selection sort: " + Arrays.toString(selectionArr));
       System.out.println("Comparisons: " + select.getComparisons());
       System.out.println("Writes: " + select.getWrites());
       System.out.println("Swaps: " + select.getSwaps());
       System.out.println();

       System.out.println("Insertion sort: " + Arrays.toString(insertionArr));
       System.out.println("Comparisons: " + insert.getComparisons());
       System.out.println("Writes: " + insert.getWrites());
       System.out.println("Shifts: " + insert.getShifts());
       System.out.println();
    }
}
}
