import java.util.*;

public class Constructor {
    String name;
    int roll;

Constructor(String myName, int myRoll){
    this.name = myName;
    this.roll = myRoll;
    //this refers to current object
}

String getConstructorDetails(){
    return "Name: " + name + " | Roll No: " + roll;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int roll = sc.nextInt();

        Constructor obj = new Constructor(name, roll);
        String str = obj.getConstructorDetails();
        System.out.println(str);
    }
}

