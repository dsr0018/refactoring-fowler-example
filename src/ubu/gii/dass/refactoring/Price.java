package ubu.gii.dass.refactoring;

public abstract class Price {
	abstract int getPriceCode();

	abstract double getCharge(Rental rental);
}