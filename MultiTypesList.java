import java.util.*;

/**
 * An implementation of the list data structure, backed by a Java array. Each element can be of type int, double, or String. When array runs out of space, it is recreated with a larger size and its elements are copied.
 */
public class MultiTypesList {
	private enum Type { INT, DOUBLE, STRING };
	private static final int DEFAULT_CAPACITY = 10;

	private Type[] types;
	private int[] ints;
	private double[] doubles;
	private String[] strings;
	private int size = 0;

	/**
	 * Constructs an empty list.
	 */
	public MultiTypesList() {
		this(DEFAULT_CAPACITY);
	}

	/**
	 * Constructs an empty list with the given initial capacity.
	 * @param capacity The initial size of the backing arrays.
	 */
	public MultiTypesList(int capacity) {
		types = new Type[capacity];
		ints = new int[capacity];
		doubles = new double[capacity];
		strings = new String[capacity];
	}


	/**
	 * Appends "value" to the end of this list.
	 * @param type The type of the new entry.
	 * @param intVal If adding an int, pass the value here.
	 * @param doubleVal If adding a double, pass the value here.
	 * @param stringVal If adding a String, pass the value here.
	 * @return true
	 */
	public boolean add(Type type, int intVal, double doubleVal, String stringVal) {
		if(size >= types.length) { this.expand(); }
		types[size] = type;

		if(type == Types.INT) { ints[size] = intVal; }
		else if(type == Types.DOUBLE) { doubles[size] = doubleVal; }
		else if(type == Types.STRING) { strings[size] = stringVal; }

		size++;
		return true;
	}

	/**
	 * Returns the type of the element at the given index.
	 */
	public Type getType(int index) {
		return types[index];
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
		types = Arrays.copyOf(types, types.length * 2);
		ints = Arrays.copyOf(ints, ints.length * 2);
		doubles = Arrays.copyOf(doubles, doubles.length * 2);
		strings = Arrays.copyOf(strings, strings.length * 2);
	}
}