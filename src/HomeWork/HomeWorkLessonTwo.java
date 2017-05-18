package HomeWork;

public class HomeWorkLessonTwo {

	public static void main(String[] args) {
		int n = 10;
		int a = 1, b = 2;
		System.out.print(a + " " + b);
		int fib = 2, i = 2;
		while (i < n) {
			fib = a + b;
			a = b;
			b = fib;
			System.out.print(" " + fib);
			i++;
		}
	}

}
