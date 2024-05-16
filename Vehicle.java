abstract class Vehicle {
    abstract void start();
    void go(){
        System.out.println("Lessgoo!!");
}


class Car extends Vehicle {
    void start(){
        System.out.println("Car is starting");
    }
    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.start();
    }
}

}