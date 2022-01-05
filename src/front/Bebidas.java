package front;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

public class Bebidas extends JPanel implements ActionListener{
	
	//ETIQUETAS
	public static final String HORCHATA = "HORCHATA";
	public static final String JAMAICA = "JAMAICA";
	public static final String GASEOSA = "GASEOSA";
	Ventana ventana;
	
	public Bebidas(Ventana ventana) {
		this();
		this.ventana = ventana;
	}
	/**
	 * Create the panel.
	 */
	public Bebidas() {
		setBackground(Color.YELLOW);
		setLayout(new GridLayout(0, 1, 10, 10));
		
		JLabel lblNewLabel = new JLabel("BEBIDAS");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.WHITE);
		add(lblNewLabel);
		
		JButton btnHorchata = new JButton("HORCHATA");
		btnHorchata.setFont(new Font("Calibri", Font.BOLD, 26));
		btnHorchata.setFont(new Font("Calibri", Font.BOLD, 26));
		add(btnHorchata);
		btnHorchata.setActionCommand(HORCHATA);
		btnHorchata.addActionListener(this);
		
		JButton btnJamaica = new JButton("JAMAICA");
		add(btnJamaica);
		btnJamaica.setFont(new Font("Calibri", Font.BOLD, 26));
		btnJamaica.setActionCommand(JAMAICA);
		btnJamaica.addActionListener(this);
		
		JButton btnGaseosa = new JButton("GASEOSA");
		add(btnGaseosa);
		btnGaseosa.setFont(new Font("Calibri", Font.BOLD, 26));
		btnGaseosa.setActionCommand(GASEOSA);
		btnGaseosa.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equals(HORCHATA)) {
			ventana.bebidas("bebida horchata");
		}else if (e.getActionCommand().equals(JAMAICA)){
			ventana.bebidas("bebida jamaica ");
			
		}else if(e.getActionCommand().equals(GASEOSA)){
			ventana.bebidas("bebida gaseosa ");
			
		}
		
	}

}
