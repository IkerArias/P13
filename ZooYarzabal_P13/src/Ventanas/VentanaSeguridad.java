package Ventanas;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class VentanaSeguridad extends JFrame {
	
	public VentanaSeguridad() {
		
		setTitle("Ventana de Seguridad");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
		
	}
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaSeguridad();
            }
        });

}

}
