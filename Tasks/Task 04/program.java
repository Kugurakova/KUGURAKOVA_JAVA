import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
	 	//Какое число из 1000 пропустили?
		int SUM = 500500; // 
		int currentNumber = scanner.nextInt();
		while (currentNumber != -1)
		 {	SUM=SUM-currentNumber;
			currentNumber = scanner.nextInt();
		 }
		System.out.println("lost "+ SUM);
	}
}