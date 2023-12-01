package arrudeia;

public class Exercicio01Array {
public static void main(String[] args) {
	int[] intArray = {2,5,46,12,34};
	int newArray[] = new int [5];
	for(int x=0; x<intArray.length; x++) {
		System.out.print(intArray[x]+ " ");
	}	 
	System.out.println();
	for(int x=4; x>=0; x--) {
		System.out.print(intArray[x] +" ");
		System.out.print(" ");
		newArray[4-x] = intArray[x];

		}
	}
}
