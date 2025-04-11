import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        // Box<Integer> box = new Box<>();
        // box.setValue(1);

        // BoundedType<String> bt = new BoundedType<>(); // Error
        // BoundedType<Integer> bt = new BoundedType<>();

        GenericMethods gm = new GenericMethods();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        gm.greet(list);
    }
}

class Box<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class GenericMethods{
    public <T> void greet(ArrayList value){
        System.out.println("Hello " + value);
    }
}

class BoundedType<T extends Number>{
    
}