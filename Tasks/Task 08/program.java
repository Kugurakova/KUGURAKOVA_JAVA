import java.util.Scanner;
class Program {
	public static void sortirovka(int array[]) {
		int position=0;
		int count = 0;
		int mn=array[0];
		int per;
		for (int j = 0; j < array.length; j++) {
			mn=array[j];
			for (int i = j; i < array.length; i++) {
				if (array[i] <= mn) { mn = array[i] ; position = i ;
				}
 			}
 			per = array[j];
 			array[j] = array[position];
			array[position] = per;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Реализовать сортировку выбором
		int arr[] = {3, 2, 10, 11, 15, -5, 6};
		sortirovka(arr);
		for (int i = 0; i < arr.length; i++) {
		System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}