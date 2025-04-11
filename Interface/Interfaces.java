public class Interfaces implements Student{
    int age;
    String name;
    public static void main(String[] args) {
        Interfaces i = new Interfaces();
        i.setData();
        i.getData();
        A a = new A();
        a.getData();
    }
    public void setData(){
        age = 20;
        name = "het";
    }
    public void getData(){
        System.out.println(name + " " + age);
    }
}

interface Student{
    void setData();
    void getData();
}

class A extends Interfaces{
    public void getData(){
        System.out.println("name");
    }
}