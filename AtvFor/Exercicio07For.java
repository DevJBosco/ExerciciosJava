package arrudeia;

public class Exercicio07For {
public static void main(String[] args) {
	double y = 0;
	for (int x = 1; x< 51;x++) {
		if (x%2 == 0){
			y= x/2;
		System.out.println(x+" "+y);
		}else if (x%2 == 1){
				y = 3*x+1;
		System.out.println(x+" "+y);
			}
		}	
	}
}

