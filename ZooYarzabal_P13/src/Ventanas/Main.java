package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {
	
	private JFrame ventana;
	
	public Main() {
		
		// Crear una ventana principal
        ventana = new JFrame("Ventana Principal");
        ventana.setBounds(500, 300, 700, 250);
        
		// Crear una ventana principall
        ventana = new JFrame("Ventana Principal");
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lblTitulo = new JLabel("ZOOYARZABAL");
        //Panel para los botones
        JPanel pnlBotones = new JPanel();
        JPanel pnlNorte = new JPanel();
        
        pnlNorte.add(lblTitulo);
        ventana.add(pnlNorte, BorderLayout.NORTH);

        // Botones para seleccionar si eres trabajador o visitante
        JButton btnTrabajador = new JButton("Soy Trabajador");
        // ActionListener para el botón de trabajador
        btnTrabajador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.dispose(); // Cerrar la ventana principal
                new VentanaTrabajador(ventana); // Abrir la ventana de trabajadores
            }
        });
        
        JButton btnVisitante = new JButton("Soy Visitante");
        // ActionListener para el botón de visitante
        btnVisitante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.dispose(); // Cerrar la ventana principal
                new VentanaVisitante(ventana); // Abrir la ventana de visitantes
            }
        });
        
        JButton btnSalir = new JButton("SALIR");
        btnSalir.addActionListener((e)->{
        	System.exit(0);
        });
        pnlBotones.add(btnSalir);
        pnlBotones.add(btnTrabajador);
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
