public class Main{
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Car Data");
        car.setCarData("BMW", 100);
        car.getCarData();
        System.out.println();

        Car.Engine engine = car.new Engine();
        System.out.println("Engine Data");
        engine.setEngineData(134);
        engine.getEngineData();
        System.out.println();
        
        SuperCar superCar = new SuperCar();
        System.out.println("Super Car Data");
        superCar.setSuperCarData("Audi", 200, 2);
        superCar.getSuperCarData();
    }
}