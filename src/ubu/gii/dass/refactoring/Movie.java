package ubu.gii.dass.refactoring;
/**
 * Tema Refactorizaciones
 * 
 * Ejemplo de aplicación de refactorizaciones. Actualizado para colecciones
 * genéricas de java 1.5.
 * 
 * @author M. Fowler y <A HREF="mailto:clopezno@ubu.es">Carlos López</A>
 * @version 1.1
 * @see java.io.File
 * 
 */

public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private String _title;
	private Price _price;

	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return _price.getPriceCode();
	}

	public void setPriceCode(int arg) {
		switch (arg) {
			case Movie.REGULAR:
				_price = new RegularPrice();
				break;
			case Movie.CHILDRENS:
				_price = new ChildrensPrice();
				break;
			case Movie.NEW_RELEASE:
				_price = new NewReleasePrice();
				break;
			default:
				throw new IllegalArgumentException("Incorrect Price Code");
		}
	}

	public String getTitle() {
		return _title;
	}

	public double getCharge(Rental rental) {
		return _price.getCharge(rental);
	}

	public int getFrecuentRenterPoints(Rental rental) {
		// add frequent renter points
		int frequentRenterPoints=1;
		// add bonus for a two day new release rental
		if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE)
				&& rental.getDaysRented() > 1)
			frequentRenterPoints++;
		return frequentRenterPoints;
	}
}
