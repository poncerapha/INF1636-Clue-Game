package model;

import java.util.Random;

public class Jogo {
	Random random = new Random();
	int qtd, dado[] = new int[2], solucao[] = new int[3], ind = 0, cartasJog[] = {-1,-1,-1,-1,-1,-1,-1};
	Jogador jog[];
	String jogadores[] = null;
	Tabuleiro tabuleiro;
	private String suspeitos[] = {"Srta. Scarlet", "Coronel Mustard", "Professor Plum", "Reverendo Green", "Sra. White", "Sra. Peacock"};
    private String armas[] = {"Corda", "Cano de Chumbo", "Faca", "Chave Inglesa", "Castical", "Revolver"}; 
	private String comodos[] = {"Banheiro", "Escritorio", "Sala de Estar", "Sala de jogos", "Garagem", "Quarto", "Sala de Estudos", "Cozinha", "Patio"};
	private String envelope[] = new String[3];
	
	public Jogo(int qtd, String[] jogadores, int[] suspeito) {
		this.qtd = qtd;
		jog = new Jogador[qtd];
		tabuleiro = new Tabuleiro();
		for(int i = 0; i <qtd ; i++) {
			jog[i] = new Jogador(jogadores[i], suspeito[i]);
		}
		/*De 1 a 6 sao os suspeitos, 7 a 12 sao as armas, 13 a 21 sao os locais*/
		solucao[0] = random.nextInt(6) + 1;
		solucao[1] = random.nextInt(6) + 7;
		solucao[2] = random.nextInt(6) + 16;
		
	}
	
	public void trocarVez() {
		ind = (ind+1)%qtd;
	}
	
	public boolean ganhou(int[] acusacao) {
		if((acusacao[0] == solucao[0]) && (acusacao[1] == solucao[1]) && (acusacao[2] == solucao[2])) {
			return true;
		}
		return false;
	}

	private void criaEnvelope() {
		Random r = new Random();
    
    	envelope[0] = suspeitos[r.nextInt(0, 6)];
    	envelope[1] = armas[r.nextInt(0, 6)]; 
    	envelope[2] = comodos[r.nextInt(0, 9)];
	}

}
