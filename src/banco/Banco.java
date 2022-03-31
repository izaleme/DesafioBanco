package banco;

/* **************************************************************
 * DESAFIO BANCO
 * Crie uma classe Banco que simule uma institui��o financeira.
 * Nela ser�o armazenadas v�rias contas.
 * Defina quais ser�o as a��es que este banco poder� fazer.
 * ************************************************************* */

public class Banco {

	private Conta[] contas = new Conta[15];
	private double saldoContas = 0;
	private int total = 0;
	
	public void adicionarConta(Conta adicionar) {
		if(total < 15) {
			contas[total] = adicionar;
			total++;
		}
	}
	
	public double getSaldoContas() {
		for(int i = 0; i < contas.length; i++) {
			saldoContas += contas[i].getSaldo();
		}
		
		return saldoContas;
	}
	
	public Conta[] getContas() {
		return contas;
	}
	
	public void transferenciaEntreContas(Conta contaOrigem, Conta contaDestino, double valor) {
		if(contaOrigem.sacar(valor)) {
			contaDestino.depositar(valor);
		}
	}

}