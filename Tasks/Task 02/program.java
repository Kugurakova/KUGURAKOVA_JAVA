import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
	 	int n = scanner.nextInt();
		System.out.println(""+ n /128 % 2 +""+ n / 64 % 2 +""+ n / 32 % 2+""+ n / 16 % 2 +""+ n / 8 % 2 +""+ n / 4 %2 +""+ n /2 % 2 +""+ n % 2);
	}
}