package lab4;

/*
 * The MoneyTester class is a really just a DRIVER for manipulating the Money class 
 * The driver will create Money objects, specify their values, and drive different
 * operations on the objects 
 * This particular driver will create three Money objects, and use them to create
 * two additional Money objects. It will generate a Money array, and use it to create
 * an additional Money array
 */

public class MoneyTester {
	
	public static void main(String[] args)
	{
		// declare Money objects
		Money m1 = new Money(2, 70); // set dollars to 1 and cents to 70
		Money m2 = new Money(2, 20); // set dollars to 2 and cents to 20
		Money m3 = new Money(1, 70); // set dollars to 1 and cents to 70

		// generate string heading
		String heading = ("\t"+Money.name +" "+Money.section+" "+Money.semester+" "+Money.year+" Lab "+Money.labNum);
		System.out.println(heading);
		System.out.println("m1 = " + m1);
		System.out.println("m2 = " + m2);
		System.out.println("m3 = " + m3);
		System.out.println("m1 equals m2? " + m1.equals(m2));
		System.out.println("m1 equals m3? " + m1.equals(m3));

		// calculate additional Money objects using add() and multiply()
		Money m4 = m1.add(m2);
		System.out.println("m4 = m1 + m2 = " + m1.add(m2));
		Money m5 = m4.multiply(3);
		System.out.println("m5 = m4 * 3 = " + m5);

		System.out.println("m1 + m2 + m3 + m4 = " + m1.add(m2).add(m3).add(m4));

		// create a Money array using multiply() and print it
		Money[] m6 = new Money[]{new Money(1, 25), new Money(2, 25), new Money(3, 25), new Money(4, 25)};
		Money[] m7 = Money.multiply(m6, 2);

		System.out.print("m6 = (");
		for(int i = 0; i < m6.length; i++)
		{
			if(i < m6.length -1)
				System.out.print(m6[i] + ", ");
			else
				System.out.print(m6[i] + ")");
		}
		System.out.println();

		System.out.print("m7 = m6 * 2 = (");
		for(int i = 0; i < m7.length; i++)
		{
			if (i < m7.length -1)
				System.out.print(m7[i] + ", ");
			else
				System.out.print(m7[i] + ")");
		}
		System.out.println();

	}
}