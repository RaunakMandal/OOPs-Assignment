class Arithmetic {
	double no1, no2;
	int ch;
	void set_values(double x, double y, int which){
		no1 = x;
		no2 = y;
		ch = which;
	}
	// double add() {return no1 + no2;}
	// double subs() {return no1 - no2;}
	// double mul() {return no1 * no2;}
	// double div() {return no1 / no2;}

	double getresult() {
		switch (ch) {
			case 1:
				return no1 + no2;
			case 2:
				return no1 - no2;
			case 3:
				return no1 * no2;
			case 4:
			 	return no1 / no2;
			default: return 0;
		}
	}
}	

class Maths {
	public static void main(String[] args) {
		Arithmetic arith = new Arithmetic();
		arith.set_values(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
		System.out.println("Arithmatic Result: " + arith.getresult());
	}
}