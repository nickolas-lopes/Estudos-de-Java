package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Mediaponderada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		int qtd;
		qtd = scan.nextInt();
		for(int i = 0; i < qtd; i++) {
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			double c = scan.nextDouble();
			double medPond = (a * 2 + b * 3 + c * 5) / (2 + 3 + 5);
			System.out.printf("%.1f%n", medPond);
		}
		scan.close();

	}

}
