import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario, imposto;
		
		System.out.println("Digite o salario:");
		salario = sc.nextDouble();
		salario = Math.abs(salario);
		
		if(salario <= 2000.00) {
			imposto = 0.0;
			System.out.println("Isento");
		}
		else if(salario <= 3000.00) {
			imposto = (salario - 2000.00) * 0.08;
			System.out.printf("O valor do imposto é: R$ %.2f%n", imposto);
		}
		else if(salario <= 4500.00) {
			imposto = ((salario - 3000.00) * 0.18) + 80;
			System.out.printf("O valor do imposto é: R$ %.2f%n", imposto);
		}
		else {
			imposto = ((salario - 4500.00) * 0.28) + 350;
			System.out.printf("O valor do imposto é: R$ %.2f%n", imposto);
		}
		sc.close();
	}

}
