import java.util.*;

public class Principal{
	public static void main(String[] args){

		Menu menu1 = new Menu("1BUNNY_OIN_OIN","Saltado de Puerco","Rico saltado de puerco con harta grasa");
		Menu menu2 = new Menu("BUNNY_123","Pierna de Conejo","Rica pierna de coneja al horno");

		Date date = new Date();

		Sex sex = Sex.M;
		Customer custom = new Customer("12345673","Mojo","Jojo",sex,22,"123456789","gg@pucp.pe");


	}
}