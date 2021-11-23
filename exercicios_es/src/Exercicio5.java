import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int peca1, peca2 , n1, n2;
		double valorUni1, valorUni2, preco1, preco2, total;
		
		peca1 = sc.nextInt();
		n1 = sc.nextInt();
		valorUni1 = sc.nextDouble();
		preco1 = n1 * valorUni1;
		
		peca2 = sc.nextInt();
		n2 = sc.nextInt();
		valorUni2 = sc.nextDouble();
		preco2 = n2 * valorUni2;
		
		peca1 = Math.abs(peca1);
		peca2 = Math.abs(peca2);
		
		total = preco1 + preco2;
		
		System.out.printf("Valor à pagar: R$ %.2f%n", total);
		
		sc.close();
	}

}
