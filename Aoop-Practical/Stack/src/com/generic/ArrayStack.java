package com.generic;

public class ArrayStack<T> implements Stack<T> {
	private static final int INITIAL_CAPACITY = 10;
    private T[] array;  
    private int size;

  
    public ArrayStack() {
        array = (T[]) new Object[INITIAL_CAPACITY];  
        size = 0;
    }

    public void push(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T element = array[--size];
        array[size] = null; 
        return element;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            T[] newArray = (T[]) new Object[newCapacity]; 
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

	@Override
	public T push() {
		// TODO Auto-generated method stub
		return null;
	}
}
