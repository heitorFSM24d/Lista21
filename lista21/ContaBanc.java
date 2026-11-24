package lista21;

public class ContaBanc {
	
	private String titular;
	private double saldo;
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		if (titular == null || titular.isEmpty()) {
			System.out.println("Digite um nome!");
		}else {
			System.out.println("Titular "+ titular);
		}
		this.titular = titular;
	}
	
	public double getSaldo() {
		System.out.println("Saldo atual: "+ saldo);
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		if (valor < 0) {
			System.out.println("Valor inválido para depositar");
		} else {
			System.out.println("O valor depositado foi aceito");
		}saldo += valor;
	}
	
	public void sacar(double valor){
		if (valor > saldo|| valor < 0) {
			System.out.println("Erro! Valor inválido");
		}else {
			System.out.println("Saque realizado");
		}saldo -= valor;
	}

}
