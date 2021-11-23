import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numFuncionario, numHorasTrab;
		double valorHora, salario;
		
		numFuncionario = sc.nextInt();
		numHorasTrab = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = numHorasTrab * valorHora;
		
		System.out.println("Number: " + numFuncionario);
		System.out.printf("Salary: U$ %.2f%n", salario);
		
		sc.close();
	}

}
