package Nguyen.Problem12_RecentlyUsedStationCache;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int capacity = scanner.nextInt();
        int q = scanner.nextInt();
        LRUCache cache = new LRUCache(capacity);
        for (int i = 0; i < q; i++) {
            String command = scanner.next();
            if (command.equals("PUT")) {
                int key = scanner.nextInt();
                int value = scanner.nextInt();
                cache.put(key, value); 
            } else if (command.equals("GET")) {
                int key = scanner.nextInt();
                int result = cache.get(key);
                System.out.println(result);
            }
        }
        scanner.close();
    }
}