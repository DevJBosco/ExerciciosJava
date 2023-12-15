package Polimorfismo;

public class animais {
	String cor;
	String nome;
	
	public animais (String cor, String nome) {
		this.cor = cor;
		this.nome= nome;
		
	}
	public  void emitirsom() {
		System.out.println("Está emitindo um som:");
	}
	public void locomover() { 
		System.out.println("Está locomovendo ");
	}
}
