package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class coordenadasPonto {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner scan = new Scanner(System.in);
			double x, y;
			x = scan.nextDouble();
			y = scan.nextDouble();
			if(x > 0 && y > 0) {
				System.out.printf("Q1%n");
			}
			else if(x < 0 && y > 0) {
				System.out.printf("Q2%n");
			}
			else if(x < 0 && y < 0) {
				System.out.printf("Q3%n");
			}
			else if(x > 0 && y < 0) {
				System.out.printf("Q4%n");
			}
			else if (x == 0 && y > 0 || y < 0) {
				System.out.printf("Eixo Y%n");
			}
			else if (y == 0 && x > 0 || x < 0) {
				System.out.printf("Eixo X%n");
			}
			else {
				System.out.printf("Origem%n");
			}
	}

}
