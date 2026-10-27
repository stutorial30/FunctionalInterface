package sidharthsircorejava;

import java.util.function.Predicate;

public class Prime {
    public static void main(String[] args) {

        Predicate<Integer> p = n -> {
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }
            return n > 1;
        };

        System.out.println(p.test(7) ? "Prime" : "Not Prime");
    }
}