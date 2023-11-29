package Ventanas;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import Zoo.Visistante;
import Zoo.ZOO;

public class VentanaTaquillero extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public ZOO zoo;
	
	// Método obtener precio de la entrada del visitante
	public int precioEntrada() {
		int precio = (int) 19.99;
		Visistante v = new Visistante();
		int precioFinal = precio - v.obtenerDscuento()*precio;
		return precioFinal;
		
	}

	public VentanaTaquillero() {
		
		setTitle("Ventana del Taquillero");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaTaquillero();
            }
        });

}
}
