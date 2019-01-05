import java.util.Scanner;
class Program {
	public static int BinaryPoisk(int array[], int forSearchNumber) {
		//Реализовать алгоритм бинарного поиска
		int result=-1;
		int left = 0;
		int right = array.length-1;
		int middle = left + (right - left) / 2 ;
		while ((result == -1) && (left < middle) && (right > middle)) {
			if (array[left] == forSearchNumber) {result=left;}
			if (array[middle] == forSearchNumber) {result=middle;}
			if (array[right] == forSearchNumber) {result=right;}
			if (array[middle] < forSearchNumber) {
				left = middle;
			} 
			if (array[middle] > forSearchNumber) {
				right = middle;
			} 			
			middle = left + (right - left) / 2 ;
		}
		return result;
	}

	public static int[] ConvertToNumber(char text[]) {
		int nchar=0;
		int i = 0;
		int arr[] = new int[13];
		for (int j = 0; j < text.length; j++) {
			if (text[j] >= '0' && text[j] <= '9') {
				nchar = nchar*10 + (int)text[j] - '0';
			}
			else if (i < 13)  {
				arr[i] = nchar;
				i++;
				nchar = 0;
			}
		}
		if (nchar > 0 && i < 13) {
			arr[i] = nchar;
			i++;
			nchar = 0;
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//В отсортированном массиве, считанным с клавиатуры .
		char text[] = scanner.nextLine().toCharArray();
		int forSearchNumber = scanner.nextInt();
		int arr[] = ConvertToNumber(text);//new int[13];
		System.out.println("forSearchNumber = " + forSearchNumber);
		System.out.println("position = " + BinaryPoisk(arr,forSearchNumber));
	}
}		
