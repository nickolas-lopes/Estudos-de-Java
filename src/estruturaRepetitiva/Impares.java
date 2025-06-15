package estruturaCondicional;

import java.util.Scanner;

public class Impares {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		for (int i = 1; i <= n; i++ ) {
			if (i % 2 != 0) {
				System.out.printf("%d%n", i);
			}
		}

	}

}
