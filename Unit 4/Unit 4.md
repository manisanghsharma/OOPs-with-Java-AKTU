# Data Structures in Java

## List

### ArrayList

- ArrayList is a resizable array implementation of the List interface.
- The default size of the ArrayList is 16.
- As soon as the Arraylist reaches the size of 12, it will multiply the size by 2.
- Thus ArrayList is a dynamic Array.

### Non-Generic List
- A non-generic ArrayList is a list that can store any type of data.
- The non-generic ArrayList is defined as 
```java
ArrayList list = new ArrayList<>();
```

### Generic List
- A generic ArrayList is a list that can store only one type of data.
- The generic ArrayList is defined as 
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


# Map
- A map is an object that maps keys to values. A map cannot contain duplicate keys. Each key can be mapped to only one value.

- There are 3 classes that implement the Map interface:
- `HashMap`: The HashMap class is an implementation of the Map interface that uses a hash table to store key-value pairs. It makes no guarantee about the order of the elements.
- To initialize a new HashMap, we can use the following syntax:
```java
Map<String, Integer> map = new HashMap<>() // Generic Map;
```
or
```java
HashMap map = new HashMap<>() // Non-Generic Map;
```

# Map Methods

- `put(K key, V value)`: Adds the specified key-value pair to the map.
- `get(Object key)`: Returns the value to which the specified key is mapped.
- `containsKey(Object key)`: Returns true if the map contains the specified key.
- `containsValue(Object value)`: Returns true if the map contains the specified value.
- `Size()`: Returns the number of key-value pairs in the map.
- `isEmpty()`: Returns true if the map is empty.

# Comparable Interface and Comparator Interface

- In java, the Comparable interface is used to define the natural ordering of objects. The natural ordering of objects is the order in which the objects are stored in the collection.

## Comparable Interface
- The Comparable interface is defined in the java.lang package.
- The Comparable interface has only one method, compareTo().
- Its purpose is to define the natural ordering of objects.

- Implementing the Comparable interface:
```java
public interface Comparable<T> {
    public int compareTo(T o);
}
```

- A class that implements the Comparable interface must implement the compareTo() method. The compareTo() method compares the current object with the specified object.
-  It returns a negative value if the current object is less than the specified object, a positive value if the current object is greater than the specified object, and zero if the current object is equal to the specified object.