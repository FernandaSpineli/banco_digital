package com.dio.bootcamp.project;

public class Cliente {
	private String nome;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) throws OperationAccountException{
		if (idade >= 18) {
			this.idade = idade;
		} else {
			throw new OperationAccountException("Necessário ter 18 anos ou mais para abrir conta.");
		}
	}
}
