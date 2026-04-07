package CarRelationships;
 
public class Engine {
    private String type;
    private int horsepower;


    public Engine(String t, int hp) {
        type = t;
        horsepower = hp;
    }


    public void ignite() {
        System.out.println("Engine " + type + " igniting with " + horsepower + " HP....");
    }


    public void stop() {
        System.out.println("Engine " + type + " is broken. It needs fixing");
    }
}

