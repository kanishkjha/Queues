package practice;

public class QueueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		QueueUsingArray queue= new QueueUsingArray(1);
		QueueUsingLL queue= new QueueUsingLL();
		
		for(int i=1; i<=100; i++) {
			queue.enqueue(i);
		}
		
		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// Never reach here.
			}
		}
		
//		System.out.println(queue.size);
		
		// Testing QueueUsingTwoStacks, whether it is working fine or not. 

	}

}
