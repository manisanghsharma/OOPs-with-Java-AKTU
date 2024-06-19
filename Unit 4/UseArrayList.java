import java.util.ArrayList;
public class UseArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>(); //Generic
        ArrayList<String> list2 = new ArrayList<>(); //Non-Generic
        list1.add("Hello");
        list1.add(20);
        list1.add('H');
        System.out.println(list1);

        System.out.println(list1.get(1));

        list1.remove(0);
        System.out.println(list1);

        list2.add("Hello");
        list2.add("Hi");
        list2.add("Java");
        System.out.println(list2);

        list1.add(new Integer(10));
        System.out.println(list1);
    }
    
}