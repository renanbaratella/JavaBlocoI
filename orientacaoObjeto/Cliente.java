package orientacaoObjeto;

public class Cliente {

	int codigo;
	String nome;
	int idade;
	String telefone;
	String cpf;
	boolean isAtivo;
	
	public Cliente(int codigo, String nome, int idade, String telefone, String cpf, boolean isAtivo) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.cpf = cpf;
		this.isAtivo = isAtivo;
	}

	public void ativaDesativa() {
		if(this.isAtivo) {
			isAtivo = false;
			System.out.println("Ativo: "+this.isAtivo);
		}
		else {
			isAtivo = true;
			System.out.println("Ativo: "+this.isAtivo);
		}
	}
	
	public void status() {
		System.out.println("Código: "+this.codigo);
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Telefone: "+this.telefone);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Ativo: "+this.isAtivo);
		
	}
	
	
}
