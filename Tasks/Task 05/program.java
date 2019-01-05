import java.util.Scanner;
class Program {

	public static int minArr(int array[]) {
		int result =array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < result) { result=array[i]; }
		}
		return result;
	}

	public static int maxArr(int array[]) {
		int result =array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > result) { result=array[i]; }
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int mas[] = {5, 8, 9, 1, 0, -2, 22};
		//Вывести минимальный и максимальный элементы массива.
		System.out.println("Min "+ minArr(mas) );
		System.out.println("Max "+ maxArr(mas) );
	}
}