# Data Structures in Java

## List

### ArrayList

- ArrayList is a resizable array implementation of the List interface.
- The default size of the ArrayList is 16.
- As soon as the Arraylist reaches the size of 12, it will multiply the size by 2.
- Thus ArrayList is a dynamic Array.

### Generic List
- A generic ArrayList is a list that can store any type of data.
- The generic ArrayList is defined as 
```java
ArrayList list = new ArrayList<>();
```

### Non-Generic List
- A non-generic ArrayList is a list that can store only one type of data.
- The non-generic ArrayList is defined as 
```java
ArrayList<String> list = new ArrayList<>();
```

## Methods on Lists
### add()
- The add() method is used to add an element to the list.

### remove()
- The remove() method is used to remove an element from the list. 
- The remove() method can take an index or an element as an argument.
- If the remove() method is called with an index, it will remove the element at that index.
- If the remove() method is called with an element, it will remove the first occurrence of that element.

### get()
- The get() method is used to get an element from the list.
- The get() method takes an index as an argument and returns the element at that index.

## AutoBoxing
- AutoBoxing is the process of converting a primitive data type to its corresponding wrapper class.
- For example, converting an int to an Integer.
- AutoBoxing is done automatically by the compiler.
- AutoBoxing is useful when we want to store primitive data types in a List.

```java
list.add(10); // AutoBoxing
```

- In the above example, the integer 10 is automatically converted to an Integer object.
- In the backend, this is what happens:
```java
list.add(new Integer(10));
```
