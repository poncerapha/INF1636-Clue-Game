package Model;

public class Movimento {
	int qtdMov = 0, listMov[][] = new int [144][2];
	Tabuleiro tab;
	
	public Movimento(Tabuleiro tab) {
		this.tab = tab;
	}
	
	void listaDeMov(int posX, int posY, int somaDados, int jaVisitados) {
		int tipo = tab.retTipoCasa(posX, posY);
		if(tipo == -1) {
			return;
		}
		else if (somaDados == 0 && tipo != -1) {
			if(tipo == 2 || (tipo == 1 && tab.retOcupado(posX, posY) == 0)) {
				listMov[qtdMov][0] = posX;
				listMov[qtdMov][1] = posY;
				jaVisitados++;
			}
			return;
		}
		else if (somaDados > 0) {
			int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
			if(jaVisitados > 0) {
				for(int i = 0; i<jaVisitados; i++) {
					if(listMov[i][0] == posX+1 && (listMov[i][1] == posY)) {
						cont1 = 1;
					}
					if(listMov[i][0] == posX-1 && (listMov[i][1] == posY)) {
						cont2 = 1;
					}
					if(listMov[i][0] == posX && (listMov[i][1] == posY+1)) {
						cont3 = 1;
					}
					if(listMov[i][0] == posX && (listMov[i][1] == posY-1)) {
						cont4 = 1;
					}
				}
			}
			if(cont1 == 0) {
				jaVisitados++;
				listaDeMov(posX+1, posY, somaDados-1, jaVisitados);
			}
			if(cont2 == 0) {
				jaVisitados++;
				listaDeMov(posX-1, posY, somaDados-1, jaVisitados);
			}
			if(cont3 == 0) {
				jaVisitados++;
				listaDeMov(posX, posY+1, somaDados-1, jaVisitados);
			}
			if(cont4 == 0) {
				jaVisitados++;
				listaDeMov(posX, posY-1, somaDados-1, jaVisitados);
			}
		}
		return; 
	}
	
	int [][] retListMov(int posX, int posY, int somaDados, Tabuleiro tab)
	{
		this.tab = tab;
		listaDeMov(posX, posY, somaDados, 0);
		return listMov;
	}
	
}
