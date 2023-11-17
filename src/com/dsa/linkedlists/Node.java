package com.dsa.linkedlists;

/**
 * @author chaitanyaarava
 *
 */
public class Node {

	int value;

	Node next;

	public Node(int val) {
		this.value = val;
	}

	public Node(int val, Node node) {
		this.value = val;
		this.next = node;
	}

}
