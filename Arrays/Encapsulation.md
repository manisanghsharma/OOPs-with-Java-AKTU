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
