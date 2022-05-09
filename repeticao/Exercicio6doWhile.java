package repeticao;

import java.util.Scanner;

public class Exercicio6doWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, soma=0, qtd=0, media;
		
		do {
			
			System.out.println("Informe varios numeros: ");
			n = sc.nextInt();
			
			if(n%3==0 && n!=0) {
				qtd++;
				soma+= n;
			}
			
		}while(n!=0);
		
		media = soma / qtd;
		System.out.println("A media dos numeros multiplos de 3 e: " + media);
		
		
		sc.close();

	}

}
