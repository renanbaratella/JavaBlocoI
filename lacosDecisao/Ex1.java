package lacosDecisao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int n1,n2,n3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.print("Informe o segundo numero: ");
		n2 = sc.nextInt();
		System.out.print("Informe o terceiro numero: ");
		n3 = sc.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("O n1 e maior.");
		} else if(n2>n1 && n2>n3) {
			System.out.println("O n2 e maior");
		} else {
			System.out.println("O n3 e maior");
		}
		
		sc.close();
	}

}