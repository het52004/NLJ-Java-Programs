public class SuperCar extends Car {
    int turbo;
    public void setSuperCarData(String name, String color, int year, int speed, int turbo) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.turbo = turbo;
    }
    public void getSuperCarData() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Speed: " + speed);
        System.out.println("Turbo: " + turbo);
    }
}
