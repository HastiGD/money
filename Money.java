package lab4;
import java.lang.reflect.Array;

/*
 * The Money class encapsulates the concept of Money
 * It assumes the Money has the attributes dollars and cents
 * The Money class is able to:
 * - Multiply each element inside a Money array by a given multiplier
 * - Generate a heading
 * Instances of the Money class are able to:
 * - Calculate the sum of two Money objects
 * - Calculate the difference between two Money objects
 * - Calculate the product of two Money objects
 * - Determine if two Money objects have the same value
 */

public class Money {
	private int dollars;
	private int cents;
	static String name = "Hasti Gheibi Dehnashi";
	static String section = "CIS35A";
	static String semester = "Fall";
	static int year = 2019;
	static int labNum = 4;
	
	
	public Money() {
		// this constructor will create objects that instantiate the Money class
		// and create a Money object with dollar and cent amount of 0
		this.dollars = 0;
		this.cents = 0;
	}
	
	public Money(int dollars, int cents) {
		// this constructor will create objects that instantiate the Money class
		// with the dollar and cent amount specified in the argument, respectively
		// check cents, throw exception if Cents > 99
		if (cents >= 100) {
			throw new IllegalArgumentException("Cents must be less than 100");
		}
		else {
			this.dollars = dollars;
			this.cents = cents;
		}
	}
	
	public String toString() {
		String connector = ".";
		if (cents < 10) {
			connector = ".0";
		}
		return dollars + connector + cents;  
	} 
	
	public int getDollars() {
		return this.dollars;
	}

	public int getCents() {
		return this.cents;
	}
	
	public boolean equals(Money money) {
		// compares the value of argument Money object against its own value
		boolean sameValue = false;
		int argDollars = money.getDollars();
		int argCents = money.getCents();
		if (argDollars == dollars && argCents == cents) {
			// sameValue is true if values are equivalent
			//System.out.println("\nEquals() found : Values are equal");
			sameValue = true;
		}
		else {
			//System.out.println("\nEquals() found : Values are not equal");
			sameValue = false;
		}
		return sameValue;
	}
	
	public Money add(Money m) {
		// adds the value of another Money object to itself to create a new Money object
		Money m4 = null;
		int totalDollars = dollars + m.getDollars();
		int totalCents = cents + m.getCents();
		// check if totalCents is greater than 1 dollar
		if (totalCents >= 100) {
			// add 1 to totalDollars
			totalDollars++;
			totalCents = 0;
			// check to see if there is a remainder
			if ((cents + m.getCents()) > 100) {
				// add remainder to totalCents
				totalCents = (cents + m.getCents())%100;
			}
		}
		// create a new Money object from totalDollars and totalCents
		m4 = new Money (totalDollars, totalCents);
		// return new Money object
		return m4;
	}
	
	public Money subtract(Money m) {
		// subtracts the value of another Money object from itself to create a new Money object
		Money m5 = null;
		int totalDollars = 0;
		int totalCents = 0;
		// makes sure new object will not have a negative value
		if (dollars >= m.getDollars() && cents >= m.getCents()) {
			totalDollars = dollars - m.getDollars();
			// check if subtracting cents will affect dollars and handles it
			if (cents < m.getCents()) {
				totalDollars = totalDollars - 1 ;
				totalCents = 100 - (m.getCents() - cents);
			}
			else {
				totalCents = cents - m.getCents();
			}
		}
		else {
			System.out.println("\nCANNOT HAVE A NEGATIVE MONEY VALUE");
		}
		m5 = new Money (totalDollars, totalCents);
		return m5;
	}
	
	public Money multiply(int m) {
		// multiplies the value of another Money object with itself to create a new Money object
		Money m6 = null;
		// calculate the total dollars
		int totalDollars = dollars*m;
		// checks if multiplying cents will affect dollars and handles it
		totalDollars += (cents*m)/100;
		// calculate the total cents
		int totalCents = (cents*m)%100;
		m6 = new Money(totalDollars, totalCents);
		return m6;
	}
	
	public static Money[] multiply(Money[] moneys, int amt) {
		// returns an array of Money objects which are products of the passed array and multiplier
		Money[] m7 = new Money[moneys.length];
		for (int i = 0; i < moneys.length; i++) {
			Array.set(m7, i, moneys[i].multiply(amt));
		}
		return m7;
	}
	
	public static void main(String[] args) {
		/*
		 * Money M1 = new Money(1,3); 
		 * System.out.println(M1); 
		 * Money M2 = new Money(1,3);
		 * System.out.println(M2); 
		 * boolean equals = M1.equals(M2);
		 * System.out.print(equals);
		 */	
		}
}
