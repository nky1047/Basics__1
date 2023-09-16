package main.Collections.LinkedList;

import main.ObjectClass.Node;

public class SinglyLinkedList {
	Node head = null;
	Node tail = null;

	public void addNode(int data) {
		Node newNode = new Node(data);
		// Checks if the list is empty
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public int size() {
		Node current = head;
		int size=0;
		while(current!=null) {
			size++;
			current = current.next;
		}
		return size;
	}

	// display() will display all the nodes present in the list
	public void display() {
		// Node current will point to head
		Node current = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singly linked list: ");
		while (current != null) {
			// Prints each node by incrementing pointer
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}
