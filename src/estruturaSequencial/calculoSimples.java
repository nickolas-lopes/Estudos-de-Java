package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class calculoSimples {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int cd1, qt1, cd2, qt2 ;
		double pr1, pr2;
		cd1 = scan.nextInt();
		qt1 = scan.nextInt();
		pr1 = scan.nextDouble();
		cd2 = scan.nextInt();
		qt2 = scan.nextInt();
		pr2 = scan.nextDouble();
		double total = qt1 * pr1 + qt2 * pr2;
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		scan.close();
	}

}
