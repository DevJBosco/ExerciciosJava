package veiculoPOO;

public class carro extends motorizado {
	int qportas;
	public carro(String modelo, String nome, String cor, int ano) {
		super(modelo, nome, cor, ano);

	}
	public void acelerarCarro() {
		System.out.println("O carro está acelerando! VRUM VRUM");
	}
	public void baterocarro() {
		System.out.println("Voce bateu o carro!");
	}
}

