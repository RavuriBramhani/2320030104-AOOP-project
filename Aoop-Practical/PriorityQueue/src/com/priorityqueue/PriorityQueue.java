package com.priorityqueue;

import java.util.Arrays;
import java.util.Comparator;

public class PriorityQueue <T extends Comparable<T>> {
	
	private T[] heap;
    private int size;

  
    public PriorityQueue(int capacity) {
    	heap = (T[]) new Comparable[capacity];

        size = 0;
    }

    public void insert(T value) {
        if (size == heap.length) {
            heap = Arrays.copyOf(heap, size * 2); 
        }
        heap[size] = value;
        size++;
        heapifyUp(size - 1);
    }

    public T remove() {
        if (isEmpty()) {
            throw new RuntimeException("Priority queue is empty");
        }
        T removedValue = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return removedValue;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Priority queue is empty");
        }
        return heap[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap[index].compareTo(heap[parentIndex]) < 0) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        while (index < size) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int smallestChildIndex = index;

            if (leftChildIndex < size && heap[leftChildIndex].compareTo(heap[smallestChildIndex]) < 0) {
                smallestChildIndex = leftChildIndex;
            }

            if (rightChildIndex < size && heap[rightChildIndex].compareTo(heap[smallestChildIndex]) < 0) {
                smallestChildIndex = rightChildIndex;
            }
            if (smallestChildIndex != index) {
                swap(index, smallestChildIndex);
                index = smallestChildIndex;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }



}
