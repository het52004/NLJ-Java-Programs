public class Car{
    public String name;
    private int speed;
    public int getSpeed(){
        return speed;
    }
    public void setCarData(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
    public void getCarData(){
        System.out.println("Name: " + name + " Speed: " + speed);
    }
    class Engine{
        private int engineNumber;
        public void setEngineData(int engineNumber){
            this.engineNumber = engineNumber;
        }
        public void getEngineData(){
            speed = 10; // private variable of outer class can be accessed
            System.out.println("Engine Data: " + engineNumber + " Speed: " + speed);
        }
    }
}