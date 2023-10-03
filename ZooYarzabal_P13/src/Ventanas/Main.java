package Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class Main extends JFrame {

	public static void main(String[] args) {
		// Propiedades principales de la ventana principal
		Main ventanaPrincipal = new Main();
		ventanaPrincipal.setVisible(true);
		ventanaPrincipal.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventanaPrincipal.setSize(800, 600);
		ventanaPrincipal.setTitle("ZOOyarzabal");

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
		panelBotones.add(botonTrabajador);
		JButton botonVisitante = new JButton("Soy visitante");
		panelBotones.add(botonVisitante);
		add(panelBotones, BorderLayout.SOUTH);
	}

}
