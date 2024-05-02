class Overloading {
    public void display(int a){
        System.out.println("Integer: "+a);
    }
    public void display(int a, int b){
        System.out.println("Integer: "+a+" "+b);
    }
    public void display(String a){
        System.out.println("String: "+a);
    }
    public static void main(String[] args) {
        Overloading obj1 = new Overloading();
        obj1.display(123);
        obj1.display(123, 456);
        obj1.display("Hello");
    }
