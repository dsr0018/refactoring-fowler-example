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
	private String _title;
	Price _price;

	public Movie(String title, Price price) {
		_title = title;
		setPrice(price);
	}
	
	/**
	 * @deprecated Use {@link #Movie(String,Price)} instead
	 */
	public Movie(String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}
	
	public void setPrice(Price price) {
		_price=price;
	}
	
	/**
	 * @deprecated Use {@link #setPrice(Price)} instead
	 */
	public void setPriceCode(int arg) {
		switch (arg) {
			case Price.REGULAR:
				_price = new RegularPrice();
				break;
			case Price.CHILDRENS:
				_price = new ChildrensPrice();
				break;
			case Price.NEW_RELEASE:
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
}
