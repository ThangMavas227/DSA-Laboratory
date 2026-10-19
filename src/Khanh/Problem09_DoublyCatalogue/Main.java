package Problem09_DoublyCatalogue;

public class Main {
    static void show(TransitItinerary<Integer> l) {
        System.out.print("  FORWARD : ");
        l.FORWARD();
        System.out.print("  BACKWARD: ");
        l.BACKWARD();
    }

    public static void main(String[] args) {
        System.out.println("Test 1: empty list");
        TransitItinerary<Integer> a = new TransitItinerary<>();
        show(a);
        System.out.println("  REMOVE 5: " + a.REMOVE(5));

        System.out.println("Test 2: singleton");
        TransitItinerary<Integer> b = new TransitItinerary<>();
        b.ADD_FIRST(1);
        show(b);
        System.out.println("  REMOVE 1: " + b.REMOVE(1));
        show(b);
        b.ADD_LAST(2);
        show(b);

        System.out.println("Test 3: delete at both ends");
        TransitItinerary<Integer> c = new TransitItinerary<>();
        c.ADD_LAST(1); c.ADD_LAST(2); c.ADD_LAST(3);
        System.out.println("  REMOVE 1 (head): " + c.REMOVE(1));
        show(c);
        System.out.println("  REMOVE 3 (tail): " + c.REMOVE(3));
        show(c);
        System.out.println("  REMOVE 2 (last node): " + c.REMOVE(2));
        show(c);

        System.out.println("Test 4: duplicate keys");
        TransitItinerary<Integer> d = new TransitItinerary<>();
        d.ADD_LAST(5); d.ADD_LAST(7); d.ADD_LAST(5); d.ADD_LAST(5);
        show(d);
        System.out.println("  REMOVE 5: " + d.REMOVE(5));
        show(d);
        System.out.println("  REMOVE 5: " + d.REMOVE(5));
        show(d);
        System.out.println("  REMOVE 9: " + d.REMOVE(9));
        show(d);

        System.out.println("Test 5: alternating head/tail additions");
        TransitItinerary<Integer> e = new TransitItinerary<>();
        e.ADD_FIRST(1); e.ADD_LAST(2); e.ADD_FIRST(3); e.ADD_LAST(4);
        show(e);
    }
    
}
