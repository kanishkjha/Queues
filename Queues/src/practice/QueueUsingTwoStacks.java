package practice;
import java.util.Stack;

public class QueueUsingTwoStacks {

	    //Define the data members
	    private Stack<Integer> stack1=new Stack<Integer>();
	    private Stack<Integer> stack2= new Stack<Integer>();


	    QueueUsingTwoStacks() {
	        // Nothing required here
	    }



	    /*----------------- Public Functions of Queue -----------------*/


	    public int getSize() { 
	        return stack1.size();
	    }

	    public boolean isEmpty() {
	        return (stack1.size()==0);
	    }

	    public void pushElement(int element) {
	        //Implement the push(element) function
	        stack1.push(element);
	    }

	    public int popElement() {
	    	 if (isEmpty()) {
	    	        return -1; // Handle underflow condition; you can choose your specific approach
	    	    }

	    	    while (!stack1.isEmpty()) {
	    	        stack2.push(stack1.pop());
	    	    }

	    	    int poppedElement = stack2.pop();

	    	    while (!stack2.isEmpty()) {
	    	        stack1.push(stack2.pop());
	    	    }

	    	    return poppedElement;
	    }

	    public int top() {
	        if(isEmpty()) {
	        	return -1;
	        }
	        
	        while(!stack1.isEmpty()) {
	        	stack2.push(stack1.pop());
	        }
	        
	        int temp= stack2.peek();
	        
	        while(!stack2.isEmpty()) {
	        	stack1.push(stack2.pop());
	        }
	        
	        return temp;
	    }

}
