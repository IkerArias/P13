package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class VentanaTrabajador {
	
	private JFrame ventana;
    private JComboBox<String> tipoTrabajadorComboBox;
    private JTextField usuarioTextField;
    private JPasswordField contrasenaPasswordField;
	
	
    public VentanaTrabajador() {
    	
    //Paneles organizacion
    JPanel pnlComboBox = new JPanel();
    JPanel pnlUsuario = new JPanel();
    JPanel pnlContrasenia = new JPanel();
    	
    // Crear una ventana 
    ventana = new JFrame("Acceso de Trabajadores");
    ventana.setSize(800, 600);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setLayout(new FlowLayout());
    
    // Crear ComboBox para elegir el tipo de trabajador
    tipoTrabajadorComboBox = new JComboBox<>();
    tipoTrabajadorComboBox.addItem("Limpieza");
    tipoTrabajadorComboBox.addItem("Mantenimiento");
    tipoTrabajadorComboBox.addItem("Cuidador");
    tipoTrabajadorComboBox.addItem("Veterinario");
    tipoTrabajadorComboBox.addItem("Guía");
    tipoTrabajadorComboBox.addItem("Administrador");
    tipoTrabajadorComboBox.addItem("Diseñador de Eventos");
    tipoTrabajadorComboBox.addItem("Taquillero");
    tipoTrabajadorComboBox.addItem("Guardia de Seguridad");
    	
    
    
    // Crear campos de usuario y contraseña
    usuarioTextField = new JTextField(15);
    contrasenaPasswordField = new JPasswordField(15);

    // Crear botón de inicio de sesión
    JButton btnIniciarSesion = new JButton("Iniciar Sesión");
    
    // Agregar componentes a la ventana
    pnlComboBox.add(new JLabel("Tipo de Trabajador:"));
    pnlComboBox.add(tipoTrabajadorComboBox);
    ventana.add(pnlComboBox, BorderLayout.NORTH);
    
    pnlUsuario.add(new JLabel("Usuario:"));
    pnlUsuario.add(usuarioTextField);
    ventana.add(pnlUsuario, BorderLayout.CENTER);
    
    pnlContrasenia.add(new JLabel("Contraseña:"));
    pnlContrasenia.add(contrasenaPasswordField);
    pnlContrasenia.add(btnIniciarSesion);
    ventana.add(pnlContrasenia, BorderLayout.SOUTH);
    
    
    
 // Agregar ActionListener al botón de inicio de sesión
    btnIniciarSesion.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String usuario = usuarioTextField.getText();
            char[] contrasena = contrasenaPasswordField.getPassword();
            String tipoTrabajador = (String) tipoTrabajadorComboBox.getSelectedItem();

            // Verificar usuario y contraseña
            if (usuario.equals("Iker") && new String(contrasena).equals("Arias")) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso como " + tipoTrabajador);
                //Abrir ventana correspondiente
             // Abrir la ventana correspondiente al tipo de trabajador
                if (tipoTrabajador.equals("Limpieza")) {
                    
                    AbrirVentanaLimpieza();
                } else if (tipoTrabajador.equals("Mantenimiento")) {
                   
                    AbrirVentanaMantenimiento();
                } else if (tipoTrabajador.equals("Cuidador")) {
                    
                    AbrirVentanaCuidador();
                } else if (tipoTrabajador.equals("Veterianrio")) {
                    
                    AbrirVentanaveterinario();
                } else if (tipoTrabajador.equals("Guia")) {
                    
                    AbrirVentanaGuia();
                } else if (tipoTrabajador.equals("Administrador")) {
                    
                    AbrirVentanaAdminidtrador();
                } else if (tipoTrabajador.equals("Diseñador de Eventos")) {
                    
                    AbrirVentanaDiseñador();
                } else if (tipoTrabajador.equals("Taquillero")) {
                    
                    AbrirVentanaTaquillero();
                } else if (tipoTrabajador.equals("Guardia de Seguirdad")) {
                    
                    AbrirVentanaSeguridad();
                }
                
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
            
            // Limpia el campo de contraseña después de cada intento
            contrasenaPasswordField.setText("");
        	}

		private void AbrirVentanaSeguridad() {
			// TODO Auto-generated method stub
			VentanaSeguridad ventSeguridad = new VentanaSeguridad();
			ventSeguridad.setVisible(true);
			
		}

		private void AbrirVentanaTaquillero() {
			// TODO Auto-generated method stub
			VentanaTaquillero ventTaquillero = new VentanaTaquillero();
			ventTaquillero.setVisible(true);
			
		}

		private void AbrirVentanaDiseñador() {
			// TODO Auto-generated method stub
			VentanaDiseñador ventDiseñador = new VentanaDiseñador();
			ventDiseñador.setVisible(true);
			
		}

		private void AbrirVentanaAdminidtrador() {
			// TODO Auto-generated method stub
			VentanaAdministrador ventAdmin = new VentanaAdministrador();
			ventAdmin.setVisible(true);
			
		}

		private void AbrirVentanaGuia() {
			// TODO Auto-generated method stub
			VentanaGuia ventGuia = new VentanaGuia();
			ventGuia.setVisible(true);
			
		}

		private void AbrirVentanaveterinario() {
			// TODO Auto-generated method stub
			VentanaVeterinario ventVeterinario = new VentanaVeterinario();
			ventVeterinario.setVisible(true);
			
		}

		private void AbrirVentanaCuidador() {
			// TODO Auto-generated method stub
			VentanaCuidador ventCuidador = new VentanaCuidador();
			ventCuidador.setVisible(true);
			
		}

		private void AbrirVentanaMantenimiento() {
			// TODO Auto-generated method stub
			VentanaMantenimiento ventManten = new VentanaMantenimiento();
			ventManten.setVisible(true);
			
		}

		private void AbrirVentanaLimpieza() {
			// TODO Auto-generated method stub
			VentanaLimpieza ventLimpieza = new VentanaLimpieza();
			ventLimpieza.setVisible(true);
			
		}
    	});
    
 // 		Mostrar la ventana
    		ventana.setVisible(true);
    
    }
    
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new VentanaTrabajador();
	            }
	        });
    
}
}


	
	



