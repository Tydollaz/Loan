package Loan;
import java.util.ArrayList;
import java.util.Date;


public class Lenders extends Requirements{
	
	public static ArrayList<Lenders> arrayOfLenders = new ArrayList<>();

	public Lenders(double apr, double amount, Date date) {
		super(apr, amount, date);
		addLenderToArray();
	}
	
	public void addLenderToArray() {
		arrayOfLenders.add(this);
	}
	
	public Buyers matchToBuyer() {
		
		return Buyers.arrayOfBuyers.stream()
							.filter(x -> x.apr <= apr)
							.findFirst()
							.orElse(null);
	}
}
