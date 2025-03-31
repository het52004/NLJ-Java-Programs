public class Generics {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(2004, "Het");
        pair.getKey();
        pair.getValue();
    }
}

class Box<T> {
    private T value;

    public void setValue(T o) {
        this.value = o;
    }

    public T getValue() {
        return value;
    }
}

class Pair<K, V>{
    K key;
    V value;
    Pair(K key, V value){
        this.key = key;
        this.value = value;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
}