package dataStructures.linkedLists;

public class LinkedListCycle {

	public boolean hasCycle(Node node) {
		Node fast = node;
		Node slow = node;
		boolean hasCycle = false;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				hasCycle = true;
				break;
			}
		}
		return hasCycle;
	}

	public void breakCycle(Node node) {
		Node fast = node;
		Node slow = node;
		boolean hasCycle = false;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				hasCycle = true;
				break;
			}
		}
		if (hasCycle) {
			slow = node;
		}
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		Node prev = fast;
		while (prev.next != slow) {
			prev = prev.next;
		}
		prev.next = null;

	}

	public void printLinkedList(Node node) {
		Node temp = node;
		while (temp != null) {
			System.out.print(temp.value + "->");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		LinkedListCycle lc = new LinkedListCycle();

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
		sixth.next = second;

		System.out.println();
		boolean hasCycle = lc.hasCycle(head);
		System.out.println("Is Linked List Cycle - " + hasCycle);
		lc.breakCycle(head);
		lc.printLinkedList(head);

	}
}
