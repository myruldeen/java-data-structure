/**
 * @(#)LinkedList.java
 *
 *
 * @author 
 * @version 1.00 2020/5/7
 */

public class LinkedList {
	
	private static class Node {
		private int data;
		private Node next;
		private Node(int data) {
			this.data = data;
		}
	}
	
	Node head;
	
	public void append(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	public void prepend(int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public void deleteWithValue(int data) {
		if (head == null) return;
		if (head.data == data) {
			head = head.next;
			return;
		}
		Node current = head;
		while(current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}

}