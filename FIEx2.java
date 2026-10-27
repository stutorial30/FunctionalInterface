package sidharthsircorejava;

import java.util.function.Predicate;

public class FIEx2 {

	public static void main(String[] args) {
		/* prdefined function:-predicate,consumer,supplier,function		 */
        Predicate<Integer> isEven=(num)->num%2==0;
        boolean test=isEven.test(20);
        System.out.println(test);        
	}
}
