import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horai, horaf;
		int duracao;
		
		System.out.println("Digite a hora inicial:");
		horai = sc.nextInt();
		System.out.println("Digite a hora final:");
		horaf = sc.nextInt();
		
		if(horai < horaf) {
			duracao = horaf - horai;
			System.out.println("O jogo durou " + duracao + " horas.");
		}
		else {
			duracao = (24 - horai) + horaf;
			System.out.println("O jogo durou " + duracao + " horas.");
		}
		
		sc.close();
	}

}
