package dataStructures.linkedLists;

public class LinkedListTwo {

	public void printLinkedListTwo(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + "->");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		LinkedListTwo ll2 = new LinkedListTwo();
// First Type
		Node head = new Node(3);
		Node second = new Node(7);
		Node third = new Node(1);
		Node fourth = new Node(8);
		Node fifth = new Node(23);
		Node sixth = new Node(15);

		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;

		ll2.printLinkedListTwo(head);
		System.out.println();

// Second Type
		Node node2 = new Node(2);
		node2.next = new Node(4);
		node2.next.next = new Node(8);
		node2.next.next.next = new Node(9);

		ll2.printLinkedListTwo(node2);

	}
}
