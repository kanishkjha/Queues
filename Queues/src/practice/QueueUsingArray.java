package practice;

public class QueueUsingArray {
	
	private int data[];
	private int rear;
	private int front;
	private int size;
	
	public QueueUsingArray() {
		data= new int[10];
		rear=-1;
		front=-1;
		size=0;
	}
	
	public QueueUsingArray(int capacity) {
		data= new int[capacity];
		rear=-1; // index at which rear element is stored.
		front=-1; // index at which front element is stored.
		size=0;
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return (size==0);
	}
	
	int front() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		
		return data[front];
	}
	
	void enqueue(int element){
		
		if(size==data.length) {
//			throw new QueueFullException();/
			doubleCapacity(element);
		}
		
		if(size==0) {
			front=0;
		}
		
		size++;
		
		// rear=(rear+1)%data.length;
		rear ++;
		if(rear==data.length) {
			rear=0;
		}
		data[rear]=element;
	}
	
	private void doubleCapacity(int elem) {
		int temp[]=data;
		
		data=new int[temp.length*2];
		
		int index=0;
		for(int i=front; i<temp.length; i++) {
			data[index]=temp[i];
			index++;
		}
		
		for(int i=0; i<=front-1; i++) {
			data[index]=temp[i];
			index++;
		}
		
		rear=temp.length-1;
		front=0;
	}

	
	int dequeue() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		
		int temp=data[front];
		
		front++;
		
		if(front==data.length) {
			front=0;
		}
		
		size--;
		
		if(size==0) {
			front=-1;
			rear=-1;
		}
		
		return temp;
	}
}
