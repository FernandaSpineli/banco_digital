package com.dio.bootcamp.project;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}


	@Override
	public void imprimirExtrato() {
		System.out.println("*** EXTRATO CONTA CORRENTE ***");
		super.imprimirInfosComuns();
	}
	
	@Override
	public void pagarMensalidade() throws OperationAccountException{
		int mensalidade = 85;
		if(status = true && saldo > 0) {
			this.sacar(mensalidade);
			System.out.println("Pagamento efetuado com sucesso!");
		}else {
			throw new OperationAccountException("Saldo insuficiente.");
		}
	}
}
