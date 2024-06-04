import java.util.ArrayList;
import java.util.stream.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        Stream<String> stream = list.stream().filter(s -> s.contains("Apple"));
        System.out.println(stream.count());

    }
}
