/**
 * @(#)Main.java
 *
 *
 * @author 
 * @version 1.00 2020/5/19
 */

import java.util.*;
public class Main {

    public static void main (String[] args) {
    	Scanner s = new Scanner(System.in);
    	
    	System.out.print("Input the number of node: ");
    	LinkedList list = new LinkedList();
    	// Get the value from input
		int nodeList = s.nextInt();
		for(int i=0; i < nodeList; i++) {
    		
    		System.out.print("Input data for node "+(i + 1)+ ": ");
    		
    		int node = s.nextInt();
			list.insertNode(node);
    	}
    	System.out.println("Data entered in the list are :");
    	list.printNodes();
    	System.out.println("Total number of nodes = "+list.getListSize());
    	
    	// Insert data at the end of the list
    	System.out.print("Input data to insert at the end of the list :");
    	int data = s.nextInt();
    	list.insertNode(data);
    	System.out.println("Data, after inserted in the list are :");
    	list.printNodes();
    	System.out.println("Total number of nodes = "+list.getListSize());
    	
    	// Insert in the middle
    	System.out.print("Input data to insert in the middle of the list :");
    	int middle = s.nextInt();
    	System.out.print("Input the position to insert new node :");
    	int position = s.nextInt();
    	list.insertNth(middle, position);
    	System.out.println("Insertion completed successfully.");
    	System.out.println("The new list are :");
    	list.printNodes();
    	System.out.println("Total number of nodes = "+list.getListSize());
    	
    	// Delete first node
    	System.out.println("Data of node 1 which is being deleted is :"+ list.getFirst());
    	list.deleteFirstNode();
    	System.out.println("Data, after deletion of first node :");
    	System.out.println("The new list are :");
    	list.printNodes();
    	System.out.println("Total number of nodes = "+list.getListSize());
    }
    
    
}