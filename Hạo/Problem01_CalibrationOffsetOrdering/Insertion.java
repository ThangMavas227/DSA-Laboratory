package Problem01_CalibrationOffsetOrdering;
public class Insertion {
    private int arr[];
    private long comparisons = 0;
    private long writes = 0;
    private long shifts = 0;

    public Insertion(int arr[]){
        this.arr = arr;
    }

    public int[] insertionSort(){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
           while(j >= 0){
            comparisons++;
            if(arr[j] > key){
                arr[j + 1] = arr[j];
                writes++;
                shifts++;
                j--;
            }else{
                break;
            }
           }
           arr[j + 1] = key;
        writes++;
        }
        return arr;
    }
public long getComparisons(){
    return comparisons;
}

public long getWrites(){
    return writes;
}
public long getShifts(){
    return shifts;
}
}
