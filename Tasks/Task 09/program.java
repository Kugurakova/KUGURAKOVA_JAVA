import java.util.Scanner;
class Program {
	public static int ConvertToNumber(char array[]) {
		//этот массив символов нужно преобразовать в int-число.
		int result=0;
		for (int j = 0; j < array.length; j++) {
			result = result*10 + (int)array[j] - '0';
		}
		return result;
	}

	public static void main(String[] args) {
		//Считать число с клавиатуры как массив символов -> 
		Scanner scanner = new Scanner(System.in);
		char archar[] = scanner.nextLine().toCharArray();
		System.out.println(ConvertToNumber(archar));
	}
}