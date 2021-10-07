import java.util.Scanner;

class Arithmetic {
	double add(double no1, double no2) {return no1 + no2;}
	double subtract(double no1, double no2){return no1 - no2;};
	double multiply(double no1, double no2){return no1 * no2;};
	double divide(double no1, double no2){return no1 / no2;};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ch = 1;
		
		do {
		System.out.print("Enter operand 1: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter operand 2: ");
		double num2 = sc.nextDouble();
		System.out.print("Enter operator (+, -, *, /): ");
		char op = sc.next().charAt(0);

		Arithmetic arith = new Arithmetic();

		System.out.print("Arithmatic Result: ");
		double res = 0.0;

		switch (op) {
			case '+':
				res = arith.add(num1, num2);
				break;
			case '-':
				res = arith.subtract(num1, num2);
				break;
			case '*':
				res = arith.multiply(num1, num2);
				break;
			case '/':
				res = arith.divide(num1, num2);
				break;	
			default: break;
		}
		System.out.println(res);
		System.out.print("Press any number to continue and 0 to exit: ");
		ch = sc.nextInt();
		} while(ch != 0);
	}
}