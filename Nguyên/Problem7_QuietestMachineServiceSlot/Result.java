package Problem7_QuietestMachineServiceSlot;

public class Result {
    public long minSum;
    public int startIndex;
    public int endIndex;
    public long operationsCount; 

    public Result(long minSum, int startIndex, int endIndex, long operationsCount) {
        this.minSum = minSum;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.operationsCount = operationsCount;
    }

    @Override
    public String toString() {
        return "Min Sum " + minSum + 
               " | index: [" + startIndex + ", " + endIndex + "]" + 
               " | operations: " + operationsCount;
    }
}