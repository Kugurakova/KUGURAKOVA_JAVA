import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
	 	int mas[] = {1, 2, 3, 4, 5, 6, 7};
	 	int position = mas.length;
	 	int per;
		System.out.println("massiv DO");
		for (int i = 0; i < mas.length; i++) {
		System.out.println("mas[" + i + "] = " + mas[i]);
		}
	 	//Развернуть массив:
		for (int i = 0; i*2 < mas.length ; i++) {
		per = mas[i];
		mas[i]=mas[position-1];
		mas[position-1]=per;
		position=position-1;
		}
		System.out.println("massiv POSLE");
		for (int i = 0; i < mas.length; i++) {
		System.out.println("mas[" + i + "] = " + mas[i]);
		}
	}
}