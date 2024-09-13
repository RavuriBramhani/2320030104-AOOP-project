package com.priorityqueue;



public class Main {

	public static void main(String[] args) {
		 PriorityQueue<Integer> intQueue = new PriorityQueue<>(10);
	        intQueue.insert(5);
	        intQueue.insert(3);
	        intQueue.insert(8);
	        System.out.println("Integer Priority Queue Peek: " + intQueue.peek());
	        System.out.println("Integer Priority Queue Remove: " + intQueue.remove());
	        System.out.println("Integer Priority Queue Peek after remove: " + intQueue.peek());

	        PriorityQueue<Double> doubleQueue = new PriorityQueue<>(10);
	        doubleQueue.insert(3.5);
	        doubleQueue.insert(1.2);
	        doubleQueue.insert(4.8);
	        System.out.println("Double Priority Queue Peek: " + doubleQueue.peek());
	        System.out.println("Double Priority Queue Remove: " + doubleQueue.remove());
	        System.out.println("Double Priority Queue Peek after remove: " + doubleQueue.peek());

	        PriorityQueue<String> stringQueue = new PriorityQueue<>(10);
	        stringQueue.insert("banana");
	        stringQueue.insert("apple");
	        stringQueue.insert("cherry");
	        System.out.println("String Priority Queue Peek: " + stringQueue.peek());
	        System.out.println("String Priority Queue Remove: " + stringQueue.remove());
	        System.out.println("String Priority Queue Peek after remove: " + stringQueue.peek());


	}

}
