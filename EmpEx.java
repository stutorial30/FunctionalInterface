package sidharthsircorejava;

public class EmpEx {
private Integer id;
String name;
Integer rating;
Double salary;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getRating() {
	return rating;
}
public void setRating(Integer rating) {
	this.rating = rating;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public EmpEx() {
	super();
	// TODO Auto-generated constructor stub
}
public EmpEx(Integer id, String name, Integer rating, Double salary) {
	super();
	this.id = id;
	this.name = name;
	this.rating = rating;
	this.salary = salary;
}
@Override
public String toString() {
	return "EmpEx [id=" + id + ", name=" + name + ", rating=" + rating + ", salary=" + salary + "]";
}

}
