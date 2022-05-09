package repeticao;

import java.util.Scanner;

public class Exercicio4while {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i=0, idade, sexo, opcao, qtdPessoasCalmas=0, qtdMulheresNervosas=0,
		qtdHomensAgressivos=0, qtdOutrosCalmos=0, qtdPessoasNervosasMaior40=0,
		qtdPessoasCalmasMenor18=0;
		
		while(i<150) {
			System.out.println("Informe a idade do individuo: ");
			idade = sc.nextInt();
			System.out.println("Informe o sexo do individuo: 1 - Feminino 2 - Masculino 3 - Outros ");
			sexo = sc.nextInt();
			System.out.println("Informe alguma das opcoes informadas: 1 - Pessoa calma 2 - Pessoa nervosa 3 - Pessoa agressiva");
			opcao = sc.nextInt();
			
			if(opcao == 1)qtdPessoasCalmas++;
			if(sexo == 1 && opcao == 2)qtdMulheresNervosas++;
			if(sexo == 2 && opcao == 3)qtdHomensAgressivos++;
			if(sexo == 3 && opcao == 1)qtdOutrosCalmos++;
			if(opcao == 2 && idade > 40)qtdPessoasNervosasMaior40++;
			if(opcao == 1 && idade < 18)qtdPessoasCalmasMenor18++;
			
			i++;
		}
		
		System.out.println("O numero de pessoas calmas e: "+ qtdPessoasCalmas);
		System.out.println("O numero de mulheres nervosas: "+ qtdMulheresNervosas);
		System.out.println("O numero de homens agressivos: "+ qtdHomensAgressivos);
		System.out.println("O numero de outros calmos: "+ qtdOutrosCalmos);
		System.out.println("O numero de pessoas nervosas com mais de 40 anos e: "+ qtdPessoasNervosasMaior40);
		System.out.println("O numero de pessoas calmas com menos de 18 anos: "+ qtdPessoasCalmasMenor18);
		
		
		sc.close();
	}

}
