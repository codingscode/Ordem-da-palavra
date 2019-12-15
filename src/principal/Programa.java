package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma frase : ");
		
		try {
			String[] vetor = sc.nextLine().split(" ");
			System.out.println("Digite a ordem da palavra : ");
			int posicao = sc.nextInt();
			System.out.println(vetor[posicao]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("Posição inválida");
		}
		catch(InputMismatchException e) {
		  System.out.println("Erro de entrada");
		}
		
		System.out.println("Fim do Programa");
                sc.close();
	}

}
