package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaTrabajador extends JFrame {
	
	public VentanaTrabajador() {
	
	JPanel panelBotones = new JPanel();
	panelBotones.setLayout(new FlowLayout());
	
	JButton botonVeterinario = new JButton("Venterinario");
	JButton botonGuia = new JButton("Guia");
	JButton botonAdministrador = new JButton("Administrador");
	JButton botonDiseñador = new JButton("Diseñador de eventos");
	JButton botonTaquillero = new JButton("Taquillero");
	
	panelBotones.add(botonTaquillero);
	panelBotones.add(botonDiseñador);
	panelBotones.add(botonAdministrador);
	panelBotones.add(botonGuia);
	panelBotones.add(botonVeterinario);
	
	add(panelBotones, BorderLayout.SOUTH);
	
	
	}
	

}
