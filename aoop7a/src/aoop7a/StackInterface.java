package aoop7a;

public interface StackInterface<T> {
	 void push(T item);
	    T pop();
	    T peek();
	    boolean isEmpty();
}
