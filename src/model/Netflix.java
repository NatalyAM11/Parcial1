package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Netflix implements Comparable <Netflix>{
	
	private String nombre, tipo;
	private int  rating;
	PApplet app ;
	private int posX,posY;
	private String año;
	PImage breakinbad,dark,mindhunter,ozark,starttrek,strangerthings,theirishman;

	
	public Netflix (String nombre,String año, int rating, String tipo,PApplet app) {
		this.app=app;
		this.nombre=nombre;
		this.año= año;
		this.rating=rating;
		this.tipo=tipo;
		this.posX=250;
		breakinbad=app.loadImage("img/breakingbad.png");
		
	}
	
	public void pintar(int posY) {
		
		//Creo los textos
			app.noStroke();
			app.fill(255);
			app.ellipse(25,posY+10,25,25);
			app.fill(255,0,0);
			app.text(nombre, posX,posY+8);
			app.fill(255);
			app.text(año, posX +100 , posY+8);
			app.fill(255,0,0);
			app.text(rating+"%",posX+100*2, posY+8);
			app.fill(255);
			app.text(tipo, posX+100*3, posY+8);
		
			
		}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
	
	
	@Override
	public int compareTo(Netflix o1) {
		return this.getRating()-o1.getRating();
	}
	
	

}
