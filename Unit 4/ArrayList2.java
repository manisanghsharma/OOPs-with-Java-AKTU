// Make two ArrayLists, list1 and list2, and fill list1 with the numbers 1-15. Then, add all the even numbers to list2. Finally, print out both lists.

import java.util.ArrayList;
public class ArrayList2 {
    public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    
    for (int i = 1; i <= 15; i++) {
        list1.add(i);
    }

    for (int i = 0; i <= 14; i++) {
        if (list1.get(i) % 2 == 0) {
            list2.add(list1.get(i));
        }
    }
    
    System.out.println(list1);
    System.out.println(list2);
    }

}
