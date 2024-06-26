import java.util.*;
public class ToArray {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);
        set1.add(37);
        set1.add(47);
        set1.add(899);

        Object[] arr = set1.toArray();

        for (Object i : arr) {
            System.out.println(i);
        }

    }
}
