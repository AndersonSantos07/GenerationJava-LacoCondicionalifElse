package exLacoCondicional;

import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		
		int A,B,C,D;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número: ");
		A = ler.nextInt();
		
		System.out.println("\nDigite o segundo número: ");
		B = ler.nextInt();
		System.out.println("\nDigite o terceiro número: ");
		C = ler.nextInt();
		
		D = A + B;
		
		if(D > C) {
			System.out.println("\nA soma de A: " + A + " mais B: "  + B + " É " + D + " Logo é maior que C: " + C);
		}
		else if(D == C){
			System.out.println("\nA soma de A: " + A + " mais B: "  + B + " É " + D + " Logo é igual a C: " + C);
		}
		else {
			System.out.println("\nA soma de A: " + A + " mais B: " + B + " É " + D + " Logo é menor que C: " + C);
			
		}
		
		
		

	}

}
