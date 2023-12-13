package veiculoPOO;

public class cidade {
	public static void main(String[] args) {
		
		carro c1 = new carro("Kombi","Volkswagen", "Branco",2009);
		c1.motor="2.0";
		c1.acelerarCarro();
		c1.baterocarro();
		
		carroca ca01 = new carroca("Charrete","Rocket movel","Rosa",2024);
		ca01.tipodetraçao="Jumento  4x4";
		ca01.galopar();
		
		Bike b1 = new Bike("Monark","Barra circular de metal","roxo neon",2003);
		b1.tipodetraçao="Suas pernas e uma ladeira";
		}
		
}

