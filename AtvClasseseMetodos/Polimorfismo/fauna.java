package Polimorfismo;

public class fauna {
	public static void main(String[] args) {
		gato gato = new gato("Ximarrão","Rosa");
		bode bode = new bode("Paralelepipedo","Rosê");
		galinha galinha= new galinha("Pythonzinha", "ximas");
		pombo pombo = new pombo("Faustão","roxo");
		gato.genero = "Masculino";
		gato.emitirsom();
		gato.locomover();
		bode.emitirsom();
		bode.locomover();
		pombo.rapina = "Não";
		galinha.emitirsom();
		pombo.emitirsom();
	}
}
