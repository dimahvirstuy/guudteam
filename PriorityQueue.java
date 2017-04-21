public interface PriorityQueue<T>{

    void add(T O);
    //Adds an item to this priority queue.

    boolean isEmpty();
    //Returns true if this stack is empty, otherwise returns false.

    T peekMin();
    //Returns the smallest item stored in this priority queue without removing it.

    T removeMin();
    //Removes and returns the smallest item stored in this priority queue.
  

}
