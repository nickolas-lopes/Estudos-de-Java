package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class areaDoCirculo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double a, area;
		Scanner scan = new Scanner(System.in);
		a = scan.nextDouble();
		area = 3.14159 * Math.pow(a, 2);
		System.out.printf("A=%.4f%n", area);
		scan.close();
		}

}
