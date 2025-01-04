public class ConstructorOverloading {
    ConstructorOverloading() {
    }

    ConstructorOverloading(int a) {
        System.out.println("Constructor called with int argument: " + a);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(3);
    }
}
