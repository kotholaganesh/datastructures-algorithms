package dataStructures.linkedLists;

public class LinkedListOne {

	Node head;
	Node tail;
	int length;

	public void createLinkedList(int value) {
		Node newNode = new Node(value);
		if (head == null && tail == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}

		length++;
	}

	public void reverseLinkedList() {
		Node temp = head;
		Node after = temp.next;
		Node prev = null;
		while (temp != null) {
			after = temp.next;
			temp.next = prev;
			prev = temp;
			temp = after;
		}

		while (prev != null) {
			System.out.print(prev.value + "->");
			prev = prev.next;
		}

	}

	public void printLinkedList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + "->");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedListOne ll = new LinkedListOne();
		ll.createLinkedList(3);
		ll.createLinkedList(9);
		ll.createLinkedList(13);
		ll.createLinkedList(6);
		ll.createLinkedList(21);
		ll.createLinkedList(15);

		ll.printLinkedList();
		System.out.println();
		ll.reverseLinkedList();

	}
}
