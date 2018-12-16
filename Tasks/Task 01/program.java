class Program {
	public static void main(String[] args) {
		int sum =15867;
		int x = sum/5000;
		System.out.println("5000 - " + x);
		sum = sum - x*5000;
		x = sum/2000;
		System.out.println("2000 - " + x);
		sum = sum-x*2000;
		x = sum/1000;
		System.out.println("1000 - " + x);
		sum = sum-x*1000;
		x = sum/500;
		System.out.println("500 - " + x);
		sum = sum-x*500;
		x = sum/100;
		System.out.println("100 - " + x);
		sum = sum-x*100;
		x = sum/50;
		System.out.println("50 - " + x);
		sum = sum-x*50;
		x = sum/10;
		System.out.println("10 - " + x);
		sum = sum-x*10;
		x = sum/5;
		System.out.println("5 - " + x);
		sum = sum-x*5;
		x = sum/2;
		System.out.println("2 - " + x);
		x = sum%2;
		System.out.println("1 - " + x);		
	}
}