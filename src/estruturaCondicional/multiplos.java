package estruturaCondicional;

import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, r1, r2;
		a = scan.nextInt();
		b = scan.nextInt();
		r1 = a % b;
		r2 = b % a;
		if (r1 == 0 || r2 == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		scan.close();
	}
	

}
