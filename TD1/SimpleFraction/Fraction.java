// LIBRARIES

// CLASS

public class Fraction
{
	// VARIABLES
	int numerator;
	int denominator;
	
	// CONSTRUCTOR
	public Fraction(int numerator, int denominator)
	{
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	// METHODS
	public String toString()
	{
		return (String.valueOf(numerator)+"/"+String.valueOf(denominator)); 
	}

	public void displayFraction()
	{
		System.out.println(toString());
	}
}