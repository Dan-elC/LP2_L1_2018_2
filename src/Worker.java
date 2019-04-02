import java.util.*;

public class Worker extends Person{
	
	private static int code;
	private double salary;

	public Worker(){

	}
	public Worker(String dni, String name, String surname, Sex sex, int age, double salary){
		super( dni,  name,  surname,  sex,  age);
		this.salary = salary;
		code++;
	}
	
	public double getSalary(){
		return salary;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	
}