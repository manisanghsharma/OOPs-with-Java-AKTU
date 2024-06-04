public interface TestInterface{
    void yo();
    
    default void print(String name){
        System.out.println("Your name is " + name);
    }

    static String sayHello(){
        return "Hellos!!";
    }

    public static void main(String[] args) {
        TestInterface obj1 = new TestInterface();
        obj1.print("Manisangh");
        sayHello();
    }
}

