public interface PriorityQueue{

    void add(Object O);
    //Adds an item to this priority queue.

    boolean isEmpty();
    //Returns true if this stack is empty, otherwise returns false.

    Object peekMin();
    //Returns the smallest item stored in this priority queue without removing it.

    Object removeMin();
    //Removes and returns the smallest item stored in this priority queue.
  

}
