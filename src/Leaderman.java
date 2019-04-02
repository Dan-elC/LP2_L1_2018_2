public class Leaderman extends Worker{
	
	private Category category;

	public Leaderman(){

	}
	public Leaderman(String dni, String name, String surname, Sex sex, int age, double salary, Category category){
		super( dni,  name,  surname,  sex,  age,  salary);
		this.category=category;
	}
	
	public Category getCategory(){
		return category;
	}
	public void setCategory(Category category){
		this.category=category;
	}
}