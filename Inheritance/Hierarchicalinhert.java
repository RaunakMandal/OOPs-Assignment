package inheritance.isa;

class Abacus{
	void work() {
		System.out.println("Calculting");
	}

}

class pc extends Abacus{
	void feturs() {
		System.out.println("Word excel");
	}
}
class newlaptop extends Abacus{
	void newfetures() {
		System.out.println("Alexa");
	}
}

public class Hierarchicalinhert {

	public static void main(String[] args) {
		
		newlaptop hp = new newlaptop();
		hp.work();
		hp.newfetures();
		
		pc dell = new pc();
		dell.work();
		dell.feturs();

	}

}
