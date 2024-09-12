package aoop7a;

//ArrayStack.java
public class ArrayStack<T> implements StackInterface<T> {
 private T[] stack;
 private int top;
 private int capacity;
 @SuppressWarnings("unchecked")
 public ArrayStack(int size) {
     this.capacity = size;
     stack = (T[]) new Object[capacity];
     this.top = -1;
 }

 @Override
 public void push(T item) {
     if (top == capacity - 1) {
         throw new RuntimeException("Stack is full");
     }
     stack[++top] = item;
 }

 @Override
 public T pop() {
     if (isEmpty()) {
         throw new RuntimeException("Stack is empty");
     }
     return stack[top--];
 }

 @Override
 public T peek() {
     if (isEmpty()) {
         throw new RuntimeException("Stack is empty");
     }
     return stack[top];
 }

 @Override
 public boolean isEmpty() {
     return top == -1;
 }
}