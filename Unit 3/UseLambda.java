@FunctionalInterface
interface myWork{
    void hi();
}

public class UseLambda{
    public static void main(String[] args){
        myWork ref = () -> System.out.println("Hello");
        ref.hi();
    }
}
