package heranca;

public class Animal {

	String nome;
	int idade;
	
	public void emitirSom() {
		System.out.println("Eu "+this.nome+" emito um som!!");
	}
	
	public void correr() {
		System.out.println("Eu "+this.nome+" estou correndo");
	}
	
}
