package Problem03_BatteryScan;

import java.util.Arrays;

public class TestDriver {
    public static void main(String[] args) {
        long[][] charges = {
                {20, 75, 40, 90, 60},
                {15, 30, 45, 60},
                {},
                {0, 50, 100},
                {10, 80, 50, 80, 90}
        };
        long[] requirement = {60, 40, 60, 0, 80};

        for (int i = 0; i < charges.length; i++) {
            BatteryResult bat = BatteryScan.scan(charges[i], requirement[i]);
            System.out.println("Charges: " + Arrays.toString(charges[i]));
            System.out.println("Requirement: " + requirement[i]);
            System.out.println("Found: " + bat.isFound());
            System.out.println("First sufficient index: " + bat.getSufficientIndex());
            System.out.println("Inspections: " +  bat.getInspections());
            System.out.println();
        }

    }

}
