package POO;
import java.util.Date;
public class Pessoa {
	public String nome;
	public String cpf;
	public Date data_nascimento;
	
	public Pessoa(String nome, String cpf, Date data) {
		this.nome = nome;
		this.cpf = cpf;
		this.data_nascimento = data;
	}
}

