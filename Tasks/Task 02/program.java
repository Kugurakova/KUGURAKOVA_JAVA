class Program {
	public static void main(String[] args) {
		int n = 137;
		int x1 = n % 2;		
		int x2 = n / 2 % 2;		
		int x3 = n / 2 / 2 % 2;		
		int x4 = n / 2 / 2 / 2 % 2;		
		int x5 = n / 2 / 2 / 2 / 2 % 2;		
		int x6 = n / 2 / 2 / 2 / 2 / 2 % 2;		
		int x7 = n / 2 / 2 / 2 / 2 / 2/ 2 % 2;		
		int x8 = n / 2 / 2 / 2 / 2 / 2 / 2/ 2 % 2;		
		System.out.println(""+x8+""+x7+""+x6+""+x5+""+x4+""+x3+""+x2+""+x1);
		System.out.println(""+n / 128 % 2+""+n / 64 % 2+""+n / 32  % 2+""+ n / 16 % 2+""+n / 8 % 2+""+n / 4 % 2+""+n / 2 % 2+""+n % 2+"");
	}
}