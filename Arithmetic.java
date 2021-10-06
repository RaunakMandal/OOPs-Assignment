import java.util.Scanner;

class Arithmetic {
	double no1, no2;
	char ch;
	void set_values(double x, double y, char which){
		no1 = x;
		no2 = y;
		ch = which;
	}

	double getresult() {
		switch (ch) {
			case '+':
				return no1 + no2;
			case '-':
				return no1 - no2;
			case '*':
				return no1 * no2;
			case '/':
			 	return no1 / no2;
			default: return 0;
		}
	}
}	

class Maths {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter operand 1: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter operand 2: ");
		double num2 = sc.nextDouble();
		System.out.print("Enter operator (+, -, *, /): ");
		char op = sc.next().charAt(0);

		Arithmetic arith = new Arithmetic();
		arith.set_values(num1, num2, op);
		System.out.println("Arithmatic Result: " + arith.getresult());
	}
}