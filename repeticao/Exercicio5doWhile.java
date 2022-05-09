package repeticao;

import java.util.Scanner;

public class Exercicio5doWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, soma=0;
		
		do {
			System.out.println("Informe varios numeros para ver a soma deles: ");
			n = sc.nextInt();
			soma+=n;
		}while(n!=0);
		
		System.out.println("A soma dos numeros e: " + soma);
		
		sc.close();

	}

}
