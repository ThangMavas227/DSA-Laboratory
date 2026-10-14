package Problem03_BatteryScan;

public class BatteryScan {
    public static BatteryResult scan (long[] a, long r) {
        long inspections = 0;
        for (int i = 0; i < a.length; i++) {
            inspections++;
            if (a[i] >= r)
                return new BatteryResult(true, i, inspections);
        }
        return new BatteryResult(false, -1, inspections);
    }
}
