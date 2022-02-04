package com.dio.bootcamp.project;

public interface IConta {

	void sacar(double valor) throws OperationAccountException;
	
	void depositar(double valor) throws OperationAccountException;
	
	void transferir(double valor, Conta contaDestino) throws OperationAccountException;
	
	void imprimirExtrato() throws OperationAccountException;
	
	void pagarMensalidade() throws OperationAccountException;

}
