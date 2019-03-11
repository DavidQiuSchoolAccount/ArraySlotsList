/**
 * An application that exercises the list implementation.
 */
public class UserOfList {
	public static void main(String[] args) {
		ArraySlotsList list = new ArraySlotsList();
		printList(list);

		for(int i = 0; i < 50; i++) {
			int size = list.size();
			if(size == 10 || size == 20 || size == 40) { System.out.println("Expansion expected."); }

			int entry = i * 10;
			System.out.println("Adding " + entry);
			list.add(entry);
			printList(list);
			System.out.println();
		}
	}

	private static void printList(ArraySlotsList list) {
		System.out.println("The list: " + list);
		System.out.println("It holds " + list.size() + " elements.");
	}
}
