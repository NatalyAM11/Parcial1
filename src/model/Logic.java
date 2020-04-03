package model;

import java.util.Collections;
import java.util.LinkedList;
import processing.core.PApplet;
import processing.core.PImage;

	public class Logic {
		private PApplet app;
		private LinkedList<Netflix> contenido;
		private String[] Info;
		private String[] infoUnoSplited;
		private String nombre, tipo;
		private String año;
		private int rating;
		private NombreNetflix nombreNetflix;
		private AñoNetflix añoNetflix;
		private TipoNetflix tipoNetflix;
		PImage breakinbad,dark,mindhunter,ozark,starttrek,strangerthings,theirishman;
		
		
		public Logic(PApplet app) {

			this.app = app;
			contenido= new LinkedList<Netflix>();

			//cargo los txt
			Info = app.loadStrings("data/netflix.txt");
			nombreNetflix= new NombreNetflix();
			añoNetflix= new AñoNetflix ();
			tipoNetflix= new TipoNetflix ();
			breakinbad=app.loadImage("img/breakingbad.png");
		}

		public void addList() {
			
			//primer txt
			for (int i = 0; i < Info.length; i++) {
				infoUnoSplited = Info[i].split(",");
				nombre = infoUnoSplited[0];
				año = infoUnoSplited[1];
				rating = Integer.parseInt(infoUnoSplited[2]);
				tipo= infoUnoSplited[3];

				
				
				contenido.add(new Netflix (nombre,año,rating,tipo,app));

			}
		}
	

		public void cargoAtributos(int n) {

			switch (n) {

			case 0:
				//llamo a la clase collections
				Collections.sort(contenido);

				for (int i = 0; i < contenido.size(); i++) {

					//String id = Integer.toString(contenido.get(i).getId());
					String nombre = contenido.get(i).getNombre();
					String año= contenido.get(i).getAño();
					String rating= Integer.toString(contenido.get(i).getRating());
					String tipo = contenido.get(i).getTipo();
					
					
				}

			}

		}
		
		
	public void sortList (char c) {
			
		//Ordenamiento parcial
			switch (c) {
			case 'n': Collections.sort(contenido,nombreNetflix);
			break;
			case 'a': Collections.sort (contenido,añoNetflix);
			break;
			case 't': Collections.sort(contenido,tipoNetflix);
			break;
			
			}
		}

		
		
	public LinkedList<Netflix> getContenidos() {
		return contenido;
	}

	public void setPeludos(LinkedList<Netflix> contenidos) {
		this.contenido = contenidos;
	}
	
	
	public void cargarFotos() {
		breakinbad= app.loadImage("img/breakingbad.jpg");
	}
	
	
	
public void fotos() {
	for (int i = 0; i < Info.length; i++) {
		infoUnoSplited = Info[i].split(",");
		
		
		//pongo las imagenes
		for (int j = 0; j < contenido.size(); j++) {
		if(infoUnoSplited[0].contentEquals("Breking Bad")) {
			app.image(breakinbad,25,contenido.get(j).getPosY()+10,50,50);
	}
	}
	}

}
}