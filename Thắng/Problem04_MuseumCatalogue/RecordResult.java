package Problem04_MuseumCatalogue;

public class RecordResult {
    private final int index;
    private final long inspected;

    public RecordResult(int index, long inspected) {
        this.index = index;
        this.inspected = inspected;
    }

    public int getIndex() {
        return index;
    }

    public long getInspected() {
        return inspected;
    }
}