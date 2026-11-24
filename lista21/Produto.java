package lista21;

public class Produto {
	
	private String nome;
	private double preco;
	private int estoque;
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if (preco < 0) {
			System.out.println("Preço inválido, insira outro");
		}else {
			System.out.println("Preço: "+ preco);
		}
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome == null || nome.isEmpty()) {
			System.out.println("Insira o nome do produto");
		}else {
			System.out.println("Produto: "+ nome);
		}
		this.nome = nome;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		if (estoque < 0) {
			System.out.println("Valor inválido, insira outro");
		}else {
			System.out.println("Estoque: "+ estoque);
		}
		this.estoque = estoque;
	}

}
