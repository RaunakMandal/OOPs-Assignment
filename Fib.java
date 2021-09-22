class Fib {
	public static void main(String[] args){
		int limit = Integer.parseInt(args[0]);
		System.out.println("We are taking upto "+limit+" numbers");
		for(int i=0; i<limit; i++) {
			System.out.print(fib(i) + " ");
		}
	}
	
	static int fib(int n) {
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
	}
}