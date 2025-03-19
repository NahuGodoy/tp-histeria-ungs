package tp_histeria;

import java.util.Random;

public class Presentador {
	private Celda[][] grilla;

	public Presentador(int filas, int columnas) {
		
		this.grilla = new Celda[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				grilla[i][j] = new Celda(i, j);
			}
		}
	}
	
	private ColordeCelda colorRandom () {
		Random rand = new Random();
		ColordeCelda[] colores = ColordeCelda.values();
		return colores[rand.nextInt(colores.length)];
	}
	
	public void cambiarColor (int x, int y) {
		ColordeCelda nuevoColor = colorRandom ();
		grilla[x][y].setColor(nuevoColor);
	}
	
	public ColordeCelda getColor(int x, int y) {
	    return grilla[x][y].getColor();
	}
	
    public java.awt.Color colorAwt(ColordeCelda color) {
    	if (color == null) {
    		return java.awt.Color.GRAY;
    	}
        switch (color) {
            case RED:
                return java.awt.Color.RED;
            case BLUE:
                return java.awt.Color.BLUE;
            case GREEN:
                return java.awt.Color.GREEN;
            case YELLOW:
                return java.awt.Color.YELLOW;
            case ORANGE:
                return java.awt.Color.ORANGE;
            case MAGENTA:
                return java.awt.Color.MAGENTA;
            default:
                return java.awt.Color.GRAY;
        }
    }
	
}
