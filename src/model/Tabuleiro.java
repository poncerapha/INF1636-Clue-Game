package Model;

public class Tabuleiro {
	Campos casas[][];
	
	public Tabuleiro() {
		casas = new Campos[25][24];
		criar_campos();
		
	}
	
	void criar_campos(){
		int i, y;
		
		for(y=0; y<24;y++) {
			casas[0][y].mudaTipo(-1);
			casas[24][y].mudaTipo(-1);
		}
		for(i=0; i<25;i++) {
			casas[i][0].mudaTipo(-1);
			casas[i][23].mudaTipo(-1);
		}
		for(i=1; i<7;i++) {
			for(y=0; y<6;y++) {
				casas[i][y].mudaTipo(-1);
			}
		}
		for(i=2; i<8;i++) {
			for(y=8; y<16;y++) {
				casas[i][y].mudaTipo(-1);
			}
		}
		for(i=1; i<6;i++) {
			for(y=18; y<24;y++) {
				casas[i][y].mudaTipo(-1);
			}
		}
		for(y=0; y<5;y++) {
			casas[9][y].mudaTipo(-1);
		}
		for(i=10; i<17;i++) {
			for(y=10; y<15;y++) {
				casas[i][y].mudaTipo(-1);
			}
		}
		for(i=8; i<13;i++) {
			for(y=18; y<24;y++) {
				casas[i][y].mudaTipo(-1);
			}
		}
		for(i=15; i<18;y++) {
			casas[i][17].mudaTipo(-1);
		}
		for(i=14; i<19;i++) {
			for(y=18; y<24;y++) {
				casas[i][y].mudaTipo(-1);
			}
		}
		for(i=21; i<25;i++) {
			for(y=17; y<24;y++) {
				casas[i][y].mudaTipo(-1);
			}
		}
		
		for(i=18; i<25;i++) {
			for(y=9; y<15;y++) {
				casas[i][y].mudaTipo(-1);
			}
		}
		for(i=19; i<25;i++) {
			for(y=0; y<7;y++) {
				casas[i][y].mudaTipo(-1);
			}
		}
		
		casas[1][6].mudaTipo(-1);
		casas[1][17].mudaTipo(-1);
		
		casas[5][18].mudaTipo(0);
		
		casas[0][9].mudaTipo(1);
		casas[0][14].mudaTipo(1);
		casas[6][23].mudaTipo(1);
		casas[19][23].mudaTipo(1);
		casas[17][0].mudaTipo(1);
		casas[24][7].mudaTipo(1);
		/*Cozinha*/
		casas[6][4].mudaTipo(2);
		/*Sala de Musica*/
		casas[5][8].mudaTipo(2);
		casas[7][9].mudaTipo(2);
		casas[5][15].mudaTipo(2);
		casas[7][14].mudaTipo(2);
		/*Jardim de Inverno*/
		casas[5][19].mudaTipo(2);
		/*Sala de Jantar*/
		casas[12][7].mudaTipo(2);
		casas[15][6].mudaTipo(2);
		/*Salao de Jogos*/
		casas[9][18].mudaTipo(2);
		casas[12][22].mudaTipo(2);
		/*Biblioteca*/
		casas[16][17].mudaTipo(2);
		/*Sala de Estar*/
		casas[19][6].mudaTipo(2);
		/*Entrada*/
		casas[18][11].mudaTipo(2);
		casas[18][12].mudaTipo(2);
		casas[20][14].mudaTipo(2);
		/*Escritorio*/
		casas[21][17].mudaTipo(2);
	}
	
	int retTipoCasa(int posX, int posY) {
		return casas[posX][posY].retTipo();
	}
	
	int retOcupado(int posX, int posY) {
		return casas[posX][posY].retOcupado();
	}
}
