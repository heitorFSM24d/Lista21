package lista21;

public class PrincContaBanc {

	public static void main(String[] args) {
		
		ContaBanc cb = new ContaBanc();
		
		cb.setTitular("Breno");
		cb.depositar(1000);
		cb.sacar(2000);
		cb.getSaldo();

	}

}
