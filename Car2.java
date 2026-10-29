package sidharthsircorejava;

public class Car2 {
	    int id;
	    String brand;
	    String name;
	    double milage;
	    double price;
		public Car2() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Car2(int id, String brand, String name, double milage, double price) {
			super();
			this.id = id;
			this.brand = brand;
			this.name = name;
			this.milage = milage;
			this.price = price;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getMilage() {
			return milage;
		}
		public void setMilage(double milage) {
			this.milage = milage;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Car2 [id=" + id + ", brand=" + brand + ", name=" + name + ", milage=" + milage + ", price=" + price
					+ "]";
		}
		
}
