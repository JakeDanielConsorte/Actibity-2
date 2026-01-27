public class Driver {
    public String name;

    Driver(String name){
        this.name = name;
    }

    String identity(){
        return "I am " + name + ". The bus driver.";
    }

}