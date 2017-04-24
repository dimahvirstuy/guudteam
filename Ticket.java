public class Ticket implements Comparable<Ticket>{
    
    private int id;
    private int priority;
    private String problem;
    private Boolean solved;
    private String name;
    private String solution_descrip;

    public Ticket(){
	id = -1;
	priority = 0;
	problem = "";
	solved = false;
	name = "Bob";
	solution_descrip = "";
    }

    public Ticket(String user, String Description, int Priority, int len){
	name = user;
	problem = Description;
	priority = Priority;
	id = len;
	solution_descrip = "";
	solved = false;
    }
    public String getName(){
	return name;
    }
    public String getSolution(){
	return solution_descrip;
    }
    public int getPrior(){
	return priority;
    }

    public int compareTo(Ticket t){
	if (t.getPrior() > getPrior())
	    return -1;
	else if (t.getPrior() < getPrior())
	    return 1;
	else
	    return 0;
    }

    public String toString(){
        return "ID: " + id + ", Name: " + name;
	
    }

}
