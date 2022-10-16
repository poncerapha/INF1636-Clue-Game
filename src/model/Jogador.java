package model;

public class Jogador {
	int eliminado = 0, suspeito = -1;
	String nome;
	
	public Jogador(String nome, int suspeito) {
		this.nome = nome;
		this.suspeito = suspeito;
	}
}
