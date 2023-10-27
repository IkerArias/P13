package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;

import Zoo.Animal;
import Zoo.AsignacionVet_Ani;
import Zoo.Puesto;
import Zoo.Trabajador;
import Zoo.ZOO;

public class VentanaVeterinario extends JFrame {

/**
*
*/
		private static final long serialVersionUID = 1L;
		
		// Algunos Componentes
		protected ZOO zoo;
		protected JButton botonAsignar;
		protected JTextArea textoAsignaciones;
		protected JComboBox<Trabajador> comboVeterinarios;
		protected JComboBox<Animal> comboAnimalesEnfermos;
		protected JComboBox<AsignacionVet_Ani> comboHistorialDeAsignaciones;
		
		public VentanaVeterinario() {
			this.zoo = new ZOO();
			
			// Atributos principales de la ventana
			setTitle("Ventana de Veterinario");
			setLocationRelativeTo(null);
			setSize(400, 300);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setLayout(new GridLayout(4, 1));
			
			JPanel panelMensaje = new JPanel();
			JLabel labelMensaje = new JLabel("Regular asignaciones de animales enfermos a cada veterinario");
			panelMensaje.add(labelMensaje);
			
			// Panel donde irán los comboBoxes
			JPanel panelCombos = new JPanel();
			panelCombos.setLayout(new GridLayout(1,2));
			
			// Ejecutamos las funciones de antes
			
			comboAnimalesEnfermos = new JComboBox<Animal>();
			panelCombos.add(comboAnimalesEnfermos, BorderLayout.WEST);
			Border bordeAnimalesEnfermos = BorderFactory.createTitledBorder("Animales enfermos: ");
			comboAnimalesEnfermos.setBorder(bordeAnimalesEnfermos);
			
			for(Animal a : this.zoo.getAnimales()) {
			if(a.isEnfermo() == true) {
			comboAnimalesEnfermos.addItem(a);
			}
			}
			
			comboVeterinarios = new JComboBox<Trabajador>();
			panelCombos.add(comboVeterinarios, BorderLayout.CENTER);
			Border bordeVeterinarios = BorderFactory.createTitledBorder("Veterinarios disponibles: ");
			comboVeterinarios.setBorder(bordeVeterinarios);
			
			for(Trabajador t : this.zoo.getTrabajadores()) {
			if(t.getPuesto().equals(Puesto.VETERINARIO)) {
			comboVeterinarios.addItem(t);
			}
			}
			
			// comboHistorialDeAsignaciones = new JComboBox<AsignacionVet_Ani>();
			// panelCombos.add(comboHistorialDeAsignaciones, BorderLayout.EAST);
			// Border bordeAsignaciones = BorderFactory.createTitledBorder("Historial de asignaciones: ");
			// comboHistorialDeAsignaciones.setBorder(bordeAsignaciones);
			
			
			
			// Parte del textArea
			JPanel panelTexto = new JPanel();
			textoAsignaciones = new JTextArea(10, 30);
			textoAsignaciones.setLineWrap(true);
			textoAsignaciones.setWrapStyleWord(true);
			JScrollPane paneTexto = new JScrollPane(textoAsignaciones);
			
			
			// Panel donde irán los botones
			botonAsignar = new JButton("Asignar veterinario");
			botonAsignar.addActionListener(new ActionListener() {
			// Elegiremos un veterinario y a un animal para realizar la asignación
			@Override
			public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Trabajador veterinario = (Trabajador) comboVeterinarios.getSelectedItem();
			Animal animalEnfermo = (Animal) comboAnimalesEnfermos.getSelectedItem();
			
			AsignacionVet_Ani nuevaAsignacion = new AsignacionVet_Ani();
			// Añadimos los elementos pertenecientes a la asignación
			// y los eliminamos de sus ComboBox respectivos
			nuevaAsignacion.setAnimal(animalEnfermo);
			comboAnimalesEnfermos.removeItem(animalEnfermo); // Retiramos el animal enfermo
			nuevaAsignacion.setTrabajador(veterinario);
			comboVeterinarios.removeItem(veterinario); // También retiraremos el veterinario temporalmente, hasta finalizar su trabajo
			nuevaAsignacion.setFecha(new Date());
			
			// Implementamos el hilo
			Thread hilo = new Thread() {
			public void run() {
			// Añadimos un poco de textito
			textoAsignaciones.append("Escogiendo veterinario para tratar al animal... \n");
			try {
			Thread.sleep(1000);
			}catch (InterruptedException e) { }
			textoAsignaciones.append("... \n");
			try {
			Thread.sleep(1000);
			}catch (InterruptedException e) {
			}
			textoAsignaciones.append("... \n");
			try {
			Thread.sleep(1000);
			}catch (InterruptedException e) {
			}
			textoAsignaciones.append(nuevaAsignacion.toString());
			try {
			Thread.sleep(1000);
			}catch (InterruptedException e) { }
			textoAsignaciones.append("... \n");
			try {
			Thread.sleep(1000);
			}catch (InterruptedException e) {
			}
			Random mesesRand = new Random();
			int numeroDeMesesAleatorio = mesesRand.nextInt(24) + 1;
			textoAsignaciones.append("El tratamiento durará " + numeroDeMesesAleatorio + "meses. \n");
			try {
			Thread.sleep(500);
			}catch (InterruptedException e) { }
			textoAsignaciones.append("... \n");
			textoAsignaciones.append("Tratando al animal... \n");
			try {
			Thread.sleep(500);
			}catch (InterruptedException e) { }
			textoAsignaciones.append("... \n");
			Random tiempoRecuperacionRandom = new Random();
			int tiempodeRecuperacionRandom = tiempoRecuperacionRandom.nextInt(10000) + 1;
			try {
			Thread.sleep(tiempodeRecuperacionRandom);
			}catch (InterruptedException e) { }
			textoAsignaciones.append("El animal " + animalEnfermo.getID() + "ha sido correctamente tratado por el veterinario " + veterinario.getDNI() +". \n");
			textoAsignaciones.append("... \n");
			comboVeterinarios.addItem(veterinario); // Ahora el veterinario estará nuevamente disponible
			
			// Añadimos la asignación al JComboBox de asignaciones pasadas
			comboHistorialDeAsignaciones.addItem(nuevaAsignacion);
			}
			
			};
			botonAsignar.setEnabled(false);
			hilo.start();
			
			}
			});
			botonAsignar.setEnabled(true);
			
			JButton botonSalir = new JButton("Salir");
			botonSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			dispose();
			}
			});
			
			JButton botonHistorial = new JButton("Historial");
			botonHistorial.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			}
			});
			
			JPanel panelBotones = new JPanel();
			panelBotones.add(botonAsignar);
			panelBotones.add(botonHistorial);
			panelBotones.add(botonSalir);
			
			add(panelMensaje);
			add(panelCombos);
			add(paneTexto);
			add(panelBotones);
			setVisible(true);
			}
			
			public static void main(String[] args) {
			VentanaVeterinario ventVet = new VentanaVeterinario();
			ventVet.setVisible(true);
}
}