package arrudeia;
import java.util.Scanner;
public class Exercicio03Array {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);		
int arrayA[]= new int [5];
int arrayB[]= new int [5];
int arrayC[]= new int [5];
int arrayD[]= new int [5];
	for (int x=0;x<arrayA.length; x++) {
	System.out.println("Letra A. Digite um número");
	int  valor = input.nextInt();
	arrayA[x]= valor;
	}	
	for (int x=0;x<arrayB.length; x++) {
	System.out.println("Letra B.Digite um número");
	int  valor = input.nextInt();
	arrayB[x]= valor; 
	}
	for (int x=0;x<arrayC.length; x++) {
	System.out.println("Letra C.Digite um número");
	int  valor = input.nextInt();
	arrayC[x]= valor;
	}
	for (int x=0;x<arrayD.length; x++) {
	System.out.println("Letra D.Digite um número");
	int  valor = input.nextInt();
	arrayD[x]= valor;
	}
	for (int x : arrayA) {
		System.out.print(x + " ");
		
	}	
		System.out.println();
	for (int x : arrayB) {
		System.out.print(x + " ");
	}
		System.out.println();
	for (int x : arrayC) {
		System.out.print(x + " ");
	}
		System.out.println();
	for (int x : arrayD) {
		System.out.print(x + " ");
		}
		System.out.println();
	}
}		

