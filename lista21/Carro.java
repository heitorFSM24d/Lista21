package lista21;

public class Carro {
	
	private String modelo;
	private int ano;
	private int velocidadeAtual;
	int velocidadeInicial = 0;
	
	public void acelerar(int valor) {
	    velocidadeAtual += valor;
	    System.out.println("Você acelerou: " + valor + "Km/H");
	}
	
	public void frear(int valor) {
		int velocidade = velocidadeAtual - valor;
		if (velocidade < 0) {
			System.out.println("Você freiou demais");
			return;
		}
		velocidadeAtual -= valor;
		System.out.println("Você freiou: " + valor + "Km/H");	
		}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		if(modelo == null || modelo.isEmpty()) {
			System.out.println("Modelo invalido!");
			return;
		}
		this.modelo = modelo;
		System.out.println("Modelo do carro: " + modelo);
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		if(ano < 1885) {
			System.out.println("Ano invalido");
			return;
		}
		this.ano = ano;
		System.out.println("Ano do modelo do carro: " + ano + "\n");
	}
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
		System.out.println("Velocidade atual: " + velocidadeAtual + "Km/H");
	}
}