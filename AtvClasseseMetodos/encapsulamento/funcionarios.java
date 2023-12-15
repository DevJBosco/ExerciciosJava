package encapsulamento;

public class funcionarios {
	String nome;
	private String cpf;
	private String rg;
	private String email;
	String endereco;
	private String telefone;
	private int qfilhos;
	private double salario;
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getQfilhos() {
		return qfilhos;
	}
	public void setQfilhos(int qfilhos) {
		this.qfilhos = qfilhos;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}

