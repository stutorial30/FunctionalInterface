package sidharthsircorejava;

import java.util.function.Predicate;

public class Palindrome {
    public static void main(String[] args) {

        Predicate<String> p = s -> s.equals(new StringBuilder(s).reverse().toString());

        System.out.println(p.test("madam") ? "Palindrome" : "Not Palindrome");
    }
}