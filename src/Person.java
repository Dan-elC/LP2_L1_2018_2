public abstract class Person{


	private String dni;
	private String name;
	private String surname;
	private Sex sex;
	private int age;

	public Person(){

	}
	public Person(String dni, String name, String surname, Sex sex, int age){
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.sex=sex;
	}

	public String getDni(){
		return dni;
	}
	public void setDni(String dni){
		this.dni=dni;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getSurname(){
		return surname;
	}
	public void setSurname(String surname){
		this.surname=surname;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public Sex getSex(){
		return sex;
	}
	public void setSex(Sex sex){
		this.sex=sex;
	}

}