package exLacoCondicional;

import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		int numero;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 0 && numero > 0) {
			System.out.println("\nO número: " + numero + " é par e positivo!");
		}
		else if (numero % 2 != 0 && numero > 0) {
			System.out.println("\nO número: " + numero + " é impar e positivo!");
		}
		else if(numero % 2 == 0 && numero < 0) {
			System.out.println("\nO número: " + numero + " é par e negativo!");
		}
		else if (numero % 2 != 0 && numero < 0) {
			System.out.println("\nO número: " + numero + " é impar e negativo!");
		}
		else {
			System.out.println("\nNúmero digitado incorreto!");
		}
	}

}
