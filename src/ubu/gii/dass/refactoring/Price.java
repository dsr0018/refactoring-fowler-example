package ubu.gii.dass.refactoring;

public abstract class Price {

	abstract double getCharge(Rental rental);

	int getFrecuentRenterPoints(Rental rental) {
		return 1;
	}
}