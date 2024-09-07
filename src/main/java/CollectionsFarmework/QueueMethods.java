package CollectionsFarmework;

import java.util.PriorityQueue;

public class QueueMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq=new PriorityQueue(2);
		pq.add(100);
		pq.add(200);
		pq.add(400);
		System.out.println(pq);
		pq.offer(500);
		System.out.println(pq);
		System.out.println(pq.element());
		System.out.println(pq.peek());
		System.out.println(pq.remove());
		System.out.println(pq);
		

	}

}
