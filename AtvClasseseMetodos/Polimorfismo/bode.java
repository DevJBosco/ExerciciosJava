package Polimorfismo;

public class bode extends mamifero {

	public bode(String cor, String nome) {
		super(cor, nome);
	
	}
	public void locomover() {
		System.out.println("O bode esta puto indo na sua direção!");
	}
	public void emitirsom() {
		System.out.println("O bode está cacarejando. ??????????");
	}
}
