package orientacaoObjeto;

public class Aviao {

	String fabricante;
	String modelo;
	int qtdAssentos;
	int velocidade;
	
	public Aviao(String fabricante, String modelo, int qtdAssentos, int velocidade) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.qtdAssentos = qtdAssentos;
		this.velocidade = velocidade;
	}
	
	public void voar() {
		System.out.println("Avi�o "+modelo+" est� voando!!");
	}
	
	public void pousar() {
		System.out.println("Avi�o com modelo "+modelo+" e fabricante"+fabricante+" est� pousando!!");
	}
	
	public void status() {
		System.out.println("O avi�o do fabricante "+fabricante+", com modelo "+modelo+" tem "+qtdAssentos+" quantidade de assentos e podendo chegar numa velocidade m�xima de "+velocidade+"km/h!!");
	}
	

}
