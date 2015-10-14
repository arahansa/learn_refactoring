package chap01;

public class Rental {

	private Movie movie;
	private int _daysRented;
	
	public Rental(Movie movie, int _daysRented) {
		super();
		this.movie = movie;
		this._daysRented = _daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int get_daysRented() {
		return _daysRented;
	}
	
	
	
}
