package sidharthsircorejava;

import java.util.function.Predicate;

public class Ex5 {

	public static void main(String[] args) {
	/*	Predicate<Integer> p1=num->num%2==0;
		Predicate<Integer> p2=num->num>=10;
		Predicate<Integer> result=p1.and(p2);
		//Predicate<Integer> result=p1.or(p2);
		System.out.println(result.test(10));
		System.out.println(result.test(5));   */
		Predicate<Integer> p1=num->num%2==0;
		Predicate<Integer> result=p1.negate();
		System.out.println(result.test(1));
	}

}
