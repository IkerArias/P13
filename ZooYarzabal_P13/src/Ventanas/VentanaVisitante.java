package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class VentanaVisitante {
	
	public VentanaVisitante() {
	
	//Creamos la ventana de Visitantes 
	
	JFrame ventana = new JFrame("Acceso para visitantes");
	ventana.setSize(800, 600);
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLayout(new FlowLayout());
    
    //Panel para los botones
    JPanel pnlBotones = new JPanel();
    
    //Creamos los botones de la ventana 
    JButton btnEventos = new JButton("Eventos");
    //ActionListener
    btnEventos.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Abrimos la ventana
            JOptionPane.showMessageDialog(null, "Has seleccionado la opción de Eventos");
            //Aqui hay que abrir la ventana
        }
    });
    
    
    JButton btnMapa = new JButton("Mapa del Zoológico");
    btnMapa.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Abrimos la ventana
            JOptionPane.showMessageDialog(null, "Has seleccionado la opción de Mapa");
            //Aqui hay que abrir la ventana
        }
    });
    
    JButton btnInfoAnimales = new JButton("Información de Animales");
    btnInfoAnimales.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Abrimos la ventana
            JOptionPane.showMessageDialog(null, "Has seleccionado la opción de informacion sobre Animales");
            //Aqui hay que abrir la ventana
        }
    });
    
    //Añadimos los botones
    
    pnlBotones.add(btnInfoAnimales);
    pnlBotones.add(btnMapa);
    pnlBotones.add(btnEventos);
    
    ventana.add(pnlBotones, BorderLayout.SOUTH);
    
    //Mostramos la ventana
    ventana.setVisible(true);
    
    
    
	}
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaVisitante();
            }
        });
	
}
}
	
	
