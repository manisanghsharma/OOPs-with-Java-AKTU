@FunctionalInterface
interface A{
    void print();
}

class FuncInter implements A {
    public void print(){
        System.out.println("Hii!!");
    }
    public static void main(String[] args) {
        FuncInter test = new FuncInter();
        test.print();
    }
    
}
