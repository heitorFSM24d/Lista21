package lista21;

public class Avaliacao {
	
	private String nome;
	private double nota1;
	private double nota2;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null || nome.isEmpty()) {
			System.out.println("Insira um nome para identificação");
		}else {
			System.out.println("Estudante: "+ nome);
		}
		this.nome = nome;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		if(nota2 < 0 || nota2 > 10) {
			System.out.println("Valor inválido, insira o valor correto da sua nota");
		}else {
			System.out.println("Nota 2: "+ nota2);
		}
		this.nota2 = nota2;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		if(nota1 < 0 || nota1 > 10) {
			System.out.println("Valor inválido, insira o valor correto da sua nota");
		}else {
			System.out.println("Nota 1: "+ nota1);
		}
		this.nota1 = nota1;
	}
	
	public void mediatotal() {
		double valor = (nota1 + nota2) / 2;
		System.out.println("Média Final: "+ valor);
	}

}
