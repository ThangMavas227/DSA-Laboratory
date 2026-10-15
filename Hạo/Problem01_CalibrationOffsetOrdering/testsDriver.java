package Problem01_CalibrationOffsetOrdering;
import java.util.Arrays;
public class testsDriver {
    public static void main(String[] args) {
       int tests[][] = {
        {7,-3,4,0,-3,9},
        {-3,-3,0,4,7,9},
        {9,7,4,0,-3,-3},
        {-3,-3,4,0,7,9},
        {},
        {5},
        {4,4,4,4}
       };

       String [] testNames = {
        "Unordered","Already Sorted","Opposite Order","Nearly Sorted","Emty Array","Singel Value","All Equal"
       };

       for(int t = 0; t < tests.length; t++){
        int[] arr = tests[t];
        System.out.println("Test: " + testNames[t]);
        System.out.println("Original: " + Arrays.toString(arr));
       

        int[] bubbleArr = arr.clone();
        int[] selectionArr = arr.clone();
        int[] insertionArr = arr.clone();


        Bubble bublle = new Bubble(bubbleArr);
        Selection select = new Selection(selectionArr);
        Insertion insert =  new Insertion(insertionArr);

        bublle.bubleSort();
        select.SelectionSort();
        insert.insertionSort();

        System.out.println("Bubble sort: " +  Arrays.toString(bubbleArr));
        System.out.println("Comparisons: " + bublle.getComparisons());
        System.out.println("Writes: " + bublle.getWrites());
        System.out.println("Swaps: " + bublle.getSwaps());
        System.out.println();

        System.out.println("Selection sort: " +  Arrays.toString(selectionArr));
        System.out.println("Comparisons: " + select.getComparisons());
        System.out.println("Writes: " + select.getWrites());
        System.out.println("Swaps: " + select.getSwaps());
        System.out.println();

        System.out.println("Insertion sort: " +  Arrays.toString(insertionArr));
        System.out.println("Comparisons: " + insert.getComparisons());
        System.out.println("Writes: " + insert.getWrites());
        System.out.println("Shifts: " + insert.getShifts());
        System.out.println();
    }
}
}
