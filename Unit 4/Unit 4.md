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

# Set Interface

- The Set interface is a collection that does not allow duplicate elements.
- The Set interface is implemented by the HashSet class, TreeSet class, and LinkedHashSet class.
- `HashSet`: The HashSet class is an implementation of the Set interface that uses a hash table to store elements. It makes no guranatee about the order of the elements.
- `TreeSet`: The TreeSet class is an implementation of the Set interface that uses a red-black tree to store elements. It stores elements in sorted order. It is slower than HashSet.
- `LinkedHashSet`: The LinkedHashSet class is an implementation of the Set interface that uses a hash table to store elements. It maintains the insertion order of the elements.

## Sorted Set
- The SortedSet interface extends the Set interface and provides a way to store elements in sorted order.

## Methods on Set
- The Set interface provides the following methods:
- `s1.containsAll(s2)`: Returns true if s1 contains all the elements of s2.
- `s1.addAll(s2)`: Adds all the elements of s2 to s1.
- `s1.retainAll(s2)`: Retains only the elements that are common in both s1 and s2.
- `s1.removeAll(s2)`: Removes all the elements of s2 from s1.
- `Remove(Object o)`: Removes the specified element from the set.
- `Size()`: Returns the number of elements in the set.
- `toArray()`: Returns an array containing all the elements of the set.
- `iterator()`: Returns an iterator over the elements of the set.
- `isEmpty()`: Returns true if the set is empty.
- `equals(Object o)`: Returns true if the specified object is equal to the set.
- `clear()`: Removes all the elements from the set.
- `add(Object o)`: Adds the specified element to the set.

