import java.util.*;

public class Sale{
	
	private Customer customer;
	private Saleman saleman;
	private Date date;
	private Double total;
	private List<SaleDetail> saledetails;

	public Sale(){
		saledetails = new ArrayList<SaleDetail>();
	}
	public Sale(Customer customer, Saleman saleman, Date date){
		this.customer=customer;
		this.saleman=saleman;
		this.date=date;
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
	public void setSaleman(Saleman saleman){
		this.saleman=saleman;
	}
	public Date getDate(){
		return date;
	}
	public void setDate(Date date){
		this.date=date;
	}
	public Double getTotal(){
		return total;
	}
	public void setTotal(Double total){
		this.total=total;
	}

	public void addSaleDetail(SaleDetail saledetail){
		saledetails.add(saledetail);
		setTotal(getTotal() + saledetail.getSubTotal());
	}
}