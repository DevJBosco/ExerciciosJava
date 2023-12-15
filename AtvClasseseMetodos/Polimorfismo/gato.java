package Polimorfismo;

public class gato extends mamifero {

	public gato(String cor, String nome) {
		super(cor, nome);
	}
	public void emitirsom() {
		System.out.println("O gato está miando.");
		
	}
	public void locomover() {
		System.out.println("Está se locomovendo");
	}
	
}
