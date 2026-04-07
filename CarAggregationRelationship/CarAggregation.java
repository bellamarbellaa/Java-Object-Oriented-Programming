package CarAggregationRelationship;

class CarAggregation {
    private EngineAggregation engine;


    CarAggregation(EngineAggregation engineVal) {
        this.engine = engineVal;
    }


    void drive() {
        engine.start();
        System.out.println("Car is moving....");
    }


    public static void main(String[] args) {
        EngineAggregation engine = new EngineAggregation(); //engine exists indpendently
        CarAggregation car = new CarAggregation(engine); //engine is injected via the constructor
        car.drive();
    }
}


