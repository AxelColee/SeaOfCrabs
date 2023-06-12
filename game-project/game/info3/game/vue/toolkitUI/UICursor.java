package info3.game.vue.toolkitUI;

import java.awt.Color;
import java.awt.Graphics;

import java.lang.Math;

public class UICursor extends UIComponent{
	private int value;
	private int sizeCursor;
	private Color colorBar;
	private Color colorCursor;
	

	public UICursor(int x, int y, int h, int w, Color cBar, Color cCursor) {
		super(x, y, h, w);
		this.value = 0;
		this.colorBar = cBar;
		this.colorCursor = cCursor;
		
		// Le Curseur est un carré 20% plus grand que la barre sur laquelle il se balade
		//int min = java.lang.Math.min(h, w);
		this.sizeCursor = java.lang.Math.min(h, w); //(int)(min + 0.2*min);
	}
	
	public Color getColorCursor() {
		return colorCursor;
	}

	public void setColorCursor(Color colorCursor) {
		this.colorCursor = colorCursor;
	}

	public void move(int x, int y) {
		if (getWidth() > getHeight()) {
			if (x>=getPositionX() && x<=getPositionX()+getWidth()-sizeCursor) {
				this.value = x;
			}
		}
		if (getWidth() < getHeight()) {
			if (y>=getPositionY() && y<=getPositionY()+getHeight()-sizeCursor) {
				this.value = y;
			}
		}
		System.out.println("CHECK");
	}

	@Override
	public void paint(Graphics g) {
		int X = getPositionX(), Y = getPositionY();
		
		g.setColor(this.colorBar);
		g.fillRect(X, Y, getWidth(), getHeight());
		
		g.setColor(this.colorCursor);
		
		// Gère l'affichage du curseur peu importe si le Component est horizontal ou vertical.
		if (getWidth() < getHeight()) {
			Y = java.lang.Math.max(this.value, getPositionY()); //getHeight() * this.value + getPositionY();
		}
		else {
			X = java.lang.Math.max(this.value, getPositionX());//(getWidth() * this.value)/100 + getPositionX();
		}
		
		
		g.fillRect(X, Y, this.sizeCursor, this.sizeCursor);
	}
}
