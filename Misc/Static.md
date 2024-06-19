# Static
- Inside a static block, only static keywords can be accessed.
- To access non-static keywords, we need to create an object of the class.

```java
class test {
    int a = 20;
    public static void main(String[] args) {
        test obj = new test();
        System.out.println(obj.a);
    }
}

```

- In the above code, we have created an object of the class test and accessed the non-static keyword a using the object.
- The output of the above code will be 20.

```java
    class test {
    int a = 20;
    test(){
        ++a;
        System.out.println("a: "+ a);
    }

    public static void main(String[] args) {
        test obj = new test();
        test obj1 = new test();
    }
    }
```

- In the above code, we have created two objects of the class test and accessed the non-static keyword a using the object.
- The output of the above code will be:
```
a: 21
a: 21
```
- Value of a remains the same for both objects because a is a non-static keyword and it is not shared among objects.

- If we want to share a keyword among objects, we need to declare it as static.

```java
class test {
    static int a = 20;
    test(){
        ++a;
        System.out.println("a: "+ a);
    }

    public static void main(String[] args) {
        test obj = new test();
        test obj1 = new test();
    }
}
```

- In the above code, we have declared a as a static keyword and accessed it using the object.

- The output of the above code will be:
```
a: 21
a: 22
```

- Static blocks are invoked first when the class is loaded into memory.

```java
class test {
    static void hello(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        hello();
    }
        static{
            System.out.println("Hello Bro");
        }
    }
```

- In the above code, we have created a static block and a static method hello.
- The static block is invoked first when the class is loaded into memory.
- The output of the above code will be:
```
Hello Bro
Hello
```

# Static Import 

- Static import is used to import static members of a class.

- Objects can be accessed without using the class name.

```java

import static java.lang.Math.*;
class test {
    public static void main(String[] args) {
            System.out.println(sqrt(4));
        }
    }

```

- In the above code, we have imported the static method sqrt of the Math class.
- We can access the sqrt method without using the class name Math.
- Otherwise, we need to use `Math.sqrt(4)` to access the sqrt method.
