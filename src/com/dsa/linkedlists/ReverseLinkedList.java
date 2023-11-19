/**
 * 
 */
package com.dsa.linkedlists;

/**
 * @author chaitanyaarava
 *
 */
public class ReverseLinkedList extends LinkedListImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ReverseLinkedList initialLinkedList = new ReverseLinkedList();
		initialLinkedList.insertNodeAtStart(50);
		initialLinkedList.insertNodeAtStart(40);
		initialLinkedList.insertNodeAtStart(30);
		initialLinkedList.insertNodeAtStart(20);
		initialLinkedList.insertNodeAtStart(10);
		System.out.print("Linked List Before reversal: ");
		initialLinkedList.display();

		Node headNode = LinkedListImplementation.head;
		Node reverseLinkedList = null;

		while (headNode != null) {
			Node currentNode = new Node(headNode.value);
			reverseLinkedList = addNodeAtStart(currentNode, reverseLinkedList);
			headNode = headNode.next;
		}

		System.out.print("Linked List Afrer reversal: ");

		displayReverseNode(reverseLinkedList);

	}

	/**
	 * This method is used to display linked list in reverse order.
	 * 
	 * @param reverseLinkedList
	 */
	private static void displayReverseNode(Node reverseLinkedList) {

		while (reverseLinkedList != null) {
			System.out.print(" " + reverseLinkedList.value);
			reverseLinkedList = reverseLinkedList.next;
		}
	}

	/**
	 * This method is used to add a node at start.
	 * 
	 * @param currentNode
	 * @param reverseLinkedList
	 */
	private static Node addNodeAtStart(Node currentNode, Node reverseLinkedList) {
		if (reverseLinkedList == null) {
			reverseLinkedList = currentNode;
			reverseLinkedList.next = null;
		} else {
			Node tempNode = reverseLinkedList;
			reverseLinkedList = currentNode;
			reverseLinkedList.next = tempNode;

		}

		return reverseLinkedList;

	}

}
