package Zoo;

import java.util.ArrayList;

public class ZOO {
	
	protected ArrayList<Animal> animales;
	protected ArrayList<Trabajador> trabajadores;
	protected ArrayList<Visistante> visitantes;
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
	public ArrayList<Visistante> getVisitantes() {
		return visitantes;
	}
	public void setVisitantes(ArrayList<Visistante> visitantes) {
		this.visitantes = visitantes;
	}
	
	// Para probar las asignaciones en la VentanaVeterinario
	public void anyadirAnimalesYVeterinarios() {
		animales.add(new Animal("agote", 173, Genero.FEMENINO, 33, new Trabajador(), "kdajfkdj", false, false));
		
		trabajadores.add(new Trabajador(3, "akd", "ds", 2, 2, Puesto.VETERINARIO, 333, "dk"));
	}

}
