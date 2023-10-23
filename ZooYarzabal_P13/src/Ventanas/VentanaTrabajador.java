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
	
	private JFrame ventanaVet;
	
	// static
	private static final long serialVersionUID = 1L;
	
	// Componentes de la ventana
	JComboBox<String> comboOficios;

	public VentanaTrabajador(JFrame ventOrigen) {
		setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
		setSize( 800, 600 );
		setLocationRelativeTo( null );
		
		JPanel panelComboBox = new JPanel();
		
		comboOficios.addItem("Veterinario");
		comboOficios.addItem("Guía");
		comboOficios.addItem("Administrador");
		comboOficios.addItem("Diseñador");
		comboOficios.addItem("Taquillero");
		
		comboOficios.setSelectedIndex(0);
		panelComboBox.add(comboOficios);
		add(panelComboBox, BorderLayout.CENTER);
		
		comboOficios.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (comboOficios.getSelectedItem().equals("Veterinario")) {
					ventanaVet = new VentanaVeterinario();
					ventanaVet.setVisible(true);
				}else {
					return;
				}
			}
		});
		
	}
	
	public static void main(String[] args) {
		String contrasenya = pedirContrasenya();
		
		if(verificarContrasenya(contrasenya)) {
			JOptionPane.showMessageDialog(null, "Contraseña correcta");
			JFrame ventanaTrabajador = new JFrame();
			ventanaTrabajador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			ventanaTrabajador.setLocationRelativeTo(null);
			ventanaTrabajador.setSize(800, 400);
			ventanaTrabajador.setVisible(true);
		}else {
			JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
		}
	}

	private static String pedirContrasenya() {
		JPasswordField passwordField = new JPasswordField();
		Object [] mensaje = {"Ingrese la contraseña: ", passwordField};
		
		int aukera = JOptionPane.showConfirmDialog(null, mensaje, "Ingresa la contraseña", JOptionPane.OK_CANCEL_OPTION);
		if(aukera == JOptionPane.OK_OPTION) {
			return new String(passwordField.getPassword());
		}else {
			return null;
		}
	}
	
	private static boolean verificarContrasenya(String contrasenya) {
		return contrasenya.equals("AGOTE");
	}
	
}
