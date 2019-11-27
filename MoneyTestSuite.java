package lab4;

/*
 * The MoneyTestSuite class is a test suite for the Money class,
 * it tests the methods in Money against a set of known passing and
 * failing use cases, and generates a report of the findings.
 */

public class MoneyTestSuite {
	int totalTests;
	int passedTests;
	int failedTests;
	
	public MoneyTestSuite() {
		
	}

	public void incrementTotalTests() {
		this.totalTests++;
	}
	
	public void incrementPassedTests() {
		this.passedTests++;
	}
	
	public void incrementFailedTests() {
		this.failedTests++;
	}
	
	public void testEquals(Money m1, Money m2) {
		// tests the Equal() method of the Money class 
		System.out.println("\n-----> Testing the Equals() method of the Money class . . . ");
		// calls Equal()
		boolean equation = m1.equals(m2);
		// assert true if testing a matching pair, and false if testing a different pair
		assert equation == false : "\nEquals() test failed";
	}
	
	public void testAdd(Money m1, Money m2) {
		// tests the Add() method of the Money class
		System.out.println("\n-----> Testing the Add() method of the Money class . . . ");
		// call Add()
		Money testMoney = m1.add(m2);
		// expected sum of m1 and m2
		Money expMoney = new Money(4, 90);
		// assert equal values if Add() method works
		assert expMoney.equals(testMoney) : "\nAdd() test failed";
	}
	
	public void testSubtract(Money m1, Money m2) {
		// tests the Subtract() method of the Money class
		System.out.println("\n-----> Testing the Subtract() method of the Money class . . . ");
		// call Subtract()
		Money testMoney = m1.subtract(m2);
		// expected difference of m1 and m2
		Money expMoney = new Money(0,50);
		// assert equal values if Subtract() method works
		assert expMoney.equals(testMoney) : "\nSubtract test failed";
	}
	
	public void testMultiply(Money m1, int multiplier) {
		// tests the Multiply() method of the Money class
		System.out.println("\n-----> Testing the Multiply() method of the Money class . . . ");
		// call Multiply()
		Money testMoney = m1.multiply(multiplier);
		// expected product of m1 and m2
		Money expMoney = new Money(8,10);
		// assert equal values if Multiply() method works
		assert expMoney.equals(testMoney) : "\nMultiply test failed";
	}
	
	public void testMultiply(Money[] moneys, int multiplier) {
		// tests the Multiply() arrays method of the Money class
		Money[] expMoneys = new Money[]{new Money(3, 75), new Money(6, 75), new Money(9, 75), new Money(12, 75)};
		System.out.println("\n-----> Testing the Multiply() method for arrays of the Money class . . . ");
		// call Multiply() arrays
		Money[] testMoney = Money.multiply(moneys, multiplier);
		// iterate through each array making sure each element matches
		for (int i = 0; i < expMoneys.length; i++) {
			assert expMoneys[i].equals(testMoney[i]) : "\nMultiply array test failed";
		}
	}
	
	public static void main(String[] args) throws Exception {
		MoneyTestSuite MTS = new MoneyTestSuite();
		Money M1 = new Money(2,70);
		Money M2 = new Money(2,20);
		Money[] M6 = new Money[]{new Money(1, 25), new Money(2, 25), new Money(3, 25), new Money(4, 25)};
		// validate Equals() and adjust suite statistics
		try {
			MTS.testEquals(M1, M2);
			System.out.println("\nEquals() test passed								SUCCESS");
			MTS.incrementTotalTests();
			MTS.incrementPassedTests();
		}
		// report a failed test
		catch (AssertionError e) {
	        System.out.println(e.getMessage());
	        MTS.incrementTotalTests();
			MTS.incrementFailedTests();
		}
		// validate Add() and adjust suite statistics
		try {
			MTS.testAdd(M1, M2);
			System.out.println("\nAdd() test passed								SUCCESS");
			MTS.incrementTotalTests();
			MTS.incrementPassedTests();
		}
		// report a failed test
		catch (AssertionError e) {
			System.out.println(e.getMessage());
	        MTS.incrementTotalTests();
			MTS.incrementFailedTests();
		}
		// validate Subtract() and adjust suite statistics
		try {
			MTS.testSubtract(M1, M2);
			System.out.println("\nSubtract() test passed								SUCCESS");
			MTS.incrementTotalTests();
			MTS.incrementPassedTests();
		}
		catch (AssertionError e) {
			System.out.println(e.getMessage());
	        MTS.incrementTotalTests();
			MTS.incrementFailedTests();
		}
		// validate the Multiply() method and adjust suite statistics
		try {
			MTS.testMultiply(M1, 3);
			System.out.println("\nMultiply() test passed								SUCCESS");
			MTS.incrementTotalTests();
			MTS.incrementPassedTests();
		}
		catch (AssertionError e) {
			System.out.println(e.getMessage());
	        MTS.incrementTotalTests();
			MTS.incrementFailedTests();
		}
		// validate the Multiply() method for arrays and adjust suite statistics
		try {
			MTS.testMultiply(M6, 3);
			System.out.println("\nMultiply() for arrays test passed						SUCCESS");
			MTS.incrementTotalTests();
			MTS.incrementPassedTests();
		}
		catch (AssertionError e) {
			System.out.println(e.getMessage());
	        MTS.incrementTotalTests();
			MTS.incrementFailedTests();
		}
		// calculate test statistics
		System.out.println("\nGenerating Test Results . . .");
		System.out.println("\nTOTAL TESTS:									" + MTS.totalTests);
		System.out.println("\nPASSED TESTS:									" + MTS.passedTests);
		System.out.println("\nFAILED TESTS:									" + MTS.failedTests);
	}
}
