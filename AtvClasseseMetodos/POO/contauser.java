package botafora;

public class contauser {
public static void main(String[] args) {
ContaCorrente conta1 = new ContaCorrente();
	conta1.depositar(500);
	double saldo = conta1.getSaldo();
	System.out.println(saldo);
	conta1.sacar(250);
	saldo=conta1.getSaldo();
	System.out.println(saldo);

}
}