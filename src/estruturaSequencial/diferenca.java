package estruturaSequencial;

import java.util.Scanner;
public class diferenca {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c, d;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		int dif = a * b - c * d;
		System.out.printf("DIFERENCA = %d%n", dif);
		scan.close();
	}

}
