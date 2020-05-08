package ubu.gii.dass.refactoring;

public class NewReleasePrice extends Price{
	
	double getCharge(Rental rental){
		return rental.getDaysRented() * 3;
		}
	
	int getFrecuentRenterPoints(Rental rental) {
		return (rental.getDaysRented() > 1) ?2:1;
		}
}
