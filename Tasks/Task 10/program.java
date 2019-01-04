import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
	 	//Считать две строки. Реализовать алгоритм, который ищет первое вхождение второй строки в первую
		char line1[] = scanner.nextLine().toCharArray();
        char line2[] = scanner.nextLine().toCharArray();
        int pos = -1;
        int nachalo=0;
		for (int i = 0; i < line1.length ; i++) {
			if (line1[i] == line2[0]) {
				if ( pos == -1 ) { pos = i;}
				for (int j = 1; j < line2.length; j++) {
					if (line1[pos+j] == line2[j]) {
					} 
					else {
						pos = -1;
					}
				}
	        }
		}
		System.out.println("position = " + pos);
	}
}		
