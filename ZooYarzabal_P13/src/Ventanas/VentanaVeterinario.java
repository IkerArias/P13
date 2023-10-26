package Ventanas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.Border;

import Zoo.*;

public class VentanaVeterinario extends JFrame {

    // Algunos Componentes

    protected JButton botonAsignar;
    protected JTextArea textoAsignaciones;
    protected JComboBox<Trabajador> comboVeterinarios;
    protected JComboBox<Animal> comboAnimalesEnfermos;
    protected JComboBox<AsignacionVet_Ani> comboHistorialDeAsignaciones;

    public VentanaVeterinario() {
        // Atributos principales de la ventana
        setTitle("Ventana de Veterinario");
        setLocationRelativeTo(null);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panelMensaje = new JPanel();
        JLabel labelMensaje = new JLabel("Regular asignaciones de animales enfermos a cada veterinario");
        panelMensaje.add(labelMensaje);

        JPanel panelCombos = new JPanel();
        panelCombos.setLayout(new GridLayout(1, 2));

        comboAnimalesEnfermos = new JComboBox<Animal>();
        Border bordeAnimalesEnfermos = BorderFactory.createTitledBorder("Animales enfermos: ");
        comboAnimalesEnfermos.setBorder(bordeAnimalesEnfermos);
        panelCombos.add(comboAnimalesEnfermos);

        comboVeterinarios = new JComboBox<Trabajador>();
        Border bordeVeterinarios = BorderFactory.createTitledBorder("Veterinarios disponibles: ");
        comboVeterinarios.setBorder(bordeVeterinarios);
        panelCombos.add(comboVeterinarios);

        // Parte del textArea
        JPanel panelTexto = new JPanel();
        textoAsignaciones = new JTextArea(10, 30);
        textoAsignaciones.setLineWrap(true);
        textoAsignaciones.setWrapStyleWord(true);
        JScrollPane paneTexto = new JScrollPane(textoAsignaciones);

        JPanel panelBotones = new JPanel();
        botonAsignar = new JButton("Asignar veterinario");
        botonAsignar.setEnabled(true);
        botonAsignar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementa la lógica de asignación aquí
            }
        });

        JButton botonSalir = new JButton("Salir");
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        JButton botonHistorial = new JButton("Historial");
        botonHistorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementa la lógica de historial aquí
            }
        });

        panelBotones.add(botonAsignar);
        panelBotones.add(botonHistorial);
        panelBotones.add(botonSalir);

        setLayout(new GridLayout(4, 1));
        add(panelMensaje);
        add(panelCombos);
        add(paneTexto);
        add(panelBotones);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaVeterinario();
            }
        });
    }
}
