package lacosDecisao;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Informe um numero: ");
		n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println("\nO numero "+n+" e par");
			System.out.println("A raiz quadrada de "+n+" e "+Math.sqrt(n));
			
		}else {
			System.out.println("\nEste numero e impar "+n);
			System.out.println("O numero "+n+" elevado ao quadrado e: "+Math.pow(n, 2));
		}
		
		sc.close();
	}

}
