public class SaleDetail{
	
	private Menu menu;
	private int count;
	private Double subtotal;

	public SaleDetail(){

	}
	public SaleDetail(Menu menu, int count, Double subtotal){
		this.menu=menu;
		this.count=count;
		this.subtotal=subtotal;
	}

	public Menu getMenu(){
		return menu;
	}
	public void setMenu(Menu menu){
		this.menu=menu;
	}
	public int getCount(){
		return count;
	}
	public void setCount(int count){
		this.count=count;
	}
	public Double getSubTotal(){
		return subtotal;
	}
	public void setSubTotal(Double subtotal){
		this.subtotal=subtotal;
	}
}