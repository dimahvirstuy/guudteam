public class Ticket implements Comparable{
    
    private int id;
    private int priority;
    private String problem;
    private Boolean b;
    private String name;
    private String solution_descrip;

    public Ticket(){
	id = -1;
	VIPLevel = 0;
	problem = "";
	b = false;
	name = "Bob";
	solution_descrip = "";
    }

    public Ticket(String user, String Description, String Priority, int len){
	name = user;
	problem = Description;
	priority = Priority;
	id = len;
	solution_descrip = "";
	b = false;
    }

    

}
