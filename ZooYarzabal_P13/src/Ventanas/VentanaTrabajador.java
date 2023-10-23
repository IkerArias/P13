package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class VentanaTrabajador extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	// Componentes de la ventana
	JComboBox<String> comboOficios;

	public VentanaTrabajador() {
	
	JPanel panelComboBox = new JPanel();
	
	comboOficios.addItem("Limpieza");
	comboOficios.addItem("Cuidador");
	comboOficios.addItem("Veterinario");
	comboOficios.addItem("Guia");
	comboOficios.addItem("Mantenimiento");
	comboOficios.addItem("Admisnistrador");
	comboOficios.addItem("Diseñador de eventos");
	comboOficios.addItem("Taquillero");
	comboOficios.addItem("Seguridad");
	
	comboOficios.setSelectedIndex(0);
	panelComboBox.add(comboOficios);
	add(panelComboBox, BorderLayout.SOUTH);
	
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
		
		int aukera = JOptionPane.showConfirmDialog(null, mensaje, "Ingresa la contraseña para confirmar que formas parte del cuerpo de trabajadores del zoo", JOptionPane.OK_CANCEL_OPTION);
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

