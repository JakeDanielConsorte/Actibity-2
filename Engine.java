public class Engine {
    String fuelType;

    Engine(String fuelType){
        this.fuelType = fuelType;
    }

    String identity(){
        return "I am the Engine. " + fuelType +" is my fuel type";
    }

}