import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
		// Результат: произведение входных позиций чисел, 
		// у которых сумма цифр - простое число.
		int multiPosition = 1; 
		int position = 1; //позиций 
        int currentNumber = scanner.nextInt();
		int count = 0;
		int digitsSum = 0;
        int currentDigit;
        int number;
		while (currentNumber != -1)
		 {	number = currentNumber;
			digitsSum = 0;
			while (number != 0) {
			currentDigit = number % 10;
			digitsSum = digitsSum + currentDigit;
			number = number / 10;	
			}
			System.out.println("digits sum = " + digitsSum);
		 	count = 0;
			for (int divider = 2; divider * divider <= digitsSum; divider++) 
				{
					if (digitsSum % divider == 0) 
						{count++;}
				}
				if (count == 0)
					{multiPosition = multiPosition*position;
					System.out.println("Prime!!! count = "+ count);
					} 
			System.out.println("position "+ position);
			System.out.println("multiPosition "+ multiPosition);
        	position++;
			currentNumber = scanner.nextInt();
		 }
		System.out.println("multiPosition "+ multiPosition);

	}
}