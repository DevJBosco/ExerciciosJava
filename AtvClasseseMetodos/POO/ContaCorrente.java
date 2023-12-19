package botafora;

public class ContaCorrente implements conta {
private double saldo;
public double taxaOperacao;
	@Override
	public void depositar(double valor) {
		this.saldo += valor + taxaOperacao;
		
	}

	@Override
	public double getSaldo() {
		return  this.saldo;
		
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor + taxaOperacao;
		
	}

}
