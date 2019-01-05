class Program {
		//Оптимизировать алгоритм вычисления чисел Фибоначчи, так
		//, чтобы не было повторных рекурсивных вызовов (при этом рекурсию сохранить).

		public static int fib(int n) {
			System.out.println("in fib with n = " + n);
			int result = fib2(n, 0, 1);
			System.out.println("out from fib with result = " + result);
			return result;
		}

		public static int fib2(int n, int t0, int t1) {
		if (n > 0) {
			int result = fib2(n - 1, t1, t0 + t1);
			return result;
		} 
		else return t0;
		}
 
    public static void main(String[] args) {
		System.out.println(fib2(10,0,1));
		System.out.println(fib(10));
    }
}