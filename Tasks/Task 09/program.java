import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
	 	//Считать число с клавиатуры как массив символов -> этот массив символов нужно преобразовать в int-число.
	 	char archar[] = scanner.nextLine().toCharArray();
	 	int nchar=0;
	 	for (int j = 0; j < archar.length; j++) {
 			nchar = nchar*10 + (int)archar[j] - '0';
		}
		System.out.println("nchar = " + nchar);
	}
}