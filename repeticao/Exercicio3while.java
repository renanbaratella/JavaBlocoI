package repeticao;

import java.util.Scanner;

public class Exercicio3while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade, menos21=0, maior50=0;
		
		System.out.println("Informe a idade de uma pessoa: ");
		idade = sc.nextInt();
		
		while(idade!=-99) {
			if(idade<21) {
				menos21++;
			}
			if(idade>50) {
				maior50++;
			}
			
			System.out.println("Informe a idade de uma pessoa: ");
			idade = sc.nextInt();	

		}
		
		System.out.println("O numero de pessoas com idade menor que 21 e: "+menos21);
		System.out.println("O numero de pessoas com idade maior que 50 e: "+maior50);
		
		sc.close();

	}
}

