import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod, qtd;
		double valor;
		
		System.out.println("Digite o código do produto:");
		cod = sc.nextInt();
		System.out.println("Qual a quantidade desejada?");
		qtd = sc.nextInt();
		
		if(cod == 1) {
			valor = qtd * 4.00;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else if(cod == 2) {
			valor = qtd * 4.50;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else if(cod == 3) {
			valor = qtd * 5.00;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else if(cod == 4) {
			valor = qtd * 2.00;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else if(cod == 5) {
			valor = qtd * 1.50;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else {
			System.out.println("Produto não registrado.");
		}
		
		sc.close();
	}

}
