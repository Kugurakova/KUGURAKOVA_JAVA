import java.util.Scanner;
class Program {
	public static int stepen(int n,int s) {
		int result =1;
		for(int i=1; i<=s; i++){
			result = result*n;
		}
		return result;
	}

	public static int BinarySystem(int n) {
		int x=0;
		for (int i=1 ;i < 9; i++){
			x = x + n % 2 * stepen(10,i-1);
			n = n / 2;
		}
		return x; 
	}	

	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
	 	int n = scanner.nextInt();
		System.out.println(n);
		System.out.println(BinarySystem(n));
		
	}
}