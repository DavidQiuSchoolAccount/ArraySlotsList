# MultiTypesList
By: Matthew Chan and David Qiu

## `MultiTypesList` class
A list of arbitrary size, where item can be of type `int`, `double`, or `String`. This list is backed by three arrays.

### Constructor(s)
 - `public MultiTypesList()`
   - Creates a new instance of the list.
 - `public MultiTypesList()`
   - Creates a new instance of the list with a given initial capacity.

### Methods
 - `public void add(int element)`
 - `public void add(double element)`
 - `public void add(String element)`
   - Appends an element to the list.

 - `public void add(int element)`
   - adds an element to the end of the list
 - `public void add(int index, int element)`
   - adds an element to a specific index within the list
 - `public void remove(int index)`
   - removes the item at the specified index
 - `public E get(int index)`
   - returns the item at the specified index
 - `public void set(int index, int element)`
   - overwrites the element at the specified index
 - `public int size()`
   - Returns the amount of items in the list.

## `UserOfList` class
Demonstrates the capabilities of `MultiTypesList`.