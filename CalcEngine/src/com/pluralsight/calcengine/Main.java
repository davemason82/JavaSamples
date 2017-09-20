package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {

    	byte kVal = 5;
    	byte factorial = 1;

    	while (kVal > 1) {
    		factorial *= kVal--;
		}

		System.out.println(factorial);

    	int iVal = 5;

    	do {
    		System.out.print(iVal);
    		System.out.print(" * 2 = ");
    		iVal *= 2;
    		System.out.println(iVal);
		} while (iVal < 100);

    	float[] theVals = { 10.0f, 20.0f, 15.0f };
		float sum = 0.0f;

		for (int i = 0; i < theVals.length; i++)
			sum += theVals[i];

		for (float currentVal : theVals)
			sum += currentVal;

		System.out.println(sum);

		int x = 11;

		switch (x % 2) {
			case 0:
				System.out.print(x);
				System.out.println(" is even.");
				break;
			case 1:
				System.out.print(x);
				System.out.println(" is odd.");
				break;
			default:
				System.out.println("Opps it broke!");
				break;
		}

	    double[] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d };
	    double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
	    char[] opCodes = { 'd', 'a', 's', 'm'};
	    double[] results = new double[4];

	    for (int i = 0; i < leftVals.length; i++)
		{
			switch (opCodes[i])
			{
				case 'a':
					results[i] = leftVals[i] + rightVals[i];
					break;
				case 's':
					results[i] = leftVals[i] - rightVals[i];
					break;
				case 'd':
					results[i] = rightVals[i] > 0 ? leftVals[i] / rightVals[i]: 0.0d;
					break;
				case 'm':
					results[i] = leftVals[i] / rightVals[i];
					break;
				default:
					results[i] = 0.0d;
			}
		}

		for (double theResult : results)
			System.out.println(theResult);
    }
}
