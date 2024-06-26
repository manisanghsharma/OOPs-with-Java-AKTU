import java.util.*;
public class IteratorTest {
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

        Iterator itr = set1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
