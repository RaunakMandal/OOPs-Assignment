
class Man{
	void work() {
		System.out.println("Man is working");
	}
}

class Subhajit extends Man{
	void study() {
		System.out.println("BTECH");
	}
	
}

public class SingleInherit {

	public static void main(String[] args) {
		Subhajit s = new Subhajit();
		s.work();
		s.study();

	}
}
