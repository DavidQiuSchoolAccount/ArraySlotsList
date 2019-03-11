import java.util.*;

/**
 * An implementation of the list data structure, backed by a Java array. When array runs out of space, it is recreated with a larger size and its elements are copied.
 */
public class ArraySlotsList {
	private static final int DEFAULT_CAPACITY = 10;

	private int[] array;
	private int size = 0;

	/**
	 * Constructs an empty list with the default initial capacity.
	 */
	public ArraySlotsList() {
		this(DEFAULT_CAPACITY);
	}

	/**
	 * Constructs an empty list with the given initial capacity.
	 * @param capacity The initial size of the backing array.
	 */
	public ArraySlotsList(int capacity) {
		array = new int[capacity];
	}


	/**
	 * Appends "value" to the end of this list.
	 * @return true
	 */
	public boolean add(int value) {
		if(size >= array.length) { this.expand(); }
		array[size] = value;
		size++;
		return true;
	}

	/**
	 * Returns the size of this list.
	 * @return The number of elements in this list.
	 */
	public int size() {
		return size;
	}

	 /**
	  * Returns a String representation of this list.
	  * @return A representation of this list in the format [a, b, c]
	  */
	public String toString() {
		String result = "[";
		for(int i = 0; i < size; i++) {
			result += array[i];
			if(i != size - 1) { result += ", "; }
		} return result + "]";
	}

	/**
	 * Doubles the size of the backing array, preserving existing data.
	 */
	private void expand() {
		System.out.println("Expanding!");
		array = Arrays.copyOf(array, array.length * 2);
	}
}