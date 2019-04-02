public class Customer{
	
	private String cellphone;
	private String email;

	public Customer(){

	}
	public Customer(String dni, String name, String surname, Sex sex, int age, String cellphone, String email){
		super( dni,  name,  surname,  sex,  age);
		this.cellphone=cellphone;
		this.email=email;
	}

	public String getCellphone(){
		return cellphone;
	}
	public void setCellphone(String cellphone){
		this.cellphone=cellphone;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
}