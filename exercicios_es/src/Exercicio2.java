import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area, raio, pi, x;
		pi = 3.14159;
		
		raio = sc.nextDouble();
		x = Math.pow(raio, 2);
		
		area = pi * x;
		
		System.out.println("O raio do circulo: " + raio);
		System.out.printf("A area desta figura é: %.4f%n", area);
		
		sc.close();
	}

}
