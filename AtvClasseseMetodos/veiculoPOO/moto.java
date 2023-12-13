package veiculoPOO;

public class moto extends motorizado{
	int passageiros;
	public moto(String modelo, String nome, String cor, int ano) {
		super(modelo, nome, cor, ano);
	
	}
	public void dargrau() {
		System.out.println("Vc ta dando grau, cuidado com a poilicia!");
	}
}
