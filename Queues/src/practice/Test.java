package practice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueUsingTwoStacks queue= new QueueUsingTwoStacks();
		
		for(int i=1; i<11; i++) {
			queue.pushElement(i);
		}
		
		while(!queue.isEmpty()) {
			System.out.println(queue.popElement());
		}
		
		queue.pushElement(29);
		queue.pushElement(30);
		System.out.println(queue.top());
	}

}
