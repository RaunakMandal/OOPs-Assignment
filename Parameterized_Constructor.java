import java.util.Scanner;
class Parameterized_Constructor{
	String name;
	int roll;
	public Parameterized_Constructor(String n,int r){
		name = n;
		roll = r;
	}	
	void show(){
		System.out.println("Name is :" + name + "\tRoll is :" + roll);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		int y = sc.nextInt();
		Parameterized_Constructor s = new Parameterized_Constructor(x,y);
		s.show();
		
		

		
	}
}