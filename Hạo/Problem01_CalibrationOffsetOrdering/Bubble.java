package Problem01_CalibrationOffsetOrdering;

public class Bubble {
    private int arr[];
    private long comparisons = 0;
    private long writes = 0;
    private long swaps = 0;

    public Bubble(int arr[]){
        this.arr = arr;
    }

    public int[] bubleSort(){
        for(int i = arr.length - 1; i > 0; i--){
            boolean swapped = false;
            for(int j = 0; j < i; j++){
                int temp = 0;
                comparisons++;
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+ 1] = temp;
                    swaps++;
                    writes += 2;    
                    swapped = true;               
                }
            }if(swapped == false) break;
        }return arr;
    }
public long getComparisons(){
    return comparisons;
}
public long getWrites(){
    return writes;
}
public long getSwaps(){
    return swaps;
}
}
