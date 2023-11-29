package repeticoes;
import java.util.Scanner;
public class exercicio03While {
public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número inteiro.");
		int num = input.nextInt();
		int num1 = 1;
		int num2 = 1;
		int contimp = 0;
		int contpar = 0;
		System.out.println("impares: ");
		while (num1 <=num) {
			if(num1 % 2 != 0) {
				System.out.print(num1 + " ");
				contimp++;
				
			}
			num1++;
		}
		System.out.println("\npares: ");
		while (num2<=num) {
			if(num2 % 2 == 0) {
				System.out.print(num2+ " ");
				contpar++;
			}
			num2++;
		
		}
		System.out.println("\nQuantidade de números impares:"+contimp+ "\nQuantidade de números pares:" +contpar);
		
	}

}
