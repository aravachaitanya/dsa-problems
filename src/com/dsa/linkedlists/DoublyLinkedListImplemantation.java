/**
 * 
 */
package com.dsa.linkedlists;

/**
 * @author chaitanyaarava
 *
 */
public class DoublyLinkedListImplemantation {

	private DoublyLinkedListNode head = null;

	private DoublyLinkedListNode tail = null;

	private int size = 0;

	/**
	 * This method is used to add an element at start of Doubly inked list.
	 * 
	 * @param val
	 */
	private void addElementAtStart(int val) {

		if (head == null) {
			DoublyLinkedListNode newNode = new DoublyLinkedListNode(val);
			head = newNode;
			tail = head;
			size++;
		} else {
			DoublyLinkedListNode newNode = new DoublyLinkedListNode(val);
			DoublyLinkedListNode tempNode = head;
			newNode.nextNode = tempNode;
			newNode.previousNode = null;
			head = newNode;
			head.nextNode.previousNode = newNode;
			size++;
		}
	}

	/**
	 * This method is used to add element at an particular index.
	 * 
	 * @param value
	 * @param index
	 */
	private void addElementAtAnIndex(int value, int index) {
		if (head == null) {
			addElementAtStart(value);
		} else if (index == size - 1) {
			addElementsAtEnd(value);
		} else {

			DoublyLinkedListNode tempNode = head;

			for (int i = 0; i < index - 1; i++) {
				tempNode = tempNode.nextNode;
			}

			DoublyLinkedListNode newNode = new DoublyLinkedListNode(value, tempNode.nextNode, tempNode);
			newNode.nextNode.previousNode = newNode;
			tempNode.nextNode = newNode;

			size++;

		}
	}

	/**
	 * This method is used to add elements at the end of Doubly inked list.
	 * 
	 * @param val
	 */
	private void addElementsAtEnd(int val) {

		if (head == null) {
			addElementAtStart(val);
		} else {
			DoublyLinkedListNode tempNode = tail;
			DoublyLinkedListNode newNodeAtEnd = new DoublyLinkedListNode(val);
			tempNode.nextNode = newNodeAtEnd;
			tail = tempNode.nextNode;
			tail.previousNode = tempNode;
			size++;
		}
	}

	/**
	 * This method will first element from list.
	 */
	private void deleteElementFromStart() {
		if (head != null) {
			head = head.nextNode;
			head.previousNode = null;
			size--;
		}
	}

	/**
	 * This methos is used to delete last element from the list.
	 */
	private void deleteElementFromLast() {
		if (size == 1) {
			deleteElementFromStart();
		} else {
			DoublyLinkedListNode lastNode = tail;
			tail = lastNode.previousNode;
			tail.nextNode = null;
			size--;
		}

	}

	/**
	 * This method is used to display values from linked list.
	 */
	public void displayFromStart() {

		DoublyLinkedListNode temp = head;

		while (temp != null) {
			System.out.print(" " + temp.value);
			temp = temp.nextNode;
		}
		System.out.println("");
	}

	/**
	 * This method is used to display values from end of linked list.
	 */
	public void displayFromEnd() {
		DoublyLinkedListNode temp = tail;
		while (temp != null) {
			System.out.print(" " + temp.value);
			temp = temp.previousNode;
		}
		System.out.println(" ");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		DoublyLinkedListImplemantation doublyLinkedListImplemantation = new DoublyLinkedListImplemantation();
		doublyLinkedListImplemantation.addElementAtStart(10);
		doublyLinkedListImplemantation.addElementAtStart(20);
		doublyLinkedListImplemantation.addElementAtStart(40);
		doublyLinkedListImplemantation.addElementAtStart(60);
		doublyLinkedListImplemantation.addElementAtStart(80);
		doublyLinkedListImplemantation.addElementAtStart(100);
		doublyLinkedListImplemantation.displayFromStart();
		doublyLinkedListImplemantation.addElementsAtEnd(110);
		doublyLinkedListImplemantation.displayFromStart();
		doublyLinkedListImplemantation.displayFromEnd();
		doublyLinkedListImplemantation.addElementAtAnIndex(30, 2);
		doublyLinkedListImplemantation.displayFromStart();
		doublyLinkedListImplemantation.deleteElementFromStart();
		doublyLinkedListImplemantation.displayFromStart();
		doublyLinkedListImplemantation.displayFromEnd();
		doublyLinkedListImplemantation.deleteElementFromLast();
		doublyLinkedListImplemantation.displayFromStart();
		doublyLinkedListImplemantation.displayFromEnd();

	}

}
