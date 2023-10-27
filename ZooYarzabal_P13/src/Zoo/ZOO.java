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

public ZOO(ArrayList<Animal> animales, ArrayList<Trabajador> trabajadores, ArrayList<Visistante> visitantes) {

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


}
