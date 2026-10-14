package Problem03_BatteryScan;

public class BatteryResult {
    private boolean found;
    private long sufficientIndex;
    private long inspections;

    public BatteryResult(boolean found, long sufficientIndex,long inspections) {
        this.inspections = inspections;
        this.sufficientIndex = sufficientIndex;
        this.found = found;
    }

    public boolean isFound() {
        return found;
    }

    public long getSufficientIndex() {
        return sufficientIndex;
    }

    public long getInspections() {
        return inspections;
    }
}
