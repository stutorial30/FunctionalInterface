package sidharthsircorejava;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {

        BiConsumer<String, Integer> bc =
                (name, age) -> System.out.println(name + " " + age);

        bc.accept("Sakshi", 22);
        bc.accept("Rahul", 25);
    }
}
