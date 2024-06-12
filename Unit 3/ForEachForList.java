import java.util.ArrayList;
public class ForEachForList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Watermelon");

        System.out.println(list);

        list.forEach(x -> System.out.println(x));
        list.stream().forEach(x -> System.out.println(x));
    }
}
