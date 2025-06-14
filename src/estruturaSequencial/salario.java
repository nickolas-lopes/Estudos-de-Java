package estruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan =  new Scanner(System.in);
		int num, horas;
		double sal_hora;
		num = scan.nextInt();
		horas = scan.nextInt();
		sal_hora = scan.nextDouble();
		double total =horas * sal_hora;
		System.out.printf("NUMBER = %d%n", num);
		System.out.printf("SALARY = U$ %.2f%n", total);
		scan.close();
	}

}
