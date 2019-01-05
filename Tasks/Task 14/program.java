import java.util.Scanner;
class Program {

	public static double f(double x) {
		return x * x;
	}

	public static double integralByRectangles(double a, double b, int n) {
		double result=(double)0;
		double h=(b-a)/n;
		for (int i=0; i<n;i++){
			result=result+f(a+h*(i+0.5))*h;
		}
		return result;
	}

	public static double integralBySimpson(double a, double b, int n) {
		double result=(double)0;
		double h=(b-a)/n;
		for (int i=0; i<n;i++){
			result = result + h/6*(f(a+h*i)+4*f((a+h*i+a+h*(i+1))/2)+f(a+h*(i+1)));
		}
		return result;
	}

	public static double integralByTrapeze(double a, double b, int n) {
		double result=(double)0;
		double h=(b-a)/n;
		for (int i=0; i<n;i++){
			result=result+(f(a+h*i)+f(a+h*(i+1)))/2*h;
		}
		return result;
	}

	public static void main(String[] args) {
	 	Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		int n = scanner.nextInt();
		System.out.println(integralByRectangles(a, b, n));
		System.out.println(integralBySimpson(a, b, n));
		System.out.println(integralByTrapeze(a, b, n));		
	}
}