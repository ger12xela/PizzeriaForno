package front;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class Salsas extends JPanel implements ActionListener  {

	public static final String CARBORNARA = "CARBONARA";
	public static final String ALFREDO = "ALFREDO";
	public static final String BOLONIESA = "BOLONIESA";
	Ventana ventana;
	
	public Salsas(Ventana ventana) {
		this();
		this.ventana = ventana;
	}
	/**
	 * Create the panel.
	 */
	public Salsas() {
		setBackground(Color.GREEN);
		setLayout(new GridLayout(0, 1, 0, 10));
		
		JLabel lblSalsas = new JLabel("SALSAS");
		lblSalsas.setBackground(Color.WHITE);
		lblSalsas.setOpaque(true);
		lblSalsas.setFont(new Font("Calibri", Font.BOLD, 20));
		lblSalsas.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblSalsas);
		
		JButton btnCarbonara = new JButton("CARBONARA");
		add(btnCarbonara);
		btnCarbonara.setFont(new Font("Calibri", Font.BOLD, 26));
		btnCarbonara.setActionCommand(CARBORNARA);
		btnCarbonara.addActionListener(this);
				
		JButton btnAlfredo = new JButton("ALFREDO");
		add(btnAlfredo);
		btnAlfredo.setFont(new Font("Calibri", Font.BOLD, 26));
		btnAlfredo.setActionCommand(ALFREDO);
		btnAlfredo.addActionListener(this);
		
		JButton btnBoloniesa = new JButton("BOLOÑESA");
		add(btnBoloniesa);
		btnBoloniesa.setFont(new Font("Calibri", Font.BOLD, 26));
		btnBoloniesa.setActionCommand(BOLONIESA);
		btnBoloniesa.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(CARBORNARA)) {
			ventana.salsas("pasta salsa carbonara");
		}else if(e.getActionCommand().equals(ALFREDO)) {
			ventana.salsas("pasta salsa alfredo");
		}else if(e.getActionCommand().equals(BOLONIESA)) {
			ventana.salsas("pasta salsa boloniesa");
			
		}
		
	}

}
