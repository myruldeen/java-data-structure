/**
 * @(#)Exercise2.java
 *
 *
 * @author 
 * @version 1.00 2020/5/18
 */
import java.util.*;

public class Exercise2 {

    public static void main (String[] args) {
    	Scanner x = new Scanner(System.in); 
    	System.out.print("Input the number of node: ");
    	
    	// Get the value from input
	int nodeList = x.nextInt();
    	
    	// Initiate arrayList
    	List<Integer> list = new ArrayList<Integer>();
    	// Loop 
    	for(int i=0; i < nodeList; i++) {
    		
    		System.out.print("Input data for node "+(i + 1)+ ": ");
    		
    		int node = x.nextInt();
		list.add(node);
    	}

	System.out.println("Data entered in the list are : ");
	for(int i=0; i<list.size(); i++) {
		System.out.println("Data = " + list.get(i));
	}
    	System.out.println("Total number of nodes= " + list.size());
    	
    	// Insert data at the end of the list
    	System.out.print("Input data to insert at the end of the list : ");
    	
    	// Get the value from input
	int nd = x.nextInt();
	list.add(nd);
	System.out.println("Data, after inserted in the list are : ");
		
	// Loop
	for(int i=0; i<list.size(); i++) {
		System.out.println("Data = " + list.get(i));
	}
    	System.out.println("Total number of nodes= " + list.size());
    	
    	// Insert data at the middle of the list
    	System.out.print("Input data to insert in the middle of the list : ");
   
	int middle = x.nextInt();

	// Get position
    	System.out.print("Input the position to insert new node :");

    	// Get the value from input
	int position = x.nextInt();
		
	// Add nth 
	list.add(position, middle);
		
	System.out.println("Insertion completed successfully.");
	System.out.println("The new list are :");
	// Loop data
	for(int i=0; i<list.size(); i++) {
		System.out.println("Data = " + list.get(i));
	}
			
	System.out.println("Total number of nodes= " + list.size());
		
	// Delete at first index
	System.out.println("Data of node 1 which is being deleted is :"+list.get(0));
	
    	list.remove(0);
    	System.out.println("The new list are :");
	// Loop data
	for(int i=0; i<list.size(); i++) {
		System.out.println("Data = " + list.get(i));
	}
	System.out.println("Total number of nodes= " + list.size());
    }
    
}