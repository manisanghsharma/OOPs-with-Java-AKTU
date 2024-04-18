# Constructor

- Initialize Instance variable
- Initialize new objects
- Same name as the class name
- Does not return anything
- Constructor invokes implicitly upon creation
- Can be default or with parameters

```java
public class Constructor {
    String name;
    int roll;

Constructor(){
    System.out.println("Hello Constructor");
}
    public static void main(String[] args) {
        Constructor obj = new Constructor();
    }
}
```

We get the output:

```
Hello Constructor
```