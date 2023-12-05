package Zoo;

import java.util.ArrayList;

public class ZOO {


protected ArrayList<Animal> animales;

protected ArrayList<Trabajador> trabajadores;

protected ArrayList<Visitante> visitantes;

public ArrayList<Animal> getAnimales() {

	return animales;

}

public void setAnimales(ArrayList<Animal> animales) {

this.animales = animales;

}

public ArrayList<Trabajador> getTrabajadores() {

	return trabajadores;

}

public void setTrabajadores(ArrayList<Trabajador> trabajadores) {

	this.trabajadores = trabajadores;

}

public ArrayList<Visitante> getVisitantes() {

	return visitantes;

}

public void setVisitantes(ArrayList<Visitante> visitantes) {

	this.visitantes = visitantes;

}

public ZOO(ArrayList<Animal> animales, ArrayList<Trabajador> trabajadores, ArrayList<Visitante> visitantes) {

	super();

	this.animales = animales;

	this.trabajadores = trabajadores;

	this.visitantes = visitantes;

}

public ZOO() {

	super();

	this.animales = new ArrayList<>();

	this.trabajadores = new ArrayList<>();

	this.visitantes = new ArrayList<>();

}

public void anyadirObjectos() {
	// Dos animales
	animales.add(new Animal("Gorila", 3, Genero.FEMENINO, 3, new Trabajador(), "akdfjkasj", false, true));
	animales.add(new Animal("Flamenco", 23, Genero.MASCULINO, 3, new Trabajador(), "akdfjkasj", true, true));
	
	/*
	 * // Dos trabajadores
	trabajadores.add(new Trabajador(32, "Jon Brown", "Atela", 2, 39, Puesto.VETERINARIO, 233838, "jon@gmail.com"));
	trabajadores.add(new Trabajador(2, "fdsjkldkjñl", "dkjlfkj", 36, 2, Puesto.ADMINISTRADOR, 3, "jfkdjf"));
	
	// Dos visitantes
	visitantes.add(new Visitante("dk", 2, 3, 3, "akdjfs"));
	visitantes.add(new Visitante("djdfjkf", 2, 33, 22, "kadjf"));
	 */
}

}
