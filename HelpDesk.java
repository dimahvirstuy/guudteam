public class HelpDesk {
    ArrayPriorityQueue _data;
    int len = 0;
    int passed = 0;
    
    public void makeTicket() {
	System.out.println("What's your name, friend?");
	String user = Keyboard.readString();
	System.out.println( "What's the problem, " + user + "?");
	String Description = Keyboard.readString();
	int priority = (int)(Math.random * 10);
	_data.add(new Ticket(user, Description, priority, len));
	len++;
    }
	
	System.out.println("Gotcha " + user + ", you're on the queue and there are " + len - passed + "people in fron of you, please wait"); 
	
	
    public static void main(String[] args) {
	makeTicket();
}

		    
