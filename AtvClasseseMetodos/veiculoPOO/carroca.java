package veiculoPOO;

public class carroca extends naomotorizado {

	public carroca(String modelo, String nome, String cor, int ano) {
		super(modelo, nome, cor, ano);
		
	}
	public void galopar() {
		System.out.println("Voce esta gapolando!");
	}
}
