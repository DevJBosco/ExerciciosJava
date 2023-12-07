package javaPOO;
import java.util.Scanner;
public class calculadoraSoma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número:");
		int a = input.nextInt();
		int b = input.nextInt();
		somarMetodos calculadora = new somarMetodos();
		int somar = calculadora.somar(a,b);
		System.out.printf("a soma foi %d",somar);
		
	
		System.out.println();
		multiplicarMetodos calcu = new multiplicarMetodos();
		int mult = calcu.multiplicar(a,b);
		System.out.printf("A multiplicação foi %d",mult);
	}
}
