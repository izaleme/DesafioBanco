package banco;

public class Conta {

	private double saldo = 0.0;
	
	public boolean depositar(double valor) {
		if(valor >= 0) {
			saldo += valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean sacar(double valor) {
		if(valor > 0 && valor <= saldo) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Conta contas) {
		if(sacar(valor)) {
			contas.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

}
