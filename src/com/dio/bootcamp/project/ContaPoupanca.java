package com.dio.bootcamp.project;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("*** EXTRATO CONTA POUPANÇA ***");
		super.imprimirInfosComuns();
	}

	@Override
	public void pagarMensalidade() throws OperationAccountException{
		int mensalidade = 30;
		if(status = true && saldo > 0) {
			this.sacar(mensalidade);
			System.out.println("Pagamento efetuado com sucesso!");
		}else {
			throw new OperationAccountException("Saldo insuficiente.");
		}
	}
}
