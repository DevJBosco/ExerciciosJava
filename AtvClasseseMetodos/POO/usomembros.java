package POO;

public class usomembros {
public static void main(String[] args) {
	DataNascimento dt = new DataNascimento();
	DataNascimento dt2 = new DataNascimento();
	
	dt.dia = 12;
	dt.mes = 2;
	dt.ano = 1991;
	
	dt2.dia = 13;
	dt2.mes = 10;
	dt2.ano = 1992;
	
	System.out.printf("A data de nascimento é %d %d %d \n", dt.dia, dt.mes, dt.ano);
	System.out.printf("A data de nascimento é %d %d %d", dt2.dia, dt2.mes, dt2.ano);
}
}
