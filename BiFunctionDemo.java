package sidharthsircorejava;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> bf =
                (a, b) -> a + b;

        System.out.println(bf.apply(10, 20));
        System.out.println(bf.apply(50, 30));
    }
}
//create a list of car (id brand ,name,milage,price)
//check whether th car have milage above than user expectation
//if yes then ask the no.of cars want to purchase
//calculate the total cost of purching and print total cost and cars details
