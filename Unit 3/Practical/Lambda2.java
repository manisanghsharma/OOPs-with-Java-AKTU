@FunctionalInterface
interface A {
    boolean OddEven(int a);
}

public class Lambda2 {

    
    public static void main(String[] args) {
        A test = (int a) -> (a % 2) == 0;

        if (test.OddEven(5)) {
            System.out.println("Number is even!");
        } else {
            System.out.println("Number is odd!");
        }
    }
}