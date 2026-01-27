public class Passenger {
    String ticketType;

    Passenger(String ticketType){
        this.ticketType = ticketType;
    }

    String identity(){
        return "I am the passenger. Ticket type: " + ticketType + ".";
    }

}