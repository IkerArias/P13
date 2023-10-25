package Ventanas;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class VentanaTaquillero extends JFrame {
	
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
