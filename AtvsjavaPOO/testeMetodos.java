package javaPOO;

public class testeMetodos {
	public static void main(String[] args) {
		javaMetodos cliente01 = new javaMetodos();
		int idade= cliente01.idade();
		String nome = cliente01.nome();
		double valor = cliente01.valor();
		boolean estado = cliente01.estado();
		System.out.printf("A idade do aluno %s é %d", nome, idade);
		
	}
}
