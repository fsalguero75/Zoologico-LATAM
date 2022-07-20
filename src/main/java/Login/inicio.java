package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.*;

public class inicio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio frame = new inicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public inicio() {
		setTitle("MainFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserLabel = new JLabel("User");
		lblUserLabel.setBounds(41, 39, 46, 14);
		contentPane.add(lblUserLabel);
		
		textField = new JTextField();
		textField.setBounds(51, 64, 279, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(51, 133, 279, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPassLabel = new JLabel("Password");
		lblPassLabel.setBounds(41, 108, 46, 14);
		contentPane.add(lblPassLabel);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user = textField.getText();
				String pass = textField_1.getText();
				
				//query
				String url = "select username, password, priilegio "
				+"from Usuarios where activo = 1 and username='"+user+"'";
				
				try {
					Connection con = Conexion.obtenerConexion();
					PreparedStatement ps = con.prepareStatement(url);
					ResultSet rs = ps.executeQuery();
					
					if(rs.next()) {
						String u = rs.getString("user");
						String p = rs.getString("pass");
						String priv = rs.getString("privilegio");
						
						if(pass.equals(p)) {
							if(priv.equals("visitante")) {
								visitante ventanaVisitante = new visitante();
								ventanaVisitante.setVisible(true);
							}else if (priv.equals("empleado")) {
								empleado ventanaEmpleado = new empleado();
								ventanaEmpleado.setVisible(true);
							}
						}else {
							JOptionPane.showMessageDialog(null, "LA CONTRASEÑA NO ES CORRECTA");
						}
					}else{
						JOptionPane.showMessageDialog(null, "EL USUARIO NO EXCISTE EN LA BD");
					};
					
				} catch (SQLException ex) {
					System.out.println(ex.toString());
				}
			}
		});
		btnNewButton.setBounds(171, 205, 89, 23);
		contentPane.add(btnNewButton);
	}
}
