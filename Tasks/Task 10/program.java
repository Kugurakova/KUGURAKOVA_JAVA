import java.util.Scanner;
class Program {
	public static int overlay(char array1[], char array2[]) {
		//Реализовать алгоритм, который ищет первое вхождение второй строки в первую
		int result=-1;
		for (int i = 0; i < array1.length ; i++) {
			if (array1[i] == array2[0]) {
				if ( result == -1 ) { result = i;}
				for (int j = 1; j < array2.length; j++) {
					if (array1[result+j] == array2[j]) {
					} 
					else {
						result = -1;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Считать две строки. 
		char line1[] = scanner.nextLine().toCharArray();
		char line2[] = scanner.nextLine().toCharArray();
		int pos;
		pos=overlay(line1, line2);
		System.out.println("position = " + pos);
	}
}		
