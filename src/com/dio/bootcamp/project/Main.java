package com.dio.bootcamp.project;

public class Main {
	public static void main(String[] args) throws OperationAccountException {
		Cliente cliente = new Cliente();
		cliente.setIdade(18);
		cliente.setNome("Nanda");
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
