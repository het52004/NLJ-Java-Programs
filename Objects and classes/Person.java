public class Person {
    String name;
    int age;
    public void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void getDetails() {
        System.out.println("Name: " + name + ", Age: " + age + " years");
    }
    public static void main(String[] args) {
        Person person1 = new Person(); // Person is datatype and person1 is its variable name similarly int number, new Person() is used to cerate an object
        person1.setDetails("John", 25);
        person1.getDetails();
    }
}
