package com.dsa.linkedlists;

/**
 * @author chaitanyaarava
 *
 */
public class LinkedListImplementation {

	private Node head = null;;

	private Node tail = null;

	private int size = 0;

	/**
	 * This method is used to insert node at start of linked list.
	 * 
	 * @param val
	 */
	private void insertNodeAtStart(int val) {
		Node node = new Node(val);

		if (head == null) {
			head = node;
			tail = node;
			size++;
		} else {

			Node temp = head;
			head = node;
			head.next = temp;
			size++;
		}
	}

	/**
	 * This method is used to insert Node at end of linked list.
	 * 
	 * @param value
	 */
	private void insertNodeAtEnd(int value) {
		if (tail == null) {
			insertNodeAtEnd(value);
		} else {
			Node lastNode = new Node(value);
			tail.next = lastNode;
			tail = lastNode;
			size++;
		}
	}

	/**
	 * THis method is used to insert node at a particular index.
	 * 
	 * @param val
	 * @param index
	 */
	private void insertNodeAtIndex(int val, int index) {
		if (index == 0) {
			insertNodeAtStart(val);
		} else if (index == size - 1) {
			insertNodeAtEnd(val);
		} else {

			Node tempNode = head;

			for (int i = 0; i < index - 1; i++) {
				tempNode = tempNode.next;
			}

			Node newNode = new Node(val, tempNode.next);
			tempNode.next = newNode;
			size++;

		}
	}

	/**
	 * This method is used to delete the first element from the node.
	 * 
	 */
	private void deleteNodeAtStart() {

		if (head != null) {
			head = head.next;
			if (head == null) {
				tail = head;
			}
			size--;
		}
	}

	/**
	 * This method is used to delete last node.
	 * 
	 */
	private void deleteNodeAtLast() {

		if (tail == head) {
			deleteNodeAtStart();
		} else {

			Node tempNode = head;

			for (int i = 0; i < size - 2; i++) {
				tempNode = tempNode.next;
			}

			tail = tempNode;
			tail.next = null;
			size--;
		}

	}
	
	/**
	 * This method is used to delete the value on a given index.
	 * 
	 * @param index
	 */
	private void deleteValueAtIndex(int index) {

		if (index > size) {
			throw new RuntimeException("Index is out of Range");
		}

		if (index == 0) {
			deleteNodeAtStart();
		} else if (index == size - 1) {
			deleteNodeAtLast();
		} else {
			Node tempNode = head;

			for (int i = 0; i < index - 2; i++) {
				tempNode = tempNode.next;
			}
			Node nodeToDelete = tempNode.next;
			tempNode.next = nodeToDelete.next;
			size--;
		}

	}

	/**
	 * This method is used to display values from linked list.
	 */
	private void display() {

		Node temp = head;
		while (temp != null) {

			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.println(" ");
	}

	/**
	 * This method is used to find if value exists in the list.
	 * 
	 * @param val
	 * @return
	 */
	boolean findIfValueExists(int val) {

		Node temp = head;

		while (temp != null) {
			if (temp.value == val) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedListImplementation linkedListImpl = new LinkedListImplementation();
		linkedListImpl.insertNodeAtStart(10);
		linkedListImpl.insertNodeAtStart(20);
		linkedListImpl.insertNodeAtStart(30);
		linkedListImpl.insertNodeAtStart(40);
		linkedListImpl.display();
		linkedListImpl.insertNodeAtEnd(50);
		linkedListImpl.display();
		linkedListImpl.insertNodeAtIndex(35, 2);
		linkedListImpl.display();
		linkedListImpl.insertNodeAtIndex(5, 0);
		linkedListImpl.display();
		linkedListImpl.deleteNodeAtStart();
		linkedListImpl.display();
		linkedListImpl.deleteNodeAtLast();
		linkedListImpl.display();
		System.out.println(linkedListImpl.findIfValueExists(40));
		System.out.println(linkedListImpl.findIfValueExists(-7));
		linkedListImpl.deleteValueAtIndex(2);
		linkedListImpl.display();

	}

}
