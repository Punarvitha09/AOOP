package aoop7b;
import java.util.Comparator;

public class Main {
 public static void main(String[] args) {
     
     System.out.println("Testing PriorityQueue with Integers:");
     PriorityQueue<Integer> intQueue = new PriorityQueue<>(Comparator.naturalOrder());
     intQueue.enqueue(5);
     intQueue.enqueue(2);
     intQueue.enqueue(8);
     System.out.println("Peek: " + intQueue.peek()); // 2
     System.out.println("Dequeue: " + intQueue.dequeue()); // 2
     System.out.println("Peek: " + intQueue.peek()); // 5

     
     System.out.println("\nTesting PriorityQueue with Doubles:");
     PriorityQueue<Double> doubleQueue = new PriorityQueue<>(Comparator.naturalOrder());
     doubleQueue.enqueue(3.5);
     doubleQueue.enqueue(1.2);
     doubleQueue.enqueue(4.8);
     System.out.println("Peek: " + doubleQueue.peek()); // 1.2
     System.out.println("Dequeue: " + doubleQueue.dequeue()); // 1.2
     System.out.println("Peek: " + doubleQueue.peek()); // 3.5

     
     System.out.println("\nTesting PriorityQueue with Strings:");
     PriorityQueue<String> stringQueue = new PriorityQueue<>(Comparator.naturalOrder());
     stringQueue.enqueue("banana");
     stringQueue.enqueue("apple");
     stringQueue.enqueue("cherry");
     System.out.println("Peek: " + stringQueue.peek()); // apple
     System.out.println("Dequeue: " + stringQueue.dequeue()); // apple
     System.out.println("Peek: " + stringQueue.peek()); // banana
 }
}
