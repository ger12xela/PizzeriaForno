package front;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class Pastas extends JPanel implements ActionListener{

	public static final String SPAGUETIS = "SPAGUETIS";
	public static final String LASANIA = "LASANIA";

	Ventana ventana;
	public Pastas(Ventana ventana) {
		this();
		this.ventana =ventana;
	}
	/**
	 * Create the panel.
	 */
	public Pastas() {
		setBackground(Color.GREEN);
		setLayout(new GridLayout(0, 1, 0, 10));
		
		JLabel lblPastas = new JLabel("PASTAS");
		lblPastas.setBackground(Color.WHITE);
		lblPastas.setOpaque(true);
		lblPastas.setFont(new Font("Calibri", Font.BOLD, 20));
		lblPastas.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblPastas);
		
		JButton btnSpagueti = new JButton("SPAGUETIS");
		add(btnSpagueti);
		btnSpagueti.setFont(new Font("Calibri", Font.BOLD, 26));
		btnSpagueti.setActionCommand(SPAGUETIS);
		btnSpagueti.addActionListener(this);
		
		JButton btnLasania = new JButton("LASAÑA");
		add(btnLasania);
		btnLasania.setFont(new Font("Calibri", Font.BOLD, 26));
		btnLasania.setActionCommand(LASANIA);
		btnLasania.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equals(SPAGUETIS)) {
			ventana.spagueti();
		}else if(e.getActionCommand().equals(LASANIA)){
			ventana.lasania("lasania");
		}
	}

}
