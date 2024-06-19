@FunctionalInterface
interface A{
    void show(int i);
}

public class Lambda1 {
    public static void main(String[] args) {
        A obj = (int i) -> System.out.println("The number is " + i + "!");
        obj.show(5); 
    }
    
}