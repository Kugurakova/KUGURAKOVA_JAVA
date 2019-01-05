import java.util.Scanner;
class Program {
	public static void AddToEnd(int array[], int N) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				array[i] = N;
				return; 
			}
		}
	}
	public static void AddToTop(int array[], int N) {
		int pold;
		int pnew = N;
		for (int i = 0; i < array.length; i++) {
			pold = array[i];
			array[i] =pnew;
			pnew = pold; 
		}
	}

	public static void RemoveByIndex(int array[], int pos) {
		for (int i = pos; i < array.length - 1; i++) {
			array[i] =array[i+1];
		}
		array[array.length - 1]=0;
	}
	
	public static void AddByIndex(int array[], int pos, int N) {
		int pold;
		int pnew = N;
		for (int i = pos; i < array.length - 1; i++) {
			pold = array[i];
			array[i] =pnew;
			pnew = pold; 
		}
	}

	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
		int mas[] = new int[6];
		mas[0]=-3;
		mas[1]=4;
		AddToEnd(mas,5);
		AddToTop(mas,1);
		RemoveByIndex(mas,2);
		AddByIndex(mas,3,7);
		for (int i = 0; i < mas.length; i++) {
			System.out.println("mas[" + i + "] = " + mas[i]);
		}

	}
}