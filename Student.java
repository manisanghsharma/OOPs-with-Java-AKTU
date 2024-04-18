import java.util.*;
public class Student {
    int roll_no;
    String name;
    double height;
    double marks; 
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student();
        Scanner sc = new Scanner(System.in);
        // System.out.println(obj1);

        // System.out.println(obj1.roll_no);
        // System.out.println(obj1.name);
        // System.out.println(obj1.height);
        
        System.out.println("Enter Name: ");
        obj1.name = sc.next();

        System.out.println("Enter Roll No: ");
        obj1.roll_no = sc.nextInt();

        System.out.println("Enter Height: ");
        obj1.height = sc.nextDouble();

        System.out.println("Enter Marks: ");
        obj1.marks = sc.nextDouble();

        System.out.println("Enter Name: ");
        obj2.name = sc.next();

        System.out.println("Enter Roll No: ");
        obj2.roll_no = sc.nextInt();

        System.out.println("Enter Height: ");
        obj2.height = sc.nextDouble();

        System.out.println("Enter Marks: ");
        obj2.marks = sc.nextDouble();

        System.out.println("Student 1 Data");
        System.out.println("Name is " + obj1.name);
        System.out.println("Roll No is " + obj1.roll_no);
        System.out.println("Height is " + obj1.height + " Feet");
        System.out.println("Marks are " + obj1.marks + "%");
        System.out.println("..........................");
        System.out.println("Student 2 Data");
        System.out.println("Name is " + obj2.name);
        System.out.println("Roll No is " + obj2.roll_no);
        System.out.println("Height is " + obj2.height + " Feet");
        System.out.println("Marks are " + obj2.marks + "%");
        
    }
}
