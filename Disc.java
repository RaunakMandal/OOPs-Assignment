class Disc {
	public static void main(String[] args) {
		int amount = Integer.parseInt(args[0]);
		System.out.println("Current amt " + amount);
		System.out.print("Payable ");
		
		if(amount >= 5000 && amount < 10000)
			System.out.println(amount - (amount * 2 / 100));
		else if(amount >= 10000 && amount < 25000)
			System.out.println(amount - (amount * 5 / 100));
		else if(amount >=25000 && amount < 50000)
			System.out.println(amount - (amount * 10 / 100));
		else if(amount >= 50000)
			System.out.println(amount - (amount * 15 / 100));
		else
			System.out.println(amount);
	}
}