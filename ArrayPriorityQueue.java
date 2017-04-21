//Ibnul Jahan
//APCS2 pd1
//HW32 -- Getting Past the Velvet Rope
//2017-04-20

import java.util.ArrayList;
public class ArrayPriorityQueue<T extends Comparable> implements PriorityQueue{

    private ArrayList<T> _var;

    //default constructor
    public ArrayPriorityQueue(){
	_var = new ArrayList<T>();
    }
    
    // Adds an item with ArrayList's built in add method
    public void add(T x){
	_var.add(x);
    }//O(1)
    
    // checks whether the queue is empty or not 
    public boolean isEmpty(){
	return _var.size() == 0;
    }//O(1)

    // Returns the smallest item in the priority queue without removing it. 
    public T peekMin(){
	T minVal = _var.get(0);
        for (int i = 0; i < _var.size(); i++){
	    if(_var.get(i)< minVal){
		minVal = _var.get(i);
	    }
	}
	return minVal;
    }//O(n)
 
    // Removes the smallest item in the priority queue.
    public T removeMin(){
	int minInd = 0;
	for (int i = 0; i < _var.size(); i++){
	    if (_var.get(i) < _var.get(minInd)){
		minInd = i;
	    }	    
	}
	T rtn= _var.get(minInd);
	_var.remove(minInd);
	return rtn;
    }//O(n)

    public String toString(){
	String ret= "";
	for(int i=0; i<_var.size(); i++){
	    ret+= _var.get(i)+ " ";
	}
	return ret;
    }

    public static void main(String[] args){
	ArrayPriorityQueue<Integer> ibnul= new ArrayPriorityQueue<Integer>();
	System.out.println("checking if there is data in the queue");
	System.out.println(ibnul.isEmpty());
	
	ibnul.add(2);
       	ibnul.add(9);
	ibnul.add(0);

	System.out.println(ibnul);
	System.out.println("checking if there is data in the queue");
	System.out.println(ibnul.isEmpty());

	System.out.println("checking peekMin");
	System.out.println(ibnul.peekMin());
	System.out.println(ibnul);
	System.out.println();

	System.out.println("checking remove");
	
	System.out.println(ibnul.removeMin());
	System.out.println(ibnul);
	System.out.println(ibnul.removeMin());
	System.out.println(ibnul);
	System.out.println(ibnul.removeMin());
	System.out.println(ibnul);
	System.out.println("no more data to remove, thus an error");
	System.out.println(ibnul.removeMin());
    }
}
