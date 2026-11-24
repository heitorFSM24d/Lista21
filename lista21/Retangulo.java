package lista21;

public class Retangulo {
	
	private double largura;
	private double altura;
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if(altura < 0) {
			System.out.println("Valor irregular de lado, insira um valor valido");
		}else {
			System.out.println("Valor da altura: "+ altura);
		}
		this.altura = altura;
	}
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		if(largura < 0) {
			System.out.println("Valor irregular de lado, insira um valor valido");
		}else {
			System.out.println("Valor da largura: "+ largura);
		}
		this.largura = largura;
	}
	
	public void areaRetangulo() {
		double area = altura * largura;
		System.out.println("Área do retângulo: "+ area);
	}
	
	public void periRetangulo() {
		double perimetro = (altura * 2) + (largura * 2);
		System.out.println("Perímetro do retângulo: "+ perimetro);
	}

}
