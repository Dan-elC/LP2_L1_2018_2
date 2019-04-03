import java.util.*;

public class Sale{
	
	private Customer customer;
	private Saleman saleman;
	private Date date;
	private double total;
	private List<SaleDetail> saledetails;

	public Sale(){
		saledetails = new ArrayList<SaleDetail>();
	}
	public Sale(Customer customer, Saleman saleman, Date date){
		this.customer=customer;
		this.saleman=saleman;
		this.date=date;
		saledetails = new ArrayList<SaleDetail>();
	}

	public Customer getCustomer(){
		return customer;
	}
	public void setCustomer(Customer customer){
		this.customer=customer;
	}
	public Saleman getSaleman(){
		return saleman;
	}
	public List<SaleDetail> getSaleDetails(){
		return saledetails;
	}
	public void setSaleman(Saleman saleman){
		this.saleman=saleman;
	}
	public Date getDate(){
		return date;
	}
	public void setDate(Date date){
		this.date=date;
	}
	public double getTotal(){
		return total;
	}
	public void setTotal(double total){
		this.total=total;
	}

	public void addSaleDetail(SaleDetail saledetail1){
		saledetails.add(saledetail1);
		setTotal(getTotal() + saledetail1.getSubTotal());
	}
}