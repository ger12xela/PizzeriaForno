package front;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class PizzaTamaño extends JPanel implements ActionListener {
	
	//etiquetas botones
	public static final String PERSONAL = "PERSONAL";
	public static final String MEDIANA = "MEDIANA";
	public static final String GRANDE = "GRANDE";
	
    Font fuente = new Font("Calibri", 3, 20);
	
	private Ventana ventana;
	public PizzaTamaño(Ventana ventana){
		this();
		this.ventana = ventana;
	}

	/**
	 * Create the panel.
	 */
	public PizzaTamaño() {
		setBackground(Color.RED);
		setLayout(new GridLayout(0, 1, 0, 10));
		
		JLabel lblTamanio = new JLabel("Tamanios");
		lblTamanio.setOpaque(true);
		lblTamanio.setFont(new Font("Calibri", Font.BOLD, 20));
		lblTamanio.setBackground(Color.WHITE);
		lblTamanio.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblTamanio);
		
		JButton btnPizzapersonal = new JButton("Personal");
		add(btnPizzapersonal);
		btnPizzapersonal.setFont(new Font("Calibri", Font.BOLD, 26));
		btnPizzapersonal.setActionCommand(PERSONAL);
		btnPizzapersonal.addActionListener(this);
		
		JButton btnPizzaMediana = new JButton("Mediana");
		btnPizzaMediana.setFont(new Font("Calibri", Font.BOLD, 26));
		add(btnPizzaMediana);
		btnPizzaMediana.setActionCommand(MEDIANA);
		btnPizzaMediana.addActionListener(this);
		
		JButton btnPizzaGrande = new JButton("Grande");
		btnPizzaGrande.setFont(new Font("Calibri", Font.BOLD, 26));
		add(btnPizzaGrande);
		btnPizzaGrande.setActionCommand(GRANDE);
		btnPizzaGrande.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(PERSONAL)) {
			ventana.tamanioPizza(35, "pizza personal");// precio de la pizza personal 
			
		}else if(e.getActionCommand().equals(MEDIANA)) {
			ventana.tamanioPizza(45, "pizza media");// precio de la pizza media
			
		}else if(e.getActionCommand().equals(GRANDE)) {
			ventana.tamanioPizza(65, "pizza personal");// precio de la pizza grande
			
		}
		
	}

}
