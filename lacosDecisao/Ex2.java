package lacosDecisao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int n1,n2,n3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.print("Informe o segundo numero: ");
		n2 = sc.nextInt();
		System.out.print("Informe o terceiro numero: ");
		n3 = sc.nextInt();
		
		
		if(n1<=n2 && n1<=n3 && n2<=n3) {
			System.out.println(n1+"\n"+n2+"\n"+n3);
		}else if(n1<=n2 && n1<=n3 && n3<=n2) {
			System.out.println(n1+"\n"+n3+"\n"+n2);
		}else if(n2<=n1 && n2<=n3 && n1<=n3) {
			System.out.println(n2+"\n"+n1+"\n"+n3);
		}else if(n2<=n1 && n2<=n3 && n3<=n1) {
			System.out.println(n2+"\n"+n3+"\n"+n1);
		}else if(n3<=n1 && n3<=n2 && n1<=n2) {
			System.out.println(n3+"\n"+n1+"\n"+n2);
		}else {
			System.out.println(n3+"\n"+n2+"\n"+n1);
		}
		sc.close();

	}

}
