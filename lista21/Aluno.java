package lista21;

public class Aluno {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		
		return nome;
	}
	public void setNome(String nome) {
		System.out.println("Aluno/a : "+ nome);
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if (idade < 0) {
			System.out.println("Idade Inválida");
		} else {
			System.out.println("Idade: "+ idade);
		}
		this.idade = idade;
	}
	

}
