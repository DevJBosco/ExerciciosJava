package POO;

import java.util.Date;

public class Funcionario extends Pessoa { public Funcionario(String nome, String cpf, Date data) {
		super(nome, cpf, data);
	}
public double salario;
public Date data_admissao;
public String cargo;
}
