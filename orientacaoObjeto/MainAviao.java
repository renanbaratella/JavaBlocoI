package orientacaoObjeto;

public class MainAviao {

	public static void main(String[] args) {
		Aviao aviao = new Aviao("Companhia Nacional de Navegação Aérea", "Junkers F13", 4, 200);
		Aviao aviao2 = new Aviao("Companhia Aeronáutica Paulista", "Douglas DC-3", 28, 320);
		
		aviao.status();
		System.out.println();
		aviao2.status();

	}

}
