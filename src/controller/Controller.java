package controller;

import java.util.LinkedList;

import model.Netflix;
import model.Logic;
import processing.core.PApplet;

public class Controller{
	
	private Logic logic;
	private PApplet app;
	
	public Controller(PApplet app) {
		this.app = app;
		logic= new Logic(app);
		
	}


	public void cargoAtributos(int n) {
		logic.cargoAtributos(n);
		
	}

	public void addList() {
		logic.addList();
		
	} 

	public void sortList (char c) {
		logic.sortList(c);
	}
	
	public LinkedList<Netflix> contenidos() {
		return logic.getContenidos();
	}
	
	public void cargarFotos() {
		logic.cargarFotos();
	}


	public void Fotos() {
		logic.fotos();
		
	}
	}


