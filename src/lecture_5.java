import java.util.*;

public class lecture_5 {
    public static void main(String[] args) {
        Map<Integer, String> testMap = new HashMap<Integer, String>();
        testMap.put(2, "two");
        testMap.put(null, "null");
        testMap.put(1, "one");
        testMap.putIfAbsent(3, "three");
        testMap.putIfAbsent(5, "five");
        System.out.println(testMap);
        System.out.println(testMap.get(0));
        System.out.println(testMap.keySet());
        System.out.println(testMap.values());
        System.out.println(testMap.entrySet());
        for (var value:
             testMap.entrySet()) {
            System.out.printf("%d - %s; ", value.getKey(), value.getValue());
        }
        System.out.println();
        System.out.println("Now we have trees");
        TreeMap<Integer, String> testTree = new TreeMap<>();
        testTree.put(2, "two");
        testTree.put(4, "four");
        testTree.put(1, "one");
        testTree.putIfAbsent(3, "three");
        testTree.putIfAbsent(5, "five");
        System.out.println(testTree.entrySet());
        System.out.println(testTree.keySet());
        System.out.println(testTree.descendingKeySet());
        System.out.println(testTree.values());
        System.out.println(testTree.descendingMap());
        System.out.println(testTree.firstEntry());
    }
}
