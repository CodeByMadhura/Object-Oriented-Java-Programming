import java.util.*;

class Ticket{
	private int ticketId;
	private String passengerName;
	private String source;
	private String destination;
	private int fare;
	static int bookings = 0;
	
	
	public Ticket(int ticketId, String passengerName, String source, String destination, int fare){
		this.ticketId = ticketId;
		this.passengerName = passengerName;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		bookings++;
	}
	
	public int getTicketId(){
		return ticketId;
	}
	
	public String getPassengerName(){
		return passengerName;
	}
	
	public String getSource(){
		return source;
	}
	
	public String getDestination(){
		return destination;
	}
	
	public int getFare(){
		return fare;
	}
	
	public void updateFare(int newFare){
    this.fare = newFare;
}
	

	
	public void displayTicketDetails(){
		System.out.println("Ticket ID: " + ticketId);
		System.out.println("Passenger Name: " + passengerName);
		System.out.println("Source: " + source);
		System.out.println("Destination: " + destination);
		System.out.println("Fare: " + fare);
	}
	

 
 
 

}


public class TransportTicketSystem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<Ticket> tickets = new ArrayList<>();
		
		
		System.out.println("TOtal Number of bookings: " );
		int n = sc.nextInt();
		
			sc.nextLine();
		
		for(int i=0; i <n; i++){
			System.out.println("Ticket " + (i + 1 ) + " Details: ");
			
			System.out.print("Ticket Id: " );
			int id = sc.nextInt();
			
				sc.nextLine();
			
			System.out.print("Passenger Name: " );
			String name = sc.nextLine();
			
			System.out.print("Source: " );
			String source = sc.nextLine();
			
			
			System.out.print("Destination: " );
			String dest = sc.nextLine();
			
			
			System.out.print("Fare: " );
			int f = sc.nextInt();
			
			sc.nextLine();
			
			Ticket t = new Ticket(id, name, source, dest, f);
			
			tickets.add(t);
			
			
		}
		
		System.out.println("------- Ticket Details ------ ");
		
		for(Ticket t: tickets){
			t.displayTicketDetails();
		}
		
		     int totalFare = 0;
        for (Ticket t : tickets) {
            totalFare += t.getFare();
        }

        System.out.println("Total Fare: " + totalFare);

   
        if (!tickets.isEmpty()) {
            tickets.get(0).updateFare(500);
        }
		
		System.out.println("Total Bookimgs: " + Ticket.bookings);
	}
}