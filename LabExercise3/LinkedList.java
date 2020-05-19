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
	int size;
	Node head;
	
	
	public void insertNode(int data) {
		if(head == null) {
			head = new Node(data);
			this.size = 1;
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
		this.size += 1;
	}
	
	public int getFirst() {
		return head.data;
	}
	public int getListSize(){
		return size;
	}
	public void printNodes() {
		if (this.size < 1)
			System.out.println("There are no nodes in the linked list");
		else {
			Node current = this.head;
			for (int i = 0; i < this.size; i++) {

				System.out.println("Data = " + current.data);
				current = current.next;
			}
		}
	}
	public void insertNth(int data, int position) {
		Node node = new Node(data);
		Node current = this.head;
		if (this.head != null && position <= this.size) {
			for (int i = 1; i < position-1; i++) {
				current = current.next;
			}
			node.next = current.next;
			current.next = node;
			this.size += 1;
		}else{
			System.out.println("Exceeded the linked list size. Current Size: "+size);
		}
	}
	public void deleteFirstNode() {
		if(head != null){
			this.head = this.head.next;
			this.size--;
		}else{
			System.out.println("Linked list is empty");
		}
	}
}