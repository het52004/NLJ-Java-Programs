public class SuperCar extends Car {
    private int turbo;
    public void setSuperCarData(String name, int speed, int turbo) {
        this.name = name;
        // this.speed = speed; // private variable of parent class cannot be accessed also cannot be printed
        this.turbo = turbo;
    }

    public void getSuperCarData() {
        System.out.println("Name: " + name + " Turbo: " + turbo);
    }
}
