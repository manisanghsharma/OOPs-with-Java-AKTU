# Try and Catch 
- Try and Catch is a way to handle errors in Java.
- If an error occurs in the try block, the code in the catch block will run.
- If no error occurs, the code in the catch block will be skipped.
  
```java
try {
  int[] myNumbers = {1, 2, 3};
  System.out.println(myNumbers[10]);
} catch (Exception e) {
  System.out.println("Something went wrong.");
}
```
The output will be:
```
Something went wrong.
```

# Finally
- The finally block will run regardless of the result of the try and catch blocks.
- It executes irrespective of an exception is thrown or not.
- The use of finally block is to close all the open resources.

```java
try {
  int[] myNumbers = {1, 2, 3};
  System.out.println(myNumbers[10]);
} 
catch (Exception e) {
  System.out.println("Something went wrong.");
} 
finally {
  System.out.println("The 'try catch' is finished.");
}
```
The output will be:
```
Something went wrong.
The 'try catch' is finished.
```

# Throw Keyword

- The throw keyword is used to throw an exception.
- It is used to generate exceptions manually.

```java
a = 10;
b = 0;
if (a > b) {
  throw new ArithmeticException("A is Bigger than B");
}
```

The output will be:

```java
Exception in thread "main" java.lang.ArithmeticException: A is Bigger than B
    at Main.main(Main.java:5)
```

# Throws Keyword
- It is always used with `method header`.

- For example if there is a method `DivideNumber `that divides two numbers, it should throw an exception if the divisor is zero.

- The method header will be:\
```java
public static void DivideNumber(int a, int b) throws ArithmeticException
```

- The method will be:
```java
public static void DivideNumber(int a, int b) throws ArithmeticException {
  if (b == 0) {
    throw new ArithmeticException("Divisor cannot be zero");
  } else {
    System.out.println(a/b);
  }
}
```
- For input `DivideNumber(10, 0)`, the output will be:
```
Exception in thread "main" java.lang.ArithmeticException: Divisor cannot be zero
    at Main.DivideNumber(Main.java:5)
    at Main.main(Main.java:10)
```