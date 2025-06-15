package estruturaRepetitiva;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, f;
		n = scan.nextInt();
		f = 1;
		for(int i = 1; i <= n; i++) {
			f *= i;
		}
		System.out.printf("%d%n", f);
	}

}
