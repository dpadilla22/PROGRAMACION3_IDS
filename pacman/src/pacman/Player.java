package pacman;


public class Player  {
	int x;
	int y;
	int w;
	int h;
	String color;

	public Player() {

	}

	public Player(int x, int y, int w, int h, String color) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

	public boolean tocado(Player jugador, Player obstaculo) {
	    if (jugador.getX() + jugador.getW() >= obstaculo.getX()
	            && jugador.getX() <= obstaculo.getX() + obstaculo.getW()
	            && jugador.getY() + jugador.getH() >= obstaculo.getY()
	            && jugador.getY() <= obstaculo.getY() + obstaculo.getH()) {
	        return true; 
	    }
	    return false; 
	}
}
