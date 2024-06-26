import java.util.*;
public class SetContainsAll {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(3);
        set1.add(5);
        set1.add(7);

        set2.add(12);
        set2.add(34);
        set2.add(50);
        set2.add(70);
        set2.add(3);

        boolean status = set1.containsAll(set2);
        System.out.println(status);

        set1.remove(5);
        System.out.println(set1);

        set1.retainAll(set2);
        System.out.println(set1);
    }
}
