public class Constructor {
    String name;
    int roll;

Constructor(String myName, int myRoll){
    this.name = myName;
    this.roll = myRoll;
    //this refers to current object
}
    public static void main(String[] args) {
        Constructor obj = new Constructor("Ram", 1234);
        System.out.println(obj.name);
        System.out.println(obj.roll);

        Constructor obj2 = new Constructor("Shyam", 4321);
        System.out.println(obj2.name);
        System.out.println(obj2.roll);
    }
}
