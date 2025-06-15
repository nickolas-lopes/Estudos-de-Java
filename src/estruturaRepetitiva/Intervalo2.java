package estruturaCondicional;

import java.util.Scanner;

public class Intervalo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q, dentro, fora;
		dentro = 0;
		fora = 0;
		q = scan.nextInt();
		for(int i = 0; i < q; i++) {
			int n = scan.nextInt();
			if(n >= 10 && n <= 20) {
				dentro++;
			}
			else{
				fora++;
			}
		}
		System.out.printf("%d in%n", dentro);
		System.out.printf("%d out%n", fora);
		scan.close();
	}

}
