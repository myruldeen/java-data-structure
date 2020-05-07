/**
 * @(#)Stack.java
 *
 *
 * @author 
 * @version 1.00 2020/5/6
 */


public class Stack {
	
	private static class Node {
		private int data;
		private Node next;
		private Node(int data) {
			this.data = data;
		}
	}
	
	private Node top;
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int peek() {
		return top.data;
	}
	
	public void push(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
	}
	
	/* public void push(String data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
	} */
	
	public int pop() {
		int data = top.data;
		top = top.next;
		return data;
	}
}