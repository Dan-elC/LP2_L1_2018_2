import java.util.*;

public class Principal{
	public static void main(String[] args){

		Menu menu1 = new Menu("1BUNNY_OIN_OIN","Saltado de Puerco","Rico saltado de puerco con harta grasa");
		Menu menu2 = new Menu("BUNNY_123","Pierna de Conejo","Rica pierna de coneja al horno");

		Date date = new Date();

		SaleDetail sd1 = new SaleDetail(menu1,2,9.5);
		SaleDetail sd2 = new SaleDetail(menu2,1,7.5);


		Sex sex = Sex.M;
		Category cat = Category.J;

		Customer custom = new Customer("12345673","Mojo","Jojo",sex,22,"123456789","gg@pucp.pe");
		Saleman sm1 = new Saleman("12345","Jojo","Mojo",sex,22,930.23);
		Leaderman lm1 = new Leaderman("53242","Sang","Pow",sex,18,450.23,cat);
		Treasurer tr1 = new Treasurer("45622","Silvi","Balbal",sex,20,123.23,909090);

		Sale venta = new Sale(custom,sm1,date);

		venta.addSaleDetail(sd1);
		venta.addSaleDetail(sd2);


		University uni1 = new University("Universidad Peruana","UPC","Narnia 3/4");

		Team tm1 = new Team();
		tm1.setUniversity(uni1);
		
		tm1.addWorker(sm1);
		tm1.addWorker(lm1);
		tm1.addWorker(tr1);
		
		

		String report = tm1.consultWorkersTeam();
		System.out.println(report);

	}
}