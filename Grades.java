import java.util.Scanner;

public class Grades {
	public static void main(String args[]) {
		Scanner scan  = new Scanner(System.in);
		
		System.out.print("Enter Your Percentage : ");
		int obtained = scan.nextInt();
		System.out.print("Your Grade based on your Percentage is : ");
		if(obtained<0 || obtained>100) {
			System.out.print("Z(Invalid)");
		}else if(obtained<50) {
			System.out.print("F");
		}else if(obtained>=50 && obtained<60) {
			System.out.print("C");
		}else if(obtained>=60 && obtained<70) {
			System.out.print("B");
		}else if(obtained>=70 && obtained<80) {
			System.out.print("A");
		}else if(obtained>=80 && obtained<90) {
			System.out.print("E");
		}else {
			System.out.print("O");
		}
		
		
		scan.close();
	}
}
