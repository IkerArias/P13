package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class VentanaTrabajador extends JFrame {
	
	// static
	private static final long serialVersionUID = 1L;
	
	// Componentes de la ventana
	JComboBox<String> comboOficios;

	public VentanaTrabajador() {
		
		
		setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
		setSize( 800, 600 );
		setLocationRelativeTo( null );
		
		
		JPanel panelComboBox = new JPanel();
		
		comboOficios.addItem("Limpieza");
		comboOficios.addItem("Cuidador");
		comboOficios.addItem("Veterinario");
		comboOficios.addItem("Guia");
		comboOficios.addItem("Mantenimiento");
		comboOficios.addItem("Administrador");
		comboOficios.addItem("Diseñador");
		comboOficios.addItem("Taquillero");
		comboOficios.addItem("Guardia");
		
		comboOficios.setSelectedIndex(0);
	
		
		comboOficios.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (comboOficios.getSelectedItem().equals("Veterinario")) {
					VentanaVeterinario ventanaVet = new VentanaVeterinario();
					ventanaVet.setVisible(true);
				}else {
					return;
				}
			}
		});
		
		panelComboBox.add(comboOficios);
		add(panelComboBox, BorderLayout.CENTER);
		
		}
		
	
	
	/* protected boolean verificarContrasenya(String contrasenya) {
			return contrasenya.equals("AGOTE");
		}

	protected String pedirContrasenya() {
			// TODO Auto-generated method stub
			JPasswordField passwordField = new JPasswordField();
			Object [] mensaje = {"Ingrese la contraseña: ", passwordField};
			
			int aukera = JOptionPane.showConfirmDialog(null, mensaje, "Ingresa la contraseña", JOptionPane.OK_CANCEL_OPTION);
			if(aukera == JOptionPane.OK_OPTION) {
				return new String(passwordField.getPassword());
			}else {
			return null;
		
		
	} 
	
	} */
}
