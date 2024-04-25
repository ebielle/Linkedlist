import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Fruit> fruit = new LinkedList<>(Arrays.asList(new Fruit("banana"), new Fruit("fragola")));

        System.out.println(fruit);

        fruit.addFirst(new Fruit("mela"));
        fruit.addLast(new Fruit("mirtillo"));

        System.out.println(fruit);
    }
}