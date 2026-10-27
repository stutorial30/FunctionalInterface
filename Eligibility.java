package sidharthsircorejava;

import java.util.function.Predicate;

public class Eligibility {
    public static void main(String[] args) {

        Predicate<Integer> p = age -> age >= 18;

        System.out.println(p.test(20) ? "Eligible" : "Not Eligible");
    }
}