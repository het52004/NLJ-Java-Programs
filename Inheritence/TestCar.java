public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        SuperCar superCar = new SuperCar();
        car.setCarData("Ferrari", "Red", 2021, 200);
        superCar.setSuperCarData("Ferrari", "Red", 2021, 200, 100);
        System.out.println("Car Data:");
        car.getCarData();
        System.out.println("Super Car Data:");
        superCar.getSuperCarData();
    }
}
