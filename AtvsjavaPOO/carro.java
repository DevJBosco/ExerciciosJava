package javaPOO;

public class carro {

	private String cor;
	private double preco;
	private String modelo;

	public carro() {
	}
	public carro(String modelo,double preco) {
		this.cor = "PRETA";
		this.modelo = modelo;
		this.preco = preco;
	}	
	public carro (String cor, String modelo, double preco) {
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
	}
}

