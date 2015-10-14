package chap01;

import java.util.Enumeration;
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
		Enumeration rentals = _rentals.elements();
		
		String result = getName() +" 고객님의 대여기록 \n";
		while(rentals.hasMoreElements()){
			double thisAmount = 0;
			Rental each = (Rental) rentals.nextElement();
			
			// 비디오 종류별 대여료 계산
			switch (each.getMovie().get_priceCode()) {
			case Movie.REGULAR: 
				thisAmount+=2;
				if(each.getDaysRented() > 2)
					thisAmount += (each.getDaysRented() - 2 ) * 1.5;
				break;
			case Movie.NEW_RELEASE :
				thisAmount += each.getDaysRented() * 3;
				break;
			case Movie.CHILDRENDS:
				thisAmount += 1.5;
				if(each.getDaysRented() > 3)
					thisAmount += (each.getDaysRented() - 3) * 1.5;

			default:
				break;
			}
			
			
		}
		return "";
	}
	
}
