package Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// Propiedades principales de la ventana principal
		Main ventanaPrincipal = new Main();
		ventanaPrincipal.setVisible(true);
		ventanaPrincipal.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventanaPrincipal.setSize(800, 600);
		ventanaPrincipal.setTitle("ZooYarzabal");

	}
	
	// Aquí ya empezamos a construir
	public Main() {
		JPanel panelImagen = new JPanel();
		panelImagen.setBackground(Color.BLUE); // Hasta que pongamos la imagen lo dejamos así
		add(panelImagen, BorderLayout.CENTER);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new FlowLayout());
		// Aquí creamos el botón de trabajador y usuario
		JButton botonTrabajador = new JButton("Soy trabajador");
		
		//ActionListener para abrir ventana de trabajador
		botonTrabajador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaTrabajador ventanaTrabajador = new VentanaTrabajador();
				ventanaTrabajador.setVisible(true);
			}
		});
		panelBotones.add(botonTrabajador);
		
		
		JButton botonVisitante = new JButton("Soy visitante");
		//ActionListener para abrir ventana de visitante
		botonTrabajador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaVisitante ventanaVisitante = new VentanaVisitante();
				ventanaVisitante.setVisible(true);
			}
		});
		panelBotones.add(botonVisitante);
		
		add(panelBotones, BorderLayout.SOUTH);
	}

}
