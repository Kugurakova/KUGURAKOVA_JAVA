import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
	 	//Реализовать сортировку выбором
	 	int arr[] = {3, 2, 10, 11, 15, -5, 6};
	 	int position=0;
	 	int count = 0;
	 	int mn=arr[0];
	 	int per;
 		for (int j = 0; j < arr.length; j++) {
 			mn=arr[j];
			for (int i = j; i < arr.length; i++) {
				if (arr[i] <= mn) { mn = arr[i] ; position = i ;
			  }
 			}
 			per = arr[j];
 			arr[j] = arr[position];
			arr[position] = per;
			}
		for (int i = 0; i < arr.length; i++) {
		System.out.println("arr[" + i + "] = " + arr[i]);
		}
	}
}