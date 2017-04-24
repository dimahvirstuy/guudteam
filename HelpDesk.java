import java.util.ArrayList;
import cs1.Keyboard;

public class HelpDesk {
    private static ArrayPriorityQueue<Ticket> _queue;
    private static ArrayList<String> _serviceList;
    private static ArrayList<String> _solutionList;
    private static int len = 0;
    private static int passed = 0;

    //makes a new queue, list of services offered, and list of solutions to these services
    public static void setup(){
	_queue = new ArrayPriorityQueue<Ticket>();
	_serviceList = new ArrayList<String>();
	_solutionList = new ArrayList<String>();
	populateServices();
    }

    //added services to the services offered list, and adds solutions to the solutions list
    public static void populateServices(){
	_serviceList.add("I want to reset password");
	_solutionList.add("clicking reset password");
	_serviceList.add("I spilled coffee on my computar");
	_solutionList.add("wiping up the coffee");
	_serviceList.add("My computar blew up");
	_solutionList.add("buying a new computer");
	_serviceList.add("I just want to talk");
	_solutionList.add("giving you a ducky");
    }
    //customized printing of the services offered
    public static void printServices(){
	for (int i = 0 ; i < _serviceList.size(); i++){
	    System.out.println( i + ". " + _serviceList.get(i) );
	}
    }
    //starts the process to create a ticket
    //requires the name, problem, description, solution, and priority of the person and problem being experienced
    //priority is a random integer value
    public static void makeTicket() {
	System.out.println("\nWhat's your name, friend?");
	String user = Keyboard.readString();	
	System.out.println( "\nWhich of these is your problem, " + user + "?");
	printServices();
	int response = Keyboard.readInt();
	if (response >= _serviceList.size()){
	    System.out.println("\nThat's not a problem we can help with sorry!");
	    return;
	}
	String description = _serviceList.get(response);
	String solution = _solutionList.get(response);
	int priority = (int)(Math.random() * 10);
	_queue.add(new Ticket(user, description, solution, priority, len));
	len++;
	System.out.println("\nGotcha " + user + ", you're on the queue and there are " + (_queue.size()-1) + " people on it with you you, please wait"); 
    }

    //removes the minimum value (priority) ticket from the queue, and processes that ticket
    public static void processQueue(){
	if (_queue.isEmpty()){
	    System.out.println("//There is nothing to process. Our queue is currently empty.");
	    return;
	}
	processTicket(_queue.removeMin());
    }
	
    //tells the user that submitted the request that it has been taken care of
    public static void processTicket(Ticket ticket){
	System.out.println("\n\nHey " + ticket.getName() +", luckily we just solved your problem!! If you're wondering, your problem was '' " + ticket.getProblem() + "'' and we did it by " + ticket.getSolution() +".");
    }
    
	
    public static void main(String[] args) {
        setup();
	//while loops keeps the HelpDesk constantly running
	//response 1 allows the user to create a ticket
	//response 2 allows the user to watch the HelpDesk fix the next problem
	//response 3 allows the user to see the remaining requests on the queue
	while (true){//len-passed > 0){
	    System.out.println("\n\nHello! How can we help you?");
	    System.out.println("1. I have a problem lolz\n2. I'm just here to watch the HelpDesk run\n3. How's the queue looking?");
	    int response = Keyboard.readInt();
	    if (response == 1){
		makeTicket();
	    } else if (response == 2){
		processQueue();
	    } else if (response == 3){
		System.out.println(_queue);
		System.out.println("We can't show you what each person's problem was because of our confidentiality agreement");
	    } else {
		System.out.println("\nThat is just not one of the options we presented");
	    }
	}
	   
	    
    }

    
}
