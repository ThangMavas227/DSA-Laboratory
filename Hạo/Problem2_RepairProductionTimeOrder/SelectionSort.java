package Problem2_RepairProductionTimeOrder;

public class SelectionSort {
    private int arr[];
    public SelectionSort(int arr[]){
        this.arr = arr;
    }

    private long comparisons = 0;
    private long swaps = 0;
    private long writes = 0;

    public int[] selectionSort(){
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                comparisons++;
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;

                swaps++;
                writes +=2;
            }
        }
        return arr;
    }

    public long getComparisons(){
    return comparisons;
}

    public long getSwaps(){
    return swaps;
}

    public long getWrites(){
    return writes;
}
}
