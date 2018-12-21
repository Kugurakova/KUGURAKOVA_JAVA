import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
	 	int mas[] = {5, 8, 9, 1, 0, -2, 22};
	 	//Вывести минимальный и максимальный элементы массива.
		int mn=mas[0];
		int mx=mas[0]; 
 		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < mn) { mn=mas[i]; }
			if (mas[i] > mx) { mx=mas[i]; }
        }
		System.out.println("Min "+ mn);
		System.out.println("Max "+ mx);
	}
}