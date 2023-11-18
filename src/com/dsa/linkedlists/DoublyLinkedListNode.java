/**
 * 
 */
package com.dsa.linkedlists;

/**
 * @author chaitanyaarava
 *
 */
public class DoublyLinkedListNode {

	public int value;

	public DoublyLinkedListNode previousNode;

	public DoublyLinkedListNode nextNode;

	public DoublyLinkedListNode(int val) {
		this.value = val;
	}

	public DoublyLinkedListNode(int val, DoublyLinkedListNode nextNode, DoublyLinkedListNode previousNode) {
		this.value = val;
		this.nextNode = nextNode;
		this.previousNode = previousNode;

	}

}
