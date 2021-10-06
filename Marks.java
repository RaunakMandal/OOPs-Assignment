class Marks {
	public static void main(String[] args) {
		int mark = Integer.parseInt(args[0]);
		System.out.println("Marks Got: " + mark);
		char ch;
		if(mark >= 90 && mark <=100)
			ch = 'O';
		else if(mark >= 80 && mark < 90)
			ch = 'E';
		else if(mark >= 70 && mark < 80)
			ch = 'A';
		else if(mark >= 60 && mark < 70)
			ch  = 'B';
		else if(mark >=50 && mark < 60)
			ch = 'C';
		else if(mark < 50 && mark >= 0)
			ch = 'F';
		else
			ch = 'Z';
		System.out.println("Grade: " + ch);
	}
}