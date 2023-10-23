package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaVisitante extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public VentanaVisitante() {
		
		JPanel panelBotones = new JPanel();
		
		panelBotones.setLayout(new FlowLayout());
		
		JButton botonMapa = new JButton("Mapa");
		JButton botonEventos = new JButton("Eventos");
		JButton botonAnimales = new JButton("Informacion sobre animales");
		
		panelBotones.add(botonAnimales);
		panelBotones.add(botonEventos);
		panelBotones.add(botonMapa);
		
		add(panelBotones, BorderLayout.SOUTH);
	}
		
	}
