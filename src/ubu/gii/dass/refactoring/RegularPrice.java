package ubu.gii.dass.refactoring;

public class RegularPrice extends Price{
	
	double getCharge(Rental rental){
		double result = 2;
		if (rental.getDaysRented() > 2)
			result += (rental.getDaysRented() -2) * 1.5;
		return result;
		}
}
