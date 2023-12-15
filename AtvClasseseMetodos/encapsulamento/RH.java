package encapsulamento;

public class RH {
	public static void main(String[] args) {
	funcionarios f1 = new funcionarios();
	f1.nome="Clanderavaldo";
	f1.endereco="Xuxaxaxuxuxa 1522";
	f1.setCpf("344422423");
	String CPF = f1.getCpf();
	System.out.println(CPF);
	f1.setEmail("xauxauxuaxux@gmail.com");
	String email = f1.getEmail();
	System.out.println(email);
	f1.setQfilhos(5);
	int qfilhos = f1.getQfilhos();
	System.out.println(qfilhos);
	f1.getTelefone("42343243242");
	String telefone = f1.getTelefone();
	System.out.println(telefone);
	f1.setSalario(345454);
	double salario = f1.getSalario();
	System.out.println(salario);
	
}
}
