import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
	 	//Найти количество локальных максимумов в массиве
	 	int arr[] = {1, 5, 2, 6, 3, 7, 9};
	 	int count = 0;
	 	//a[i-1] < a[i] > a[i+1]
		for (int i = 1; i < arr.length-1 ; i++) {
			if (arr[i-1] < arr[i] )  {
				if (arr[i] > arr[i+1])  {
					count++ ; 
			 		System.out.println("arr[" + i + "] = " + arr[i]);
			 	}
			 }
		}
		System.out.println("count = " + count);
		
	}
}