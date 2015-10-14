package chap01;

import java.util.Vector;

public class Customer {

	private String _name;
	private Vector _rentals = new Vector<>();
	
	public Customer(String _name) {
		super();
		this._name = _name;
	}

	public void addRental(Rental arg){
		_rentals.addElement(arg);
	}
	
	public String getName(){
		return _name;
	}
	
	public String statement(){
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		return "";
	}
	
}
