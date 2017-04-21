public class Ticket implements Comparable{
    
    private int id;
    private int VIPLevel;
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

}
