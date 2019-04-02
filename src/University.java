public class University{
	
	private String name;
	private String acronym;
	private String address;

	public University(){

	}
	public University(String name, String acronym, String address){
		this.name=name;
		this.acronym=acronym;
		this.address=address;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getAcronym(){
		return acronym;
	}
	public void setAcronym(Strign acronym){
		this.acronym=acronym;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address=address;
	}
}