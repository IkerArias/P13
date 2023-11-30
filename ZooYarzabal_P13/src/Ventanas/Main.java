package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {
	
	private JFrame ventana;
	
	public Main() {
		
		// Crear una ventana principall
        ventana = new JFrame("Ventana Principal";
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());
        
        
        //Panel para los botones
        JPanel pnlBotones = new JPanel();

        // Botones para seleccionar si eres trabajador o visitante
        JButton btnTrabajador = new JButton("Soy Trabajador");
        // ActionListener para el botón de trabajador
        btnTrabajador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.dispose(); // Cerrar la ventana principal
                new VentanaTrabajador(); // Abrir la ventana de trabajadores
            }
        });
        pnlBotones.add(btnTrabajador);
        
        JButton btnVisitante = new JButton("Soy Visitante");
        // ActionListener para el botón de visitante
        btnVisitante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.dispose(); // Cerrar la ventana principal
                new VentanaVisitante(); // Abrir la ventana de visitantes
            }
        });
        pnlBotones.add(btnVisitante);

        // Agregar botones a la ventana principal
        ventana.add(pnlBotones, BorderLayout.SOUTH);
        
        ventana.setVisible(true);
		
	}
	
	 public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new Main();
	            }
	        });

	
}
}
