package repeticao;

import java.util.Scanner;

public class Exercicio2for {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, par=0, impar=0;
		
		for(int i=0;i<10;i++) {
			System.out.print("Informe um numero: ");
			n = sc.nextInt();
			
			if(n%2==0) {
				par++;
			}else {
				impar++;
			}
		}
		
		System.out.println("O numero de pares e: "+par);
		System.out.println("O numero de impares e: "+impar);
		
		
		sc.close();
		
		
		
		
		
		
		
	}
}
