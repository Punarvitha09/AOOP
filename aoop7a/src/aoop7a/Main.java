package aoop7a;

//Main.java
public class Main {
 public static void main(String[] args) {
     // Test LinkedListStack
     System.out.println("Testing LinkedListStack:");
     LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
     linkedListStack.push(1);
     linkedListStack.push(2);
     linkedListStack.push(3);
     System.out.println("Top element (peek): " + linkedListStack.peek()); // 3
     System.out.println("Popped element: " + linkedListStack.pop()); // 3
     System.out.println("Is stack empty? " + linkedListStack.isEmpty()); // false

     // Test ArrayStack
     System.out.println("\nTesting ArrayStack:");
     ArrayStack<String> arrayStack = new ArrayStack<>(5);
     arrayStack.push("Hello");
     arrayStack.push("World");
     System.out.println("Top element (peek): " + arrayStack.peek()); // World
     System.out.println("Popped element: " + arrayStack.pop()); // World
     System.out.println("Is stack empty? " + arrayStack.isEmpty()); // false

     // Additional Tests
     System.out.println("\nTesting ArrayStack with Float:");
     ArrayStack<Float> floatStack = new ArrayStack<>(5);
     floatStack.push(1.1f);
     floatStack.push(2.2f);
     System.out.println("Top element (peek): " + floatStack.peek()); // 2.2
     System.out.println("Popped element: " + floatStack.pop()); // 2.2
     System.out.println("Is stack empty? " + floatStack.isEmpty()); // false
 }
}
