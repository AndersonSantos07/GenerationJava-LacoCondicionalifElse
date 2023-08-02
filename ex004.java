package exLacoCondicional;

import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		
		String palavra1,palavra2,palavra3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nPalavras: ");
		System.out.println("\nVertebrado e Invertebrado ");
		System.out.println("\nEntre com a primeira palavra: ");
		palavra1 = ler.next();
		
		
		if(palavra1.equalsIgnoreCase("vertebrado")) {
			System.out.println("\nPalavras: ");
			System.out.println("\nAve e Mamifero ");
			System.out.println("\nEntre com a segunda palavra: ");
			palavra2 = ler.next();
			if(palavra2.equalsIgnoreCase("ave")) {
				System.out.println("\nPalavras: ");
				System.out.println("\nCarnivoro e Ornivoro ");
				System.out.println("\nEntre com a terceira palavra: ");
				palavra3 = ler.next();
				if(palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("\nÁguia");
				}else if(palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("\nPomba");
				}else {
					System.out.println("\nDigite uma das opções disponíveis!");
				}
				
			}else if(palavra2.equalsIgnoreCase("mamifero")) {
				System.out.println("\nPalavras: ");
				System.out.println("\nCarnivoro e Ornivoro ");
				System.out.println("\nEntre com a terceira palavra: ");
				palavra3 = ler.next();
				if(palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("\nHomem");
					
				}else if(palavra3.equalsIgnoreCase("herbivoro")) {
					System.out.println("\nVaca");

				}else {
					System.out.println("\nDigite uma das opções disponíveis!");
				}
				
			}else {
				System.out.println("\nDigite uma das opções disponíveis!");
			}
			
		}else if(palavra1.equalsIgnoreCase("invertebrado")) {
			System.out.println("\nPalavras: ");
			System.out.println("\nInseto e Anelídeo ");
			System.out.println("\nEntre com a segunda palavra: ");
			palavra2 = ler.next();
			if(palavra2.equalsIgnoreCase("inseto")) {
				System.out.println("\nPalavras: ");
				System.out.println("\nHematofago e Herbivoro ");
				System.out.println("\nEntre com a terceira palavra: ");
				palavra3 = ler.next();
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("\nPulga");
					
				}else if(palavra3.equalsIgnoreCase("herbivoro")) {
					System.out.println("\nLagarta");
					
				}else {
					System.out.println("\nDigite uma das opções disponíveis!");
				}
				
			}else if(palavra2.equalsIgnoreCase("anelideo")) {
				System.out.println("\nPalavras: ");
				System.out.println("\nHematofago e Onivoro ");
				System.out.println("\nEntre com a terceira palavra: ");
				palavra3 = ler.next();
				if(palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("\nSanguessuga");
					
				}else if(palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("\nMinhoca");
					
				}else {
					System.out.println("\nDigite uma das opções disponíveis!");
				}
				
			}else {
				System.out.println("\nDigite uma das opções disponíveis!");
			}
			
		}else {
			System.out.println("\nDigite uma das opções disponíveis!");
		}
	}
}
	
	
	

