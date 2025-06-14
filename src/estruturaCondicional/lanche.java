package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class lanche {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int lanche, qtd;
		lanche = scan.nextInt();
		qtd = scan.nextInt();
		if (lanche == 1) {
			double total = 4 * qtd;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (lanche == 2) {
			double total = 4.50 * qtd;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (lanche == 3) {
			double total = 5 * qtd;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (lanche == 4) {
			double total = 2 * qtd;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		else if (lanche == 5) {
			double total = 1.50 * qtd;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		
	}

}
