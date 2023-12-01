package arrudeia;
import java.util.Scanner;
public class Exercicio04Array {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);		
 	float[] notas = new float [5];
 	
	for (int x=0; x<notas.length; x++) {
	System.out.println("Digite uma nota");
	notas[x] = input.nextFloat();
	}
	float somaNotas = 0;
	for (float nota : notas) {
		somaNotas += nota;
	}
	float media = somaNotas / 5;
	System.out.println("A média das notas dos alunos foi de" + " " +media);
	
		}
	}
