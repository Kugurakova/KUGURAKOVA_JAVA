import java.util.Scanner;
class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//В отсортированном массиве, считанным с клавиатуры реализовать алгоритм бинарного поиска.
		char text[] = scanner.nextLine().toCharArray();
		int forSearchNumber = scanner.nextInt();
		int pos = -1;	
		int nchar=0;
		int arr[] = new int[13];
		int i = 0;
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
		int left = 0;
		int right = arr.length-1;
		int middle = left + (right - left) / 2 ;
		while ((pos == -1) && (left < middle) && (right > middle)) {
			if (arr[left] == forSearchNumber) {pos=left;}
			if (arr[middle] == forSearchNumber) {pos=middle;}
			if (arr[right] == forSearchNumber) {pos=right;}
			if (arr[middle] < forSearchNumber) {
				left = middle;
			} 
			if (arr[middle] > forSearchNumber) {
				right = middle;
			} 			
			middle = left + (right - left) / 2 ;
		}
		System.out.println("forSearchNumber = " + forSearchNumber);
		System.out.println("position = " + pos);
	}
}		
