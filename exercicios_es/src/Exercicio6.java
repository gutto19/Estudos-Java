import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A, B, C, pi = 3.14159;
		double triang, circ, trap, quad, ret, raio;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triang = (A * C) / 2; //Area do triangulo
		
		raio = C;
		raio = Math.pow(C, 2);
		circ = pi * raio; //Area do circulo
		
		trap = ((A + B) / 2) * C; //Area do trapezio
		
		quad = Math.pow(B, 2); //Area do quadrado
		
		ret = A * B;
		
		System.out.printf("Tiangulo: %.3f%n", triang);
		System.out.printf("Circulo: %.3f%n", circ);
		System.out.printf("Trapezio: %.3f%n", trap);
		System.out.printf("Quadrado: %.3f%n", quad);
		System.out.printf("Retangulo: %.3f%n", ret);
		
		sc.close();
	}

}
