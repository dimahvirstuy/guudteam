//used as a java utility
import java.util.ArrayList;

public class ArrayPriorityQueue<T> implements PriorityQueue<T>{

    //ArrayList is the body of the queue
    private ArrayList _queue;
    //to be used in methods
    private int _size;
    
    //default constructor: empty ArrayList
    public ArrayPriorityQueue(){
	//open-ended ArrayList
	_queue = new ArrayList<T>();
	//initialize size
	_size = 0;
    }

    //returns whether the queue is empty
    public boolean isEmpty(){
	return _size == 0;
    }

    //O(1) version of add
    public void add(T o){
	_queue.add(o);
	//uses the basic ArrayList mechanism, tacks onto the end
	_size += 1;
    }
    
    //O(n) version of peekMin()
    //goes through the entire queue, returns the smallest value
    public T peekMin(){
    	if (isEmpty())
	    //no value
    		return null;
    	T min = (T)_queue.get(0);
	//first object in the queue
    	for (int x = 0; x < _size; x += 1){
    		if (((Comparable)min).compareTo(_queue.get(x)) > 0)
		    //traverse+compare mechanism
    			min = (T)_queue.get(x);
    	}
    	return min;
    }
    
    //O(n) version of removeMin()
    //goes through, removes & returns smallest value
    public T removeMin(){
    	if (isEmpty())
	    //base case: no value to return
    		return null;
    	T min = (T)_queue.get(0);
	//second tracker value: minPos
	//while min is simply used for comparison's sake, minPos accompanies,
	//and is actually used as the argument when remove() is called
    	int minPos = 0;
    	for (int x = 0; x < _size; x += 1){
    		if (((Comparable)min).compareTo(_queue.get(x)) > 0){
    			min = (T)_queue.get(x);
    			minPos = x;
    		}
    	}
	//minPos is the argument
    	_queue.remove(minPos);
	_size -= 1;
    	return min;
    }
    // public String toString(){
    //	return _queue.toString();
    //}
    public String toString(){
	String rtn = "";
	for (int i = 0 ; i < _queue.size(); i++){
	    rtn += _queue.get(i) + "\n";
	}
	return rtn;
    }
    
    public static void main(String[] args){
	ArrayPriorityQueue jenny = new ArrayPriorityQueue();
	System.out.println(jenny.isEmpty());//should be true

	//adding Jenny's number
	jenny.add(8);
	jenny.add(6);
	jenny.add(7);
	jenny.add(5);
	jenny.add(3);
	jenny.add(0);
	jenny.add(9);
	System.out.println(jenny);

	//removing nombres one by one
	System.out.println(jenny.peekMin());
	System.out.println(jenny.removeMin());
	System.out.println(jenny.isEmpty());
	//0, false

	System.out.println(jenny.peekMin());
	System.out.println(jenny.removeMin());
	System.out.println(jenny.isEmpty());
	//3, false

	System.out.println(jenny.peekMin());
	System.out.println(jenny.removeMin());
	System.out.println(jenny.isEmpty());
	//5, false

	System.out.println(jenny.peekMin());
	System.out.println(jenny.removeMin());
	System.out.println(jenny.isEmpty());
	//6, false
	
	System.out.println(jenny.peekMin());
	System.out.println(jenny.removeMin());
	System.out.println(jenny.isEmpty());
	//7, false

	System.out.println(jenny.peekMin());
	System.out.println(jenny.removeMin());
	System.out.println(jenny.isEmpty());
	//8, false

	System.out.println(jenny.peekMin());
	System.out.println(jenny.removeMin());
	System.out.println(jenny.isEmpty());
	//9, true	
    }
    
}

