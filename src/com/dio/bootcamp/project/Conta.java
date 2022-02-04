package com.dio.bootcamp.project;

public abstract class Conta implements IConta {
	
	protected static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected boolean status;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.status = true;
		this.saldo = 0.0f;
		}
	
	@Override
	public void sacar(double valor) throws OperationAccountException {
		if (status = true) {
			if (saldo > 0)
			saldo -= valor;
		} else {
			throw new OperationAccountException("Conta inativa ou com saldo insuficiente, tente novamente.");
		} 
	}

	@Override
	public void depositar(double valor) throws OperationAccountException {
		if (status = true) {
			saldo += valor;
		} else {
			throw new OperationAccountException("Não foi possivel depositar, tente novamente.");
		}
	}

	@Override
	public void transferir(double valor, Conta contaDestino) throws OperationAccountException {
		if (status = true && valor > 0) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		} else {
			throw new OperationAccountException("Conta inativa ou valor invalido, tente novamente.");
		}
	}
	
	protected void imprimirInfosComuns() {
		System.out.println("==========================================");
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println("==========================================");
	}

	
}
