package Ventanas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import Zoo.*;

public class VentanaCuidador extends JFrame{
	
	private JList<String> listaDeAnimales;
    private JTextArea informacionAnimal;
    private JButton botonModificar;
    private ArrayList<Animal> animalesDelZoo;
	
	public VentanaCuidador() {
		
		setTitle("Ventana del Cuidador");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        animalesDelZoo = new ArrayList<>();
        // Llenar la lista de animales

        // Crea un DefaultListModel para la JList
        DefaultListModel<String> modeloListaAnimales = new DefaultListModel<>();
        for (Animal animal : animalesDelZoo) {
            modeloListaAnimales.addElement(animal.getNombre());
        }
        
        listaDeAnimales = new JList<>(modeloListaAnimales);
        listaDeAnimales.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        informacionAnimal = new JTextArea();
        informacionAnimal.setEditable(false);
        
        JScrollPane scrollInformacionAnimal = new JScrollPane(informacionAnimal);
        scrollInformacionAnimal.setPreferredSize(new Dimension(300, 400));

        botonModificar = new JButton("Modificar");
        botonModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Maneja la modificación del animal seleccionado aquí
                int indiceSeleccionado = listaDeAnimales.getSelectedIndex();
                if (indiceSeleccionado >= 0) {
                    Animal animalSeleccionado = animalesDelZoo.get(indiceSeleccionado);
                    // Implementa la lógica de modificación
                }
            }
        });
        
        //Organizar la ventana
        
        JPanel panelIzquierdo = new JPanel(new BorderLayout());
        panelIzquierdo.add(new JLabel("Animales del Zoo"), BorderLayout.NORTH);
        panelIzquierdo.add(new JScrollPane(listaDeAnimales), BorderLayout.CENTER);
        panelIzquierdo.add(botonModificar, BorderLayout.SOUTH);

        JPanel panelDerecho = new JPanel(new BorderLayout());
        panelDerecho.add(new JLabel("Información del Animal"), BorderLayout.NORTH);
        panelDerecho.add(scrollInformacionAnimal, BorderLayout.CENTER);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.add(panelIzquierdo, BorderLayout.WEST);
        panelPrincipal.add(panelDerecho, BorderLayout.CENTER);

        add(panelPrincipal);
        
        setVisible(true);
		
	}
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaCuidador();
            }
        });

}

}
