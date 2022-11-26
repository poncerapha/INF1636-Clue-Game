package Model;

public class Campos {
	int tipo, ocupado;
	int pixel[] = new int[2];
	
	public Campos() {
		/*tipo -1 Invalido, 0 casa normal, 1 casa inicio, 2 algum ambiente */
		tipo = 0;
		ocupado = 0;
		pixel[0] = 0;
		pixel[1] = 0;
	}
	
	void alteraPixel(int pixelX, int pixelY) {
		this.pixel[0] = pixelX;
		this.pixel[1] = pixelY;
	}
	
	int[] retPixel() {
		return pixel;
	}
	
	void mudaTipo(int tipo) {
		this.tipo = tipo;
	}
	
	int retTipo() {
		return tipo;
	}
	
	void mudaOcupado(int ocupado) {
		this.ocupado = ocupado;
	}
	
	int retOcupado() {
		return ocupado;
	}
}
