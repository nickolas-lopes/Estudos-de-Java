package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class DividindoXY {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int qtd;
		qtd = scan.nextInt();
		for(int i = 0; i < qtd; i++) {
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			if(b == 0) {
				System.out.printf("divisao impossivel%n");
			}
			else {
				double div = a / b;
				System.out.printf("%.1f%n", div);
			}
		}
		scan.close();
	}

}
