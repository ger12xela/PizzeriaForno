package conexiones;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;


public class Conexion {
	Connection con = null;
	Statement st = null;
	
	public Conexion(){
		try {
			String rutafile = "C:\\Users\\ger12\\Documents\\databacePrueba.accdb";
			String url = "jdbc:ucanacces://"+rutafile;
			con = DriverManager.getConnection(url);
			st = con.createStatement();
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null,"conexion erronea" + e);
		}
		
	}
	
	public Connection getConnecition() {
		return con;
	}
	
	public void Desconexion() {
		try {
			con.close();
			System.exit(0);
			
		} catch (SQLException e) {
			Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
		}
	}

}
