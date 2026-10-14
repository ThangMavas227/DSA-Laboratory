package Problem04_MuseumCatalogue;
import java.util.Arrays;

public class TestDriver {
    public static void main(String[] args) {
        int[][] catalogues = {{205, 230, 260, 310, 355, 390, 440},
                {205, 230, 260, 310, 355, 390, 440},
                {205, 230, 260, 310, 355, 390, 440},
                {205, 230, 260, 310, 355, 390, 440},
                {205, 230, 260, 310, 355, 390, 440},
                {},
                {12},
                {12}
        };
        long[] targets = {390, 205, 300, 100, 500, 7, 12, 21};

        for (int i = 0; i < catalogues.length; i++) {
            System.out.println("Identifiers: " + Arrays.toString(catalogues[i]));
            System.out.println("Target: " + targets[i]);
            RecordResult r = MuseumCatalogue.binarySearch(catalogues[i], targets[i], false);
            System.out.println("Returned index: " + r.getIndex());
            MuseumCatalogue.binarySearch(catalogues[i], targets[i], true);
            System.out.println();
        }

        int[] theLastTest = catalogues[0];
        long lastIdentifier = theLastTest[theLastTest.length - 1];
        RecordResult linear = MuseumCatalogue.linearSearch(theLastTest, lastIdentifier);
        RecordResult binary = MuseumCatalogue.binarySearch(theLastTest, lastIdentifier, false);
        System.out.println("Last identifier (" + lastIdentifier + "):");
        System.out.println("Linear: index " + linear.getIndex() + ", inspected " + linear.getInspected());
        System.out.println("Binary: index " + binary.getIndex() + ", inspected " + binary.getInspected());
    }
}