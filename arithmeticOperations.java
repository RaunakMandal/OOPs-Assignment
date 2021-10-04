//Name: Siddhant Srivastava
//Roll: 12100119101


import java.util.Scanner;


class Operations{
//	to add program
//	=================================
	int add(int a, int b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
	double add(int a, double b) {
		return a+b;
	}
	double add(double a, int b) {
		return a+b;
	}
//	=================================
	
	
	//to subtract
//	=================================
	int subtract(int a, int b) {
		return a-b;
	}
	double subtract(double a, double b) {
		return a-b;
	}
	double subtract(int a, double b) {
		return a-b;
	}
	double subtract(double a, int b) {
		return a-b;
	}
//	=================================
	
	
	//to multiply
//	=================================
	int multiply(int a, int b) {
		return a*b;
	}
	double multiply(double a, double b) {
		return a*b;
	}
	double multiply(int a, double b) {
		return a*b;
	}
	double multiply(double a, int b) {
		return a*b;
	}
//	=================================
	
	
	//to divide
//	=================================
	int divide(int a, int b) {
		return a/b;
	}
	double divide(double a, double b) {
		return a/b;
	}
	double divide(int a, double b) {
		return a/b;
	}
	double divide(double a, int b) {
		return a/b;
	}
//	=================================
}

public class arithmeticOperations {
	public static void main(String args[]) {
		
		Operations one = new Operations();
		Scanner scan = new Scanner(System.in);
		
		boolean ok = true;
		
		while(ok) {
			
			int choice,firstNumber, secondNumber;
			double secondNumberDouble,firstNumberDouble, res;
			char operation;
			
			System.out.println("Press 1 for Interger Input");
			System.out.println("Press 2 for Double Input");
			System.out.println("Press 3 for mixed(Integer and Double) Input");
			System.out.println("Press 4 to Exit");
			System.out.print("Enter your Choice : ");
			choice = scan.nextInt();
			
			switch(choice) {
			
			
			case 1: System.out.print("Enter First Number Operation Second Number (e.g. a + b) : ");
					firstNumber = scan.nextInt();
					operation = scan.next().charAt(0);
					secondNumber = scan.nextInt();
					
					int ans = 0;
					switch(operation) {
					case '+': ans = one.add(firstNumber, secondNumber);
							break;
					case '-': ans = one.subtract(firstNumber, secondNumber);
							break;
					case '/': ans = one.divide(firstNumber, secondNumber);
							break;
					case '*': ans = one.multiply(firstNumber, secondNumber);
							break;
					}
					
					System.out.println("Answer for the expression -> " + firstNumber +" "+ operation +" "+ secondNumber + " = " + ans + "\n");
				break;
				
				
			case 2: System.out.print("Enter First Number Operation Second Number (e.g. a + b) : ");
					firstNumberDouble = scan.nextDouble();
					operation = scan.next().charAt(0);
					secondNumberDouble = scan.nextDouble();
					
					res = 0;
					switch(operation) {
					case '+': res = one.add(firstNumberDouble, secondNumberDouble);
							break;
					case '-': res = one.subtract(firstNumberDouble, secondNumberDouble);
							break;
					case '/': res = one.divide(firstNumberDouble, secondNumberDouble);
							break;
					case '*': res = one.multiply(firstNumberDouble, secondNumberDouble);
							break;
					}
					System.out.println("Answer for the expression -> " + firstNumberDouble +" "+ operation +" "+ secondNumberDouble +" = "+ res+"\n");
					
				break;
				
				
			case 3: System.out.println("Press 1 for (Interger operation Double) Input");
					System.out.println("Press 2 for (Double operation Interger) Input");
					int ch = scan.nextInt();
					switch(ch) {
					case 1: System.out.println("Enter Integer Operation Double (e.g. a + b) : ");
							firstNumber = scan.nextInt();
							operation = scan.next().charAt(0);
							secondNumberDouble = scan.nextDouble();
							res = 0;
							switch(operation) {
							case '+': res = one.add(firstNumber, secondNumberDouble);
									break;
							case '-': res = one.subtract(firstNumber, secondNumberDouble);
									break;
							case '/': res = one.divide(firstNumber, secondNumberDouble);
									break;
							case '*': res = one.multiply(firstNumber, secondNumberDouble);
									break;
							}
							System.out.println("Answer for the expression -> " + firstNumber +" "+ operation +" "+ secondNumberDouble +" = "+ res+"\n");
							
							break;
					case 2: System.out.println("Enter Double Operation Interger (e.g. a + b) : ");
							firstNumberDouble = scan.nextDouble();
							operation = scan.next().charAt(0);
							secondNumber = scan.nextInt();
							res = 0;
							switch(operation) {
							case '+': res = one.add(firstNumberDouble, secondNumber);
									break;
							case '-': res = one.subtract(firstNumberDouble, secondNumber);
									break;
							case '/': res = one.divide(firstNumberDouble, secondNumber);
									break;
							case '*': res = one.multiply(firstNumberDouble, secondNumber);
									break;
							}
							System.out.println("Answer for the expression -> " + firstNumberDouble +" "+ operation +" "+ secondNumber +" = "+ res+"\n");
							break;
					default: System.out.println("Oops! Invalid Input");
					}
				break;
			case 4: ok = false;
				break;
			default: System.out.println("Oops! Invalid choice");
			}
			
		}
		scan.close();
		System.out.print("Thank youu :)");
		
	}
}
