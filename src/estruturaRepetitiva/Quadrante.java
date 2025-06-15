package estruturaCondicional;

import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, y;
		x = 1;
		y = 1;
		while (x != 0 && y != 0) {
			x = scan.nextInt();
			y = scan.nextInt();
			if(x > 0 && y > 0) {
				System.out.printf("primeiro%n");
			}
			else if (x < 0 && y > 0) {
				System.out.printf("segundo%n");
			}
			else if (x < 0 && y < 0) {
				System.out.printf("terceiro%n");
			}
			else if (x > 0 && y < 0) {
				System.out.printf("quarto%n");
			}
		}
		scan.close();
		}
	}


