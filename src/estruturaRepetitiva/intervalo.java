package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class intervalo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		double x;
		x = scan.nextDouble();
		if (x >= 0 && x <= 25) {
			System.out.printf("Intervalo [0,25]%n");
		}
		else if (x > 25 && x <= 50) {
			System.out.printf("Intervalo (25,50]%n");
		}
		else if (x > 50 && x <= 75) {
			System.out.printf("Intervalo (50,75]%n");
		}
		else if (x > 75 && x <= 100) {
			System.out.printf("Intervalo (75,100]%n");
		}
		else {
			System.out.printf("Fora de intervalo%n");
		}
		scan.close();
	}
	

}
