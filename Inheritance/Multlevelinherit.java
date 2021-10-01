

class Animal{
	
	void eat() {
		System.out.println("Eating");
	}
	
}
class Dad extends Animal {
	void house() {
		System.out.println("House");
	}
	
}
class children extends Dad{
	void car() {
		System.out.println("Car");
	}
}

public class Multlevelinherit {

	public static void main(String[] args) {
		children son = new children();
		son.car();
		son.eat();
		son.house();

	}

}
