package Problem01_CalibrationOffsetOrdering;

public class Selection {
    private int arr[];
    private long comparisons = 0;
    private long writes = 0;
    private long swaps = 0;

    public Selection(int arr[]){
        this.arr = arr;
    }

    public int[] SelectionSort(){
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                comparisons++;
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            if(minIndex != i){
                int temp =  arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swaps++;
                writes += 2;
            }
        }
        return arr;
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
