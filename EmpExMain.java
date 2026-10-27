package sidharthsircorejava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmpExMain {

	public static void main(String[] args) {
		//create a list of employees
		//filter employees for who are having rating more than 4 out of 5 using predicate
		//add the bonus of 30% into salary of best performers
		// print the name and update salary of best performers only
		List<EmpEx> emp = new ArrayList<>();

        emp.add(new EmpEx(101,"Amit", 30000, 4.5));
        emp.add(new EmpEx(102,"Rahul", 25000, 3.5));
        emp.add(new EmpEx(103,"Priya", 40000, 4.8));
        emp.add(new EmpEx(104,"Sneha", 35000, 4.0));

        Predicate<EmpEx> p = e -> e.rating > 4;
        
        emp.stream()
           .filter(p)
           .forEach(e -> {
               e.salary = e.salary + (e.salary * 30 / 100);
               System.out.println(e.name + " " + e.salary);
           });
	}

}
