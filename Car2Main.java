package sidharthsircorejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Car2Main {

	public static void main(String[] args) {
		Car2 c1 = new Car2(1, "BMW", "M5CS", 7.0, 2500000D);
		Car2 c2 = new Car2(2, "TATA", "HARRIER", 14.0, 350000D);
		Car2 c3 = new Car2(3, "MAHINDRA", "3XO", 28.0, 1500000D);
		Car2 c4 = new Car2(4, "HYUNDAI", "i20", 25.0, 1200000D);
		Car2 c5 = new Car2(5, "KIA", "SELTOS", 24.0, 2000000D);

		List<Car2> carsList = List.of(c1,c2,c3,c4,c5);
		
		for (Car2 car : carsList) {
			System.out.println(car);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter You Mileage Expectations");
		double minMileage = sc.nextDouble();
       BiPredicate<Car2, Double> shortListCar 
						= (car,avg)-> car.getMilage()>=avg;
						List<Car2> listedCars = new ArrayList<>();

						for (Car2 car : carsList) {

						    boolean isEligible = shortListCar.test(car, minMileage);

						    if (isEligible) {
						        listedCars.add(car);
						    }
						}

						System.out.println("============");
						System.out.println("Cars in your Mileage Range");

						for (Car2 car : listedCars) {
						    System.out.println(car);
						}
System.out.println("Enter Id Which Car You Want to Purchase");
		int id = sc.nextInt();
		System.out.println("How Many Cars You Want to Purchase");
		int qty = sc.nextInt();
		
		BiFunction<Car2, Integer, Double> calculateTotalCost =
							(car,quantity)-> car.getPrice()*quantity;
					
		Car2 selectedCar = null;
		for (Car2 car : listedCars) {
			
			if(car.getId()==(id)) {
				selectedCar=car;
			}
		}
		
		Double totalCost = calculateTotalCost.apply(selectedCar, qty);
		
		BiConsumer<Car2, Double> printBill = (car,cost)->{
			System.out.println("Car ID : "+car.getId());
			System.out.println("Car Brand : "+car.getBrand());
			System.out.println("Car Name : "+car.getName());
			System.out.println("Car Mileage : "+car.getMilage());
			System.out.println("Car Price : "+car.getPrice());
			System.out.println("Car Total Cost : "+cost);
		};
		
		printBill.accept(selectedCar, totalCost);
		sc.close();
	}	}


