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
		System.out.println("Avião "+modelo+" está voando!!");
	}
	
	public void pousar() {
		System.out.println("Avião com modelo "+modelo+" e fabricante"+fabricante+" está pousando!!");
	}
	
	public void status() {
		System.out.println("O avião do fabricante "+fabricante+", com modelo "+modelo+" tem "+qtdAssentos+" quantidade de assentos e podendo chegar numa velocidade máxima de "+velocidade+"km/h!!");
	}
	

}
