package Nguyen.Problem12_RecentlyUsedStationCache;
import java.util.HashMap;
import java.util.Map;
public class LRUCache {
    private final int capacity;
    private final Map<Integer, Node> map;
    private final DoublyLinkedList list;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.list = new DoublyLinkedList();
    }
    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        list.moveToFirst(node);
        return node.value;
    }  
      public void put(int key, int value) {
        Node node = map.get(key);
        if (node != null) {
            node.value = value;
            list.moveToFirst(node);
        } else {
            // Chưa tồn tại -> Tạo mới
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            list.addFirst(newNode);
            if (map.size() > capacity) {
                Node tailNode = list.removeLast(); 
                map.remove(tailNode.key);     
            }
        }
    }
}