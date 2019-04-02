public class Menu{
	
	private String code;
	private String name;
	private String description;

	public Menu(){

	}
	public Menu(String code, String name, String description){
		this.code=code;
		this.name=name;
		this.description=description;
	}

	public String getCode(){
		return code;
	}
	public voide setCode(String code){
		this.code=code;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getDescription(){
		return description;
	}
	public void setDescription(String description){
		this.description=description;
	}
}