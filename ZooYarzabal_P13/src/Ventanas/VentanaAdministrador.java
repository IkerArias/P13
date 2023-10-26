package Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class VentanaAdministrador extends JFrame{
	
	// Lista de trabajadores
    private JList<String> listaTrabajadores;

    // Área para mostrar datos del trabajador
    private JTextArea datosTrabajador;
	
	public VentanaAdministrador() {
		
		setTitle("Ventana del Administrador");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        // Crear la lista de trabajadores
        String[] trabajadores = {"Trabajador 1", "Trabajador 2", "Trabajador 3"};
        listaTrabajadores = new JList<>(trabajadores);
        
        
     // Crear el área de datos del trabajador
        datosTrabajador = new JTextArea();
        datosTrabajador.setEditable(false);

        // Crear botones
        JButton btnFinanzas = new JButton("Finanzas");
        JButton btnGestionAlimentos = new JButton("Gestión de Alimentos");
        JButton btnRecursosHumanos = new JButton("Recursos Humanos");
        
        
        //Action Listeners de los botones
        btnFinanzas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        btnGestionAlimentos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        btnRecursosHumanos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
     // Crear un contenedor principal
        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        // Crear paneles para organizar los componentes
        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setLayout(new BorderLayout());
        panelIzquierdo.add(listaTrabajadores, BorderLayout.CENTER);
        panelIzquierdo.add(datosTrabajador, BorderLayout.SOUTH);

        JPanel panelDerecho = new JPanel();
        panelDerecho.setBackground(Color.LIGHT_GRAY);

        JPanel panelAbajo = new JPanel();
        panelAbajo.add(btnFinanzas);
        panelAbajo.add(btnGestionAlimentos);
        panelAbajo.add(btnRecursosHumanos);

        // Agregar paneles al contenedor principal
        container.add(panelIzquierdo, BorderLayout.WEST);
        container.add(panelDerecho, BorderLayout.CENTER);
        container.add(panelAbajo, BorderLayout.SOUTH);
        
        setVisible(true);
	}
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaAdministrador();
            }
        });

}

}
