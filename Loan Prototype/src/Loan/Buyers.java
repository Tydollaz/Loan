package Loan;
import java.util.ArrayList;
import java.util.Date;

public class Buyers extends Requirements{
	
	public static ArrayList<Buyers> arrayOfBuyers = new ArrayList<>();

	public Buyers(double apr, double amount, Date date) {
		super(apr, amount, date);
		addBuyerToArray();
	}
	
	public void addBuyerToArray() {
		arrayOfBuyers.add(this);
	}
	
	
	
	

}
