package Polimorfismo;

public class calculadora {
	public static void main(String[] args) {
	double  s1,s2,s3,s4,s5,s6,s7,s8;
	operadores calculos = new operadores();
	s1 = calculos.somar(1,2);
	s2 = calculos.somar(5,6,7);
	s3 = calculos.subtrair(7,8);
	s4 = calculos.subtrair(9,2,1);
	s5 = calculos.multiplicar(5,4);
	s6 = calculos.multiplicar(8,9,2);
	s7 = calculos.dividir(5,2);
	s8 = calculos.dividir(8,2,3);

	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s5);
	System.out.println(s6);
	System.out.println(s7);
	System.out.println(s8);

	}
	
	
}
