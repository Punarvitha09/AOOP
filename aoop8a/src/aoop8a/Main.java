package aoop8a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
 public static void main(String[] args) {
     
     List<String> strings = new ArrayList<>();
     strings.add("banana");
     strings.add("apple");
     strings.add("cherry");
     strings.add("date");


     Collections.sort(strings, (s1, s2) -> s2.compareTo(s1));

     System.out.println("Sorted list in descending order: " + strings);
 }
}
