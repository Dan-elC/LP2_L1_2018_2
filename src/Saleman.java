public class Saleman extends Worker, interface Consultable{

	public Saleman(){

	}
	public Saleman(String dni, String name, String surname, Sex sex, int age, double salary){
		super( dni,  name,  surname,  sex,  age,  salary);
	}

	public String consulData(){
		
	}
}