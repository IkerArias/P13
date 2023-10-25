package Ventanas;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class VentanaAdministrador extends JFrame{
	
	public VentanaAdministrador() {
		
		setTitle("Ventana del Administrador");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
	}
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaAdministrador();
            }
        });

}

}
