# Functional Interfaces (Single Abstract Method Interfaces - SAM)
- A functional interface is an interface that has only one abstract method.
- It can have any number of default and static methods.
- It represents a single action.
- `@FunctionalInterface` is used to ensure that the interface is a functional interface. It is optional.

- Example of a functional interface to print a message.
  
```java
@FunctionalInterface
public interface MyFunctionalInterface {
    void printm(String msg);
}
```


- If we declare an Interface as `@FunctionalInterface` and try to add another abstract method, it will throw a compile-time error.

- Any class that implements a functional interface must provide an implementation for the abstract method. It should be public.

```java
public class MyFunctionalInterfaceImpl implements MyFunctionalInterface {
    @Override
    public void printm(String msg) {
        System.out.println(msg);
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface obj = new MyFunctionalInterfaceImpl();
        obj.printm("Hello");
    }
}
```

  The output will be:
  
```
Hello
```


# Lambda Expressions
- Lambda expressions are used to provide the implementation of a functional interface.
- It is a block of code that is passed to a method.
- It helps to iterate, filter, and extract data from a collection.
- It is used to write concise code.
- No need to use implements.

- Syntax of a lambda expression:
  
```java
(parameters) -> expression
```

## A body with single expression
```java
(parameter1, parameter2) -> expression
```
- A lambda orperator `->` is used to separate the parameters and the body of the lambda expression.

- It divides lambda expression into two parts:
  - The left side of the lambda operator specifies the parameters required by the lambda expression.
  - The right side of the lambda operator specifies the body of the lambda expression.

- Example of a lambda expression to print a message.
- 
```java
(int arg1, String arg2) -> {System.out.println("Two arguements are " + arg1 + "and" + arg2);}
```

## Example of Lambda Expression with one parameter to tell whether the number is even or odd.

```java
@FunctionalInterface
interface NumericTest() {
    boolean test(int n);
}

public class Main {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2) == 0;
        if (isEven.test(10)) {
            System.out.println("10 is even");
        }
        if (!isEven.test(9)) {
            System.out.println("9 is odd");
        }
    }
}
```

- The output will be:
  
```
10 is even
9 is odd
```

```java
@FunctionalInterface
interface myWork{
    void hi();
}

public class useLambda{
    public static void main(String[] args){
        myWork ref = () -> System.out.println("Hello");
        ref.hi();
    }
}
```

- The output will be:
  
```
Hello
```

# Method References
- Method references are used to refer to methods without invoking them.
- It is a shorthand notation of a lambda expression to call a method.

## Reference to static method


```java
class Sample4{
    public static void msg(){
        System.out.println("Static method called");
    }
}

public class MethodReference {
    public static void main(String[] args){
        myWork ref = Sample4::msg;
        ref.run();
    }
}
```

<hr>

# Array List

- ArrayList is a part of the collection framework and is present in `java.util` package.
- It provides us dynamic arrays in Java.
- To make an array list, we need to import `java.util.ArrayList` package or its superclass.

```java
import java.util.ArrayList;
ArrayList<String> list = new ArrayList<String>();
```

- To add elements to the ArrayList, we use the `add()` method.

```java
list.add("Apple");
list.add("Banana");
list.add("Mango");
```

- To remove elements from the ArrayList, we use the `remove()` method.

## Applying stream filter on ArrayList

```java 
Stream<String> stream = list.stream().filter(s -> s.contains("Apple"));
System.out.println(stream.count());
```

- The output will be:
  
```
1
```

## Distinct

The `distinct()` method is used to remove the duplicate elements from the list.

```java
String arr[] = {"One", "Two", "Three", "One", "Two"};

List<String> list = Arrays.asList(arr);
List<String> distinctList = list.stream().distinct().collect(Collectors.toList());
System.out.println(distinctList);
```

- The output will be:
  
```
[One, Two, Three]
```

## limit() method

The `limit()` method is used to limt the size of the stream.

```java
```

## For Each Method
- The `forEach()` method is used to iterate over the elements of the stream.

```java
String arr[] = {"One", "Two", "Three", "Four", "Five"};
List<String> list = Arrays.asList();
list.addAll(Arrays.asList(arr));
list.stream().forEach(s -> System.out.println(s));
```

- asList() method is used to convert an array into a list.
- toArray() method is used to convert a list into an array.

- The output will be:
  
```
One
Two
Three
Four
Five
```

## Using For Each Method with ArrayList
```java
String arr[] = mylist.stream().toArray(x -> new String[x]);
for(String str:arr1){
    System.out.println(str);
}
Arrays.Stream(arr).forEach(x -> System.out.println(x));
```

- The output will be:
  
```
One
Two
Three
Four
Five
```


# Reduce Method
- The `reduce()` method is used to reduce the elements of a stream to a single value.

- Code to use reduce and find the longest string in the list.

```java
String arr[] = {"One", "Two", "Three", "Four", "Five"};
List<String> list = Arrays.asList(arr);
String result = list.stream().reduce((x, y) -> x.length() > y.length() ? x : y);
result.ifPresent(x -> System.out.println(x));
```

- The output will be:
  
```
Three
```

# Default Methods
- Deafult methods are the methods that have a body in the interface.

- Before java 8 interfaces could have only abstract methods. But after Java 8, it can have default methods.

- The default methods are defined in the interface with the `default` keyword.

```java
interface MyInterface {

    default void newMethod() {
        System.out.println("Newly added default method");
    }
}
```

# Static Method Interface

- Static methods are the methods that have a body in the interface.
- The static methods are defined in the interface with the `static` keyword.
- static methods can be called without creating an object of the class as they dont belong to a particular object.

```java
public interface Vehicle{
    static int getHorsePower(int rpm, int torque){
        return (rpm * torque) / 5252;
    }
}
```

# Try with resources Statement

- Eliminiates with the need for a lengthy try-catch-finally code block.
- Always close the opened resources.
- Allows opening resources in the opposite order of opening

- A class that implements the `AutoCloseable` interface can be used as a resource in a try-with-resources statement.

- If a resource must be autoclosed, it must be declared in the parentheses of the try statement.

- `java.lang.AutoCloseable` or `java.io.Closeable` is a functional interface that has a single method `void close()` which is called when the resource is no longer needed.

- The `close()` method is called automatically when the try block is exited.

```java
public interface AutoCloseable {
    void close() throws Exception;
}
```

- Example of a try-with-resources statement.

```java
try(
    FileReader fr = new FileReader("test.txt");
    BufferedReader br = new BufferedReader(fr);
)
{
    String str;
    while((str = br.readLine()) != null){
        System.out.println(str);
    }
}
```

# Base64 Encoding and Decoding

- Java8 provides a class `java.util.Base64` to deal with Base64 encoding and decoding.
- The techniques to encode and decode data include `MIME`, `Base` and `URL`.

# Basic Base64 Encoding and Decoding

## Encoding a string
    
```java
String str = "Hello, World!";
String encodedString = Base64.getEncoder().encodeToString(str.getBytes());
```

## Decoding a string

```java
byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
String decodedString = new String(decodedBytes);
```

### Base64 Encoding without Padding

- The `withoutPadding()` method is used to encode the string without padding.

- In java8, base64 encoding requires the string to be a multiple of 4 in length.

- If the length of the string is not a multiple of 4, then the string is padded with `=`.

```java
String str = "Hello, World!";
String encodedString = Base64.getEncoder().withoutPadding().encodeToString(str.getBytes());
```

- The output will be:
  
```
SGVsbG8sIFdvcmxk!
```

# Base64 Encoding and Decoding with URL

- It is used to encode and decode an URL.
- The `getUrlEncoder()` method is used to encode the URL.

```java
String url = "https://www.google.com";
String encodedString = Base64.getUrlEncoder().encodeToString(url.getBytes());
```

- The output will be:
  
```
aHR0cHM6Ly93d3cuZ29vZ2xlLmNvbQ==
```










