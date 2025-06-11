package estruturaSequencial;

import java.util.Scanner;

public class somaSimples {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, soma;
		a = scan.nextInt();
		b = scan.nextInt();
		soma = a + b;
		System.out.printf("SOMA = %d%n", soma);
		scan.close();
	}

}
