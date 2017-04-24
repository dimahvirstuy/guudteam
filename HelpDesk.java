import java.util.ArrayList;
import cs1.Keyboard;

public class HelpDesk {
    private static ArrayPriorityQueue<Ticket> _queue;
    private static ArrayList<String> _serviceList;
    private static int len = 0;
    private static int passed = 0;

    public static void setup(){
	_queue = new ArrayPriorityQueue<Ticket>();
	_serviceList = new ArrayList<String>();
	populateServices();
    }
    public static void populateServices(){
	_serviceList.add("reset password");
	_serviceList.add("spilled coffee");
	_serviceList.add("computer blew up");
	_serviceList.add("I just want to talk");
    }
    public static void printServices(){
	for (int i = 0 ; i < _serviceList.size(); i++){
	    System.out.println( i + ". " + _serviceList.get(i) );
	}
    }
    public static void makeTicket() {
	System.out.println("What's your name, friend?");
	String user = Keyboard.readString();
	printServices();
	System.out.println( "Which of these is your problem, " + user + "?");
	int response = Keyboard.readInt();
	if (response >= _serviceList.size()){
	    System.out.println("That's not a problem we can help with sorry!");
	    return;
	}
	String Description = _serviceList.get(response);
	int priority = (int)(Math.random() * 10);
	_queue.add(new Ticket(user, Description, priority, len));
	len++;
    }

    public static void processQueue(){}
	
    //System.out.println("Gotcha " + user + ", you're on the queue and there are " + len - passed + "people in front of you, please wait"); 
    public static void processTicket(){
	
    }
    
	
    public static void main(String[] args) {
        setup();
	while (true){//len-passed > 0){
	    System.out.println("Hello! How can we help you?");
	    System.out.println("1. I have a problem lolz\n2. I'm just here to watch the HelpDesk run\n3. How's the queue looking?");
	    int response = Keyboard.readInt();
	    if (response == 1){
		makeTicket();
	    } else if (response == 2){
		processQueue();
	    } else if (response == 3){
		System.out.println(_queue);
	    } else {
		System.out.println("That is just not one of the options we presented");
	    }
	}
	   
	    //HelpDesk desk = new HelpDesk();
	    //desk.makeTicket();
    }

    
}
