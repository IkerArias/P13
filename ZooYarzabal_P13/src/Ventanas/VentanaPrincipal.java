package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import Zoo.Visitante;

public class VentanaPrincipal {
	
	private JFrame ventana;
	private ArrayList<Visitante> visitantes;
	
	public VentanaPrincipal() {
		
		this.visitantes = new ArrayList<>();
		
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
	                new VentanaPrincipal();
	            }
	 });

	 
	
}

	public ArrayList<Visitante> getVisitantes() {
		// Por aquí vamos a empezar a crear unos visitantes:
		 visitantes = new ArrayList<Visitante>();
		 Visitante visitante1 = new Visitante("Juan Perez", "123456789", 25, 3, "juan@gmail.com", "clave123");
		 visitantes.add(visitante1);
	     Visitante visitante2 = new Visitante("Maria Gomez", "987654321", 30, 5, "maria@gmail.com", "pass456");
	     visitantes.add(visitante2);
	     Visitante visitante3 = new Visitante("Carlos Rodriguez", "555555555", 22, 1, "carlos@gmail.com", "qwerty");
	     visitantes.add(visitante3);
	     Visitante visitante4 = new Visitante("Ana Sanchez", "111122223", 28, 2, "ana@gmail.com", "abcd");
	     visitantes.add(visitante4);
	     Visitante visitante5 = new Visitante("Luis Torres", "999988887", 35, 4, "luis@gmail.com", "p@ssword");
	     visitantes.add(visitante5);
	     Visitante visitante6 = new Visitante("Laura Fernandez", "666677778", 31, 6, "laura@gmail.com", "securePass");
	     visitantes.add(visitante6);
	     Visitante visitante7 = new Visitante("Pedro Martinez", "444455556", 27, 7, "pedro@gmail.com", "peter123");
	     visitantes.add(visitante7);
	     Visitante visitante8 = new Visitante("Elena Castro", "888877776", 26, 8, "elena@gmail.com", "elenaPass");
	     visitantes.add(visitante8);
	     Visitante visitante9 = new Visitante("Diego Ramirez", "333322221", 29, 9, "diego@gmail.com", "diegoPass");
	     visitantes.add(visitante9);
	     Visitante visitante10 = new Visitante("Sofia Diaz", "777766665", 24, 10, "sofia@gmail.com", "sofiaPass");
	     visitantes.add(visitante10);
		return visitantes;
	}

	public void setVisitantes(ArrayList<Visitante> visitantes) {
		this.visitantes = visitantes;
	}
}
