public class Engine {

    String fuelType;

    Engine(String fuelType){
        this.fuelType = fuelType;
    }

    String startEngine(){
        return "I have started and I am ready to accelerate.";
    }

    String identity(){
        return "I am the Engine. " + fuelType +" is my fuel type. " + startEngine();
    }

}
