public class Saleman extends Worker implements Consultable{

	public Saleman(){

	}
	public Saleman(String dni, String name, String surname, Sex sex, int age, double salary){
		super( dni,  name,  surname,  sex,  age,  salary);
	}

	public String consultData(){
		return getDni() + " " + getName() + " " + getSurname() + " " + getSex();
	}
}