public class Car {
    String name;
    String color;
    int year;
    int speed;
    public void setCarData(String name, String color, int year, int speed) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.speed = speed;
    }
    public void getCarData() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Speed: " + speed);
    }
}
