/**
 * @(#)Test.java
 *
 *
 * @author 
 * @version 1.00 2020/5/6
 */


public class Test {

    public static void main(String[] args) {
    	Stack s1 = new Stack();
    	Stack s2 = new Stack();
    	
    	String list[] = {
    		"Winter", "Spring", "Summer", "Fall", "Cold", "Warm", "Hot"
    	}; 
    	/*int list[] = {
    		1, 2, 3, 4, 5, 6, 7
    	};*/
    	
    	for(int i=0; i < 7; i++) {
    		s1.push(list[i]);
    	
    	}
    	mystery(s1, s2);	
    	while(!s2.isEmpty()) {
    		System.out.print(s2.peek()+ " ");
    		s2.pop();
    	}
    	System.out.println();
    }
    
    public static void mystery(Stack s, Stack t) {
    	while(!s.isEmpty()) {
    		t.push(s.peek());
    		s.pop();
    	}
    }
    
}