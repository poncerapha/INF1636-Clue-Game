package model;

public class Jogador {
	int eliminado = 0, suspeito = -1, qtdCartasJog, cartasJog[];
	String nome;
	
	public Jogador(String nome, int suspeito, int qtdCartasJog, int [] cartasJog) {
		this.nome = nome;
		this.suspeito = suspeito;
		this.qtdCartasJog = qtdCartasJog;
		this.cartasJog = cartasJog;
	}
	
	public String retName() {
		return nome;
	}
	
	public int retPersonagem() {
		return suspeito;
	}
	
	public int qtdCartas() {
		return qtdCartasJog;
	}
	
	public int[] retCartasDoJog() {
		return cartasJog;
	}
}
