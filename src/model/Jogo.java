package model;

import java.util.Random;

public class Jogo {
	Random random = new Random();
	int qtd, dado[] = new int[2], solucao[] = new int[3], ind = 0, qtdCartasJog[], cartasJog[][], i = 0, temp = 0;
	Jogador jog[];
	String jogadores[] = null;
	Tabuleiro tabuleiro;

	private String suspeitos[] = {"Srta. Scarlet", "Coronel Mustard", "Professor Plum", "Reverendo Green", "Sra. White", "Sra. Peacock"};
    	private String armas[] = {"Corda", "Cano de Chumbo", "Faca", "Chave Inglesa", "Castical", "Revolver"}; 
	private String comodos[] = {"Banheiro", "Escritorio", "Sala de Estar", "Sala de jogos", "Garagem", "Quarto", "Sala de Estudos", "Cozinha", "Patio"};
	private Envelope envelope;
	
	public Jogo(int qtd, String[] jogadores, int[] suspeito) {
		this.qtd = qtd;
		jog = new Jogador[qtd];
		tabuleiro = new Tabuleiro();
		criaEnvelope();
		qtdCartasJog = new int[qtd];
		int j = 0, trava = 0;
		for(i = 0; i <qtd ; i++) {
			qtdCartasJog[i] = 0;
		}
		
		if(qtd == 3 || qtd == 6) {
			cartasJog = new int[qtd][18/qtd];
		}
		if(qtd == 4) {
			cartasJog = new int[qtd][5];
			cartasJog[2][4] = -1;
			cartasJog[3][4] = -1;
		}
		if(qtd == 5) {
			cartasJog = new int[qtd][4];
			cartasJog[4][3] = -1;
			cartasJog[3][3] = -1;
		}
		
		while(j < 21) {
			if(j == solucao[0] || j == solucao[1] || j == solucao[2]) {
				j++;
			}
			else {
				trava = j;
				while(trava == j) {
					temp = random.nextInt(qtd);
					if((qtd == 3 || qtd == 6)&& qtdCartasJog[temp] < (18/qtd)) {
						cartasJog[temp][qtdCartasJog[temp]] = j;
						qtdCartasJog[temp]++;
						j++;
					}
					else if(qtd == 4) {
						if((temp == 0 || temp == 1) && qtdCartasJog[temp] < 5) {
							cartasJog[temp][qtdCartasJog[temp]] = j;
							qtdCartasJog[temp]++;
							j++;
						}
						if(temp != 0 && temp != 1 && qtdCartasJog[temp] < 4) {
							cartasJog[temp][qtdCartasJog[temp]] = j;
							qtdCartasJog[temp]++;
							j++;
						}
					}
					else if(qtd == 5) {
						if((temp == 0 || temp == 1 || temp == 2) && qtdCartasJog[temp] < 4) {
							cartasJog[temp][qtdCartasJog[temp]] = j;
							qtdCartasJog[temp]++;
							j++;
						}
						if(temp != 0 && temp != 1 && temp != 2 && qtdCartasJog[temp] < 3) {
							cartasJog[temp][qtdCartasJog[temp]] = j;
							qtdCartasJog[temp]++;
							j++;
						}
					}
				}		
			}
		}
		
		for(i = 0; i <qtd ; i++) {
			jog[i] = new Jogador(jogadores[i], suspeito[i], qtdCartasJog[i], cartasJog[i]);
		}
		
		
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
		/*De 0 a 5 sao os suspeitos, 6 a 11 sao as armas, 12 a 20 sao os locais*/
		solucao[0] = r.nextInt(6);
		solucao[1] = r.nextInt(6) + 6;
		solucao[2] = r.nextInt(6) + 12;
		var assasino = suspeitos[solucao[0]];
		var arma = armas[solucao[1]];
		var lugar = comodos[solucao[2]];
    
    		envelope.setAssasino(assasino);
		envelope.setArma(arma);
		envelope.setLugar(lugar); 
	}

	public int[] jogarDados(){
		dado[0] = random.nextInt(6) + 1;
		dado[1] = random.nextInt(6) + 1;
		return dado;
    	}

}
