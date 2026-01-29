public class Passenger {

    String ticketType;

    Passenger(String ticketType){
        this.ticketType = ticketType;
    }

    String board(){
        return "I board the bus.";
    }

    String identity(){
        return "I am the passenger." + " I pay "+ ticketType + " fee. " + board() ;
    }

}
