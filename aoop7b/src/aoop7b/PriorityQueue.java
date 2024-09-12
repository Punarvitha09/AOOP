package aoop7b;


import java.util.ArrayList;
import java.util.Comparator;

public class PriorityQueue<T> {
 private ArrayList<T> heap;
 private Comparator<? super T> comparator;

 public PriorityQueue(Comparator<? super T> comparator) {
     this.heap = new ArrayList<>();
     this.comparator = comparator;
 }

 public void enqueue(T item) {
     heap.add(item);
     siftUp(heap.size() - 1);
 }

 public T dequeue() {
     if (isEmpty()) {
         throw new RuntimeException("Priority Queue is empty");
     }
     T result = heap.get(0);
     T lastItem = heap.remove(heap.size() - 1);
     if (!isEmpty()) {
         heap.set(0, lastItem);
         siftDown(0);
     }
     return result;
 }

 public T peek() {
     if (isEmpty()) {
         throw new RuntimeException("Priority Queue is empty");
     }
     return heap.get(0);
 }

 public boolean isEmpty() {
     return heap.isEmpty();
 }

 private void siftUp(int index) {
     while (index > 0) {
         int parentIndex = (index - 1) / 2;
         if (comparator.compare(heap.get(index), heap.get(parentIndex)) <= 0) {
             break;
         }
         swap(index, parentIndex);
         index = parentIndex;
     }
 }

 private void siftDown(int index) {
     int lastIndex = heap.size() - 1;
     while (index <= lastIndex) {
         int leftChildIndex = 2 * index + 1;
         int rightChildIndex = 2 * index + 2;
         int largestIndex = index;

         if (leftChildIndex <= lastIndex && comparator.compare(heap.get(leftChildIndex), heap.get(largestIndex)) > 0) {
             largestIndex = leftChildIndex;
         }
         if (rightChildIndex <= lastIndex && comparator.compare(heap.get(rightChildIndex), heap.get(largestIndex)) > 0) {
             largestIndex = rightChildIndex;
         }
         if (largestIndex == index) {
             break;
         }
         swap(index, largestIndex);
         index = largestIndex;
     }
 }

 private void swap(int index1, int index2) {
     T temp = heap.get(index1);
     heap.set(index1, heap.get(index2));
     heap.set(index2, temp);
 }
}
