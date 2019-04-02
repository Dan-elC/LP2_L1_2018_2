public class Treasurer extends Worker{
	
	private int tuitionNumber;

	public Treasurer(){

	}
	public Treasurer(String dni, String name, String surname, Sex sex, int age, double salary, int tuitionNumber){
		super( dni,  name,  surname,  sex,  age,  salary);
		this.tuitionNumber=tuitionNumber;
	}
	
	public int getTuitionNumber(){
		return tuitionNumber;
	}
	public void setTuitionNumber(int tuitionNumber){
		this.tuitionNumber=tuitionNumber;
	}
}