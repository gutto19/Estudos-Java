import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, x, y, dif;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		x = A * B;
		y = C * D;
		
		dif = x - y;
		
		System.out.println("Diferença = " + dif);
		
		sc.close();
	}

}
