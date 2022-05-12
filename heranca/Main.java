package heranca;

public class Main {
	
	public static void main (String args[]) {

		Animal animal = new Animal();
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		animal.nome = "Jubileu";
		animal.idade = 12;

		cachorro.nome = "Cachorrinho";
		cachorro.idade = 11;
		
		cavalo.nome = "Cavalinho";
		cavalo.idade = 10;
		
		preguica.nome = "Preguiça";
		preguica.idade = 9;
		
		System.out.println(animal.nome);
		System.out.println(animal.idade);
		animal.emitirSom();
		animal.correr();
		
		System.out.println();
		
		System.out.println(cachorro.nome);
		System.out.println(cachorro.idade);
		cachorro.emitirSom();
		cachorro.correr();
		
		System.out.println();
		
		System.out.println(cavalo.nome);
		System.out.println(cavalo.idade);
		cavalo.emitirSom();
		cavalo.correr();
		
		System.out.println();
		
		System.out.println(preguica.nome);
		System.out.println(preguica.idade);
		preguica.emitirSom();
		preguica.correr();
	
	}
	
}
