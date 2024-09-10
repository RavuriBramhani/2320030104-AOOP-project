package com.generic;

public class Main {

	public static void main(String[] args) {
		
		Stack<Integer> linkedListStack = new LinkedList<>();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        System.out.println("LinkedListStack Integer:");
        LinkedList<Integer> linkedList;
		System.out.println("Peek: " + linkedList.peek());
        System.out.println("Pop: " + linkedList.pop());
        System.out.println("Peek after pop: " + linkedList.peek());

        Stack<Double> arrayStack = new ArrayStack<>();
        arrayStack.push(1.1);
        arrayStack.push(2.2);
        arrayStack.push(3.3);
        System.out.println("\nArrayStack Double:");
        System.out.println("Peek: " + ArrayStack.peek());
        System.out.println("Pop: " + arrayStack.pop());
        System.out.println("Peek after pop: " + arrayStack.peek());

        Stack<String> stringStack = new LinkedListStack<>();
        stringStack.push("apple");
        stringStack.push("banana");
        stringStack.push("cherry");
        System.out.println("\nLinkedListStack String:");
        System.out.println("Peek: " + stringStack.peek());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Peek after pop: " + stringStack.peek());

	}

}
