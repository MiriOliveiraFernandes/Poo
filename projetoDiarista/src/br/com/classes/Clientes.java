package br.com.classes;

public class Clientes extends Pessoa{

	

	@Override
	public void sacar(float valor) {

		var saldoAtual = this.getSaldo();
		
		var novoSaldo = saldoAtual - valor;
		this.setSaldo(novoSaldo);
		
	}

	@Override
	public void depositar(float valor) {
		
		var saldoAtual = this.getSaldo();
		
		var novoSaldo = saldoAtual + (valor+ (valor/100)*10);
		this.setSaldo(novoSaldo);
		
	}
}
