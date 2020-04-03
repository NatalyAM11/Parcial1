package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {
	private Controller controller;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");
	}
	
	public void settings() {
		size(600,600);
	}
	
	public void setup () {
		controller = new Controller(this);
		controller.addList();
		controller.cargarFotos();
	}
	
	public void draw() {
		background(0);
		for (int i = 0; i < controller.contenidos().size(); i++) {
			controller.contenidos().get(i).pintar((25 * i)+ 230);
		}
		
		//instrucciones
		
		fill(255,0,0);
		text("Instrucciones",50,100);
		fill(255);
		text("Para organizar la lista por los ratings, de click en cualquier lugar",50,120);
	
		text("Si deseas organizar la lista por el nombre, presione la tecla n",50,135);
		
		text("Si desea organizar la lista por su tipo serie o pelicula, presione la tecla t",50,150);
	
		text("Si desea organizar la lista por su año, presione la letra a",50,165);
		
		controller.Fotos();

		
	}
	
	
	public void mousePressed() {
	
    //metodo que organiza de manera natural los datos
	controller.cargoAtributos(0);

}
	
	public void keyPressed() {
		controller.sortList(key);
	}

}
