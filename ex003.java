package exLacoCondicional;

import java.util.Scanner;

public class ex003 {
	
	public static void main(String[] args) {
		
		String name;
		int age;
		boolean doacao;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite seu nome: ");
		name = ler.next();
		
		System.out.println("\nDigite sua idade: ");
		age = ler.nextInt();
		
		System.out.println("\nSua primeira vez doando? Responda com true(sim) ou false(não): ");
		doacao = ler.nextBoolean();
		
		if(age >= 18 && age<=59) {
			System.out.println("\n"+name+" está apto para doar sangue!");
		}
		else if(age >= 60 && age <=69 && doacao == false){
			System.out.println("\n"+name+" está apto para doar sangue!");
		}
		else {
			System.out.println("\n"+name+" não está apto para doar sangue!");
		}
	}
}
