package sidharthsircorejava;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> bp=
                (a, b) -> a > b;

        System.out.println(bp.test(20, 10));
        System.out.println(bp.test(5, 15));
    }
}
