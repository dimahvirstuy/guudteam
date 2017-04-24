public class Ticket implements Comparable<Ticket>{
    
    private int id;
    private int priority;
    private String problem;
    private Boolean solved;
    private String name;
    private String solution_descrip;

    //default constructor, mostly for initial testing
    public Ticket(){
	id = -1;
	priority = 0;
	problem = "";
	solved = false;
	name = "Bob";
	solution_descrip = "";
    }

    //custom constructor
    //takes values for username, description, solution, priority, and ID
    public Ticket(String user, String Description, String Solution, int Priority, int len){
	name = user;
	problem = Description;
	priority = Priority;
	id = len;
	solution_descrip = Solution;
	solved = false;
    }

    //accessor to return name
    public String getName(){
	return name;
    }
    //accessor to return the problem description
    public String getProblem(){
	return problem;
    }
    //accessor to return the solution description
    public String getSolution(){
	return solution_descrip;
    }
    //accessor to return the priority
    public int getPrior(){
	return priority;
    }

    //compares two tickets to determine which one is seen as less
    //a ticket with a lower priority is seen as a smaller ticket
    //a ticket with a higher priority is seen as a larger ticket
    public int compareTo(Ticket t){
	if (t.getPrior() > getPrior())
	    return -1;
	else if (t.getPrior() < getPrior())
	    return 1;
	else
	    return 0;
    }

    //customized toString prints out the ID, name, and priority associated with a ticket
    public String toString(){
        return "ID: " + id + ", Name: " + name + ", Priority: " + priority;
	
    }

}
