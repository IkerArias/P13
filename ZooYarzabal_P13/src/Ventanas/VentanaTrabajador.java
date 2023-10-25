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

            if (verificarCredenciales(usuario, new String(contrasena))) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso como " + tipoTrabajador);
                abrirVentana(tipoTrabajador);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }

            contrasenaPasswordField.setText("");

		}
    });
    		//Mostrar la ventana
    		ventana.setVisible(true);
    
    }
    
	    protected void abrirVentana(String tipoTrabajador) {
		// TODO Auto-generated method stub
	    
	        switch (tipoTrabajador) {
	            case "Limpieza":
	                new VentanaLimpieza();
	                break;
	            case "Mantenimiento":
	                new VentanaMantenimiento();
	                break;
	            case "Cuidador":
	                new VentanaCuidador();
	                break;
	            case "Veterinario":
	                new VentanaVeterinario();
	                break;
	            case "Guía":
	                new VentanaGuia();
	                break;
	            case "Administrador":
	                new VentanaAdministrador();
	                break;
	            case "Diseñador de Eventos":
	                new VentanaDiseñadorEventos();
	                break;
	            case "Taquillero":
	                new VentanaTaquillero();
	                break;
	            case "Guardia de Seguridad":
	                new VentanaSeguridad();
	                break;
	            default:
	        }
		
	}

		protected boolean verificarCredenciales(String usuario, String contrasena) {
		// TODO Auto-generated method stub
			return usuario.equals("Iker") && contrasena.equals("Arias");
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


	
	



