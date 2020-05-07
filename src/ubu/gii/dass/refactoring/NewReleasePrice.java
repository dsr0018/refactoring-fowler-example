package ubu.gii.dass.refactoring;

public class NewReleasePrice extends Price{
	int getPriceCode() {
		return Movie.NEW_RELEASE;
		}
	
	double getCharge(Rental rental){
		return rental.getDaysRented() * 3;
		}
}
