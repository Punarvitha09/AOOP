package aoop8b;

//Main.java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
 public static void main(String[] args) {
     // Create a list of integers
     List<Integer> numbers = new ArrayList<>();
     numbers.add(1);
     numbers.add(2);
     numbers.add(3);
     numbers.add(4);
     numbers.add(5);
     numbers.add(6);
     numbers.add(7);
     numbers.add(8);
     numbers.add(9);
     numbers.add(10);

     // Stream pipeline to filter even numbers, double them, and collect into a list
     List<Integer> doubledEvens = numbers.stream()
         .filter(n -> n % 2 == 0) // Filter even numbers
         .map(n -> n * 2)        // Double them
         .collect(Collectors.toList()); // Collect into a list

     // Print the result
     System.out.println("Doubled even numbers: " + doubledEvens);
 }
}
