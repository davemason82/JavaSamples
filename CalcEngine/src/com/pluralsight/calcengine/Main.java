package com.pluralsight.calcengine;

public class Main {



    public static void main(String[] args) {

        String[] statements = {
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        CalculateHelper helper = new CalculateHelper();
        for(String statement:statements) {
            helper.process(statement);
            System.out.println(helper);
        }


        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation(100.0d, 50.0d, 'd');
        equations[1] = new MathEquation(25.0d, 92.0d, 'a');
        equations[2] = new MathEquation(225.0d, 17.0d, 's');
        equations[3] = new MathEquation(11.0d, 3.0d, 'm');

		for (MathEquation equation : equations) {
            equation.execute();
		    System.out.print("result = ");
		    System.out.println(equation.getResult());
        }

        System.out.println();
		System.out.println("Using overloads");
		System.out.println();

		double leftDouble = 9.0d;
		double rightDouble = 4.0d;
		MathEquation equationOverload = new MathEquation('d');

        equationOverload.execute(leftDouble, rightDouble);

        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        int leftInt = 9;
        int rightInt = 4;

        equationOverload.execute(leftInt, rightInt);

        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        equationOverload.execute((double)leftInt, rightInt);

        System.out.print("result = ");
        System.out.println(equationOverload.getResult());

        equationOverload.writeInts(1,2,3,4,5);
        equationOverload.writeInts(6,7,8);
        equationOverload.writeInts(9,10);
        equationOverload.writeInts(11);

        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        CalculateBase[] calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(25.0d, 92.0d),
                new Subtracter(225.0d, 17.0d),
                new Multiplier(11.0d, 3.0d)
        };

        for(CalculateBase calculator:calculators) {
            calculator.calculate();
            System.out.print("result=");
            System.out.println(calculator.getResult());
        }

        String s1 = "hello dave";
        s1 += " ";
        String s2 = "hello";
        s2 += " dave ";

        System.out.println("s1 == s2 ? " + (s1 == s2));
        System.out.println("s1.equals(s2) ? " + (s1.equals(s2)));

        String s3 = s1.intern();
        String s4 = s2.intern();

        System.out.println("s3 == s4 ? " + (s3 == s4));
    }
}
