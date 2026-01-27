public class Bus {
    //Aggregation kasi from other class (outside)
    Driver driver;
    //Composition kasi inside
    Engine eng = new Engine("Diesel");

    Bus(Driver driver){
        this.driver = driver;
    }

    String identity(){
        return "I am the bus. I use a driver, boards passenger and owns an engine.";
    }

    public static void main(String[] args){
        Driver driver = new Driver("Jake");
        Passenger passenger = new Passenger("Student");
        Bus bus = new Bus(driver);

        String output =
                driver.identity() + "\n" +
                passenger.identity() + "\n" +
                bus.identity() + "\n" +
                bus.eng.identity();

        System.out.println(output);

    }
}
