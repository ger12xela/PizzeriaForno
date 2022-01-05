package front;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;

public class Ingrediente extends JPanel implements ActionListener {

	// etiquetas botones
	public static final String JAMON = "JAMON";
	public static final String PEPERONI = "PEPERONI";
	public static final String JAMONAND = "JAMONAND";
	public static final String TOCINO = "TOCINO";
	public static final String HAWAIANA = "HAWAIANA";
	public static final String MARGARITA = "MARGARITA";
	public static final String DELUXE = "DELUXE";


	private Ventana ventana;
	public Ingrediente(Ventana ventana) {
		this();
		this.ventana = ventana;
	}
	/**
	 * Create the panel.
	 */
	public Ingrediente() {
		setLayout(new BorderLayout(0, 0));

		JLabel lblIngrediente = new JLabel("INGREDIENTES");
		lblIngrediente.setPreferredSize(new Dimension(73, 30));
		lblIngrediente.setOpaque(true);
		lblIngrediente.setBackground(Color.WHITE);
		lblIngrediente.setFont(new Font("Calibri", Font.BOLD, 20));
		lblIngrediente.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblIngrediente, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 2, 5, 5));

		JButton btnJamon = new JButton("JAMON");
		panel.add(btnJamon);
		btnJamon.setFont(new Font("Calibri", Font.BOLD, 26));
		btnJamon.setActionCommand(JAMON);
		btnJamon.addActionListener(this);

		JButton btnPeperoni = new JButton("PEPERONI");
		panel.add(btnPeperoni);
		btnPeperoni.setFont(new Font("Calibri", Font.BOLD, 26));
		btnPeperoni.setActionCommand(PEPERONI);
		btnPeperoni.addActionListener(this);

		JButton btnJamonYPeperoni = new JButton("JAMON Y PEPERONI");
		panel.add(btnJamonYPeperoni);
		btnJamonYPeperoni.setFont(new Font("Calibri", Font.BOLD, 26));
		btnJamonYPeperoni.setActionCommand(JAMONAND);
		btnJamonYPeperoni.addActionListener(this);

		JButton btnTocino = new JButton("TOCINO CARBONARA");
		panel.add(btnTocino);
		btnTocino.setFont(new Font("Calibri", Font.BOLD, 26));
		btnTocino.setActionCommand(TOCINO);
		btnTocino.addActionListener(this);

		JButton btnHawainana = new JButton("HAWAINANA");
		panel.add(btnHawainana);
		btnHawainana.setFont(new Font("Calibri", Font.BOLD, 26));
		btnHawainana.setActionCommand(HAWAIANA);
		btnHawainana.addActionListener(this);
		
		JButton btnMargarita = new JButton("MARGARITA");
		panel.add(btnMargarita);
		btnMargarita.setFont(new Font("Calibri", Font.BOLD, 26));
		btnMargarita.setActionCommand(MARGARITA);
		btnMargarita.addActionListener(this);
		
		JButton btnDeluxe = new JButton("DELUXE");
		panel.add(btnDeluxe);
		btnDeluxe.setFont(new Font("Calibri", Font.BOLD, 26));
		btnDeluxe.setActionCommand(DELUXE);
		btnDeluxe.addActionListener(this);		

		// JButton btnOtro = new JButton("OTRO");
		// panel.add(btnOtro);
		// btnOtro.setFont(new Font("Calibri", Font. BOLD,26));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(JAMON)) {
			ventana.ingrediente(" de jamon");
		}
		if (e.getActionCommand().equals(PEPERONI)) {
			ventana.ingrediente(" de peperoni");
		}
		if (e.getActionCommand().equals(JAMONAND)) {
			ventana.ingrediente(" de jam y pep");
		}
		if (e.getActionCommand().equals(TOCINO)) {
			ventana.ingrediente(" de tocino");
		}
		if (e.getActionCommand().equals(HAWAIANA)) {
			ventana.ingrediente(" de hawaiana");
		}
		if (e.getActionCommand().equals(MARGARITA)) {
			ventana.ingrediente(" de margarita");
		}
		if (e.getActionCommand().equals(DELUXE)) {
			ventana.ingrediente(" de deluxe");
		}
	}

}
