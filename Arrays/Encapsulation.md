# Encapsulation

- Instance variable must be private
- All methods or getter and setter methods must be public
  
```java
class Encap {
    private int emp_id;
    private String name;
    public void setEmpId(int emp_id){
        this.emp_id = emp_id;
    }
    public int getEmpId(){
        return emp_id;
    }
    public static void main(String[] args) {
        Encap obj1 = new Encap();
        obj1.setEmpId(123);
        System.out.println(obj1.getEmpId());
    }
}
```

- The output will be 123


# Polymorphism

- Polymorphism is the ability of a single function to operate on different types of data.

## Method Overloading

- Method overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.

- Method name must be same
- Number of arguments must be different

```java
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
}
```

- The output will be:
```
Integer: 123
Integer: 123 456
String: Hello
```


# Abstract Method

- An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon), like this:

```java
abstract void display();
```

- No body only declaration

### Why do we need abstract methods?

- To implement the method in the child class

# Abstract Class

- An abstract class is a class that is declared with the abstract keyword.

- We cannot create an object of an abstract class

```java
abstract class Vehicle {
    abstract void start();
}
```

- We can create normal methods in abstract class

- To use the abstract class we need to extend it and then we can define the abstract method

```java
class Car extends Vehicle {
    void start(){
        System.out.println("Car is starting");
    }
    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.start();
    }
}
```

- The output will be:
```
Car is starting
```

# Interface

- When a subclass need to inherit from multiple classes, we use interface

- In class we can use only one class but in interface we can use multiple interfaces

## Benefits of Interface

- 100% abstraction
- Multiple inheritance
- All methods will be abstract

- class uses the keyword extends to `inherit` from a class, but it uses the keyword `implements` to inherit from an interface.

```java
// Java Programs to illustrate 
// use of Interface to solve 
// Diamond Problem 
import java.io.*; 
  
// Interfaces Declared 
interface Parent1 { 
    void fun(); 
} 
  
// Interfaces Declared 
interface Parent2 { 
    void fun(); 
} 
  
// Inheritance using Interfaces 
class test implements Parent1, Parent2 { 
    public void fun() 
    { 
        System.out.println("fun function"); 
    } 
} 
  
// Driver Class 
class test1 { 
    // main function 
    public static void main(String[] args) 
    { 
        test t = new test(); 
        t.fun(); 
    } 
} 
```

- The output will be:
```
fun function
```

- In the above example, the class `test` is inheriting from two interfaces `Parent1` and `Parent2`. Both the interfaces have the same method `fun()`. The class `test` is implementing the method `fun()` of both the interfaces.

- The class `test` is solving the diamond problem using interfaces.

