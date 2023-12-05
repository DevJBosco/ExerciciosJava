package ReceitaFederal;
import java.util.StringTokenizer;
import java.util.Scanner;
public class exercicio01String {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Digite o texto");
	StringTokenizer texto = new StringTokenizer(input.nextLine());
	System.out.println(texto.countTokens());
}
}
