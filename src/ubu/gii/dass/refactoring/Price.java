package ubu.gii.dass.refactoring;

public abstract class Price {
	abstract int getPriceCode();

	public double getCharge(Rental rental) {
		double result=0;
		// determine amounts for each line
		switch (rental.getMovie().getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (rental.getDaysRented() > 2)
				result += (rental.getDaysRented() - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			result += rental.getDaysRented() * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if (rental.getDaysRented() > 3)
				result += (rental.getDaysRented() - 3) * 1.5;
			break;
		}
		return result;
	}
}