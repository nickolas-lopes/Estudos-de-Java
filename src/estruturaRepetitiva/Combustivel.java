package estruturaRepetitiva;

import java.util.Scanner;

public class Combustivel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int comb, a, g, d;
		comb = 0; 
		a = 0;
		g = 0;
		d = 0;
		while (comb != 4) {
			comb = scan.nextInt();
			if (comb == 1) {
				a++;
			}
			else if(comb == 2) {
				g++;
			}
			else if(comb == 3) {
				d++;
			}
		}
		System.out.printf("MUITO OBRIGADO%n");
		System.out.printf("Alcool: %d%n", a);
		System.out.printf("Gasolina: %d%n", g);
		System.out.printf("Diesel: %d%n", d);
		scan.close();
	}
	
}
