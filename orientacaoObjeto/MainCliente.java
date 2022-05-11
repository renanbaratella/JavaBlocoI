package orientacaoObjeto;

public class MainCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "Renan", 23, "11933222323", "42233322211", false);
		Cliente cliente2 = new Cliente(2, "Tadeu", 23, "11923231111", "23323323322", false);
		
		cliente.status();
		System.out.println("Modificando o status: ");
		cliente.ativaDesativa();
		
		System.out.println();
		
		cliente2.status();
		
		
		
	}

}
