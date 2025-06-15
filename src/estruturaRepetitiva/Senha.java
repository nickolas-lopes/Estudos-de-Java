package estruturaRepetitiva;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int senha;
		senha = 0;
		while(senha != 2002) {
			senha = scan.nextInt();
			if(senha != 2002) {
				System.out.printf("Senha Invalida%n");
			}
		}
		System.out.printf("Acesso Permitido%n");
		scan.close();
		
	}

}
