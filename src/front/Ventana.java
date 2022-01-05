package front;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import back.Contador;
import back.Producto;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Ventana extends JFrame implements ActionListener {

	
	// contantes de botones
	
	public static final String PIZZA = "PIZZA";
	public static final String PASTAS = "PASTAS";
	public static final String BEBIDAS = "BEBIDAS";
	public static final String NUEVO = "NUEVO";
	public static final String CONFIRMAR = "CONFIRMAR";
	public static final String BORRARU = "BORRARU";
	
	
	private JPanel contentPane;
	private JPanel panelOpciones = new JPanel();
	private JPanel panelTitulo = new JPanel();
	Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();

	/**
	 * Create the frame.
	 */
	
	int alto = pantalla.height;
	int ancho = pantalla.width;
	
	
	private final JPanel precio = new JPanel();
	private final JPanel panelFactura = new JPanel();
	private JPanel panellogo = new JPanel();
	private final JPanel panelGasto = new JPanel();
	private final JButton btnPizza = new JButton("PIZZA");
	private final JButton btnTacos = new JButton("PASTAS");
	private final Logo log = new Logo();
	private final JScrollPane scrollPane = new JScrollPane();
	private final JPanel panelLabels = new JPanel();
	private final JPanel panelTabla = new JPanel();
	private final JTable table = new JTable();
	private final JPanel panelrelleno = new JPanel();
	private final JPanel panel = new JPanel();
	private final JLabel lblGasto = new JLabel("Q. 0.00");
	private final JButton btnBebidas = new JButton("BEBIDAS");
	private final JPanel panel_1 = new JPanel();
	private final JPanel panel_2 = 
			new JPanel();
	private final JButton btnNuevo = new JButton("Nuevo");
	private final JLabel lblNewLabel = new JLabel("PEDIDO");
	private final JButton btnNewConfirmar = new JButton("Confirmar");
	private final JComboBox comboBoxCantidadPizza = new JComboBox();
	private final JComboBox comboBoxCantidadPastas = new JComboBox();
	private final JComboBox comboBoxCantidadBebidas = new JComboBox();
	private final JButton btnBorrarUltimo = new JButton("Borrar ultimo");
	
	private final JPanel panel_3 = new JPanel();
	
	// varios -- Contador 
	private final JPanel masMenu = new JPanel();
	
	private final PizzaTamaño pizzaTamaño = new PizzaTamaño(this);
	private final Pastas pastas = new Pastas(this);
	private final Bebidas bebidas = new Bebidas(this);
	private final Ingrediente ingrediente = new Ingrediente(this);
	private final Salsas salsas = new Salsas(this);
	//contador
	Contador ct =new Contador(table);
	public Ventana() {
		
//		addWindowListener(new WindowListener);
		
		panellogo =log;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 800, 800);
		setLocationRelativeTo(null);
//		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		contentPane.add(panelOpciones, BorderLayout.CENTER);
		panelOpciones.setLayout(new BorderLayout(0, 0));
		panel_1.setPreferredSize(new Dimension(300, 300));
		
		panelOpciones.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		panel_1.add(panel_3, BorderLayout.NORTH);
		panel_3.add(btnPizza);
		btnPizza.setMargin(new Insets(2, 14, 0, 14));
		btnPizza.setIcon(new ImageIcon(Ventana.class.getResource("/inicio/pizza (1).png")));
		btnPizza.setPreferredSize(new Dimension(100, 75));
		btnPizza.setMinimumSize(new Dimension(100, 100));
		btnPizza.setActionCommand(PIZZA);
		btnPizza.addActionListener(this);
		comboBoxCantidadPizza.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBoxCantidadPizza.setPreferredSize(new Dimension(40, 30));
		
		panel_3.add(comboBoxCantidadPizza);
		panel_3.add(btnTacos);
		btnTacos.setPreferredSize(new Dimension(100, 75));
		btnTacos.setMinimumSize(new Dimension(100, 100));
		btnTacos.setActionCommand(PASTAS);
		btnTacos.addActionListener(this);
		comboBoxCantidadPastas.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBoxCantidadPastas.setPreferredSize(new Dimension(40, 30));
		
		panel_3.add(comboBoxCantidadPastas);
		panel_3.add(btnBebidas);
		btnBebidas.setPreferredSize(new Dimension(100, 75));
		btnBebidas.setMinimumSize(new Dimension(100, 100));
		btnBebidas.setActionCommand(BEBIDAS);
		comboBoxCantidadBebidas.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBoxCantidadBebidas.setPreferredSize(new Dimension(40, 30));
		
		panel_3.add(comboBoxCantidadBebidas);
		btnBebidas.addActionListener(this);
		
		panel_1.add(masMenu, BorderLayout.CENTER);
		masMenu.setLayout(null);
		pastas.setBounds(0, 5, 774, 311);
		masMenu.add(pastas);
		pizzaTamaño.setBounds(0, 5, this.getWidth(), 311);
		masMenu.add(pizzaTamaño);
		
		bebidas.setBounds(0, 0, 774, 316);
		masMenu.add(bebidas);
		
		ingrediente.setBounds(0, 0, 774, 316);
		masMenu.add(ingrediente);
		
		salsas.setBounds(0, 0, 774, 316);
		masMenu.add(salsas);
		salsas.setVisible(false);
		
		ingrediente.setVisible(false);
		
		bebidas.setVisible(false);
		
		pizzaTamaño.setVisible(false);
		pastas.setVisible(false);
		
		panel_2.setPreferredSize(new Dimension(10, 50));
		
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		panel_2.add(btnNuevo);
		btnNuevo.setActionCommand(NUEVO);
		
		panel_2.add(btnBorrarUltimo);
		btnNewConfirmar.setBackground(Color.CYAN);
		btnBorrarUltimo.setActionCommand(BORRARU);
		btnBorrarUltimo.addActionListener(this);
		
		panel_2.add(btnNewConfirmar);
		btnNewConfirmar.setActionCommand(CONFIRMAR);
		btnNewConfirmar.addActionListener(this);
		btnNuevo.addActionListener(this);
		
		panelTitulo.setMinimumSize(new Dimension(800, 300));
		panelTitulo.setBorder(new LineBorder(Color.BLACK, 2));
		panelTitulo.setPreferredSize(new Dimension(10, 300));
		panelTitulo.setSize(new Dimension(0, 50));
		contentPane.add(panelTitulo, BorderLayout.NORTH);
		panelTitulo.setLayout(new GridLayout(1, 0, 0, 0));
		precio.setMaximumSize(new Dimension(1200, 32767));
		
		panelTitulo.add(precio);
		precio.setLayout(new GridLayout(0, 1, 0, 0));
		
		panellogo.setBackground(Color.GREEN);
		
		precio.add(panellogo);
		
		precio.add(panelGasto);
		panelGasto.setLayout(new BorderLayout(0, 0));
		panelrelleno.setPreferredSize(new Dimension(10, 40));
		
		panelGasto.add(panelrelleno, BorderLayout.NORTH);
		panelrelleno.setLayout(new GridLayout(1, 0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 20));
		
		panelrelleno.add(lblNewLabel_1);
		panel.setPreferredSize(new Dimension(10, 40));
		
		panelGasto.add(panel, BorderLayout.SOUTH);
		lblGasto.setFont(new Font("Calibri", Font.BOLD, 40));
		lblGasto.setOpaque(true);
		lblGasto.setBackground(Color.WHITE);
		lblGasto.setHorizontalAlignment(SwingConstants.CENTER);
		panelGasto.add(lblGasto, BorderLayout.CENTER);
		panelFactura.setBackground(Color.PINK);
		
		panelTitulo.add(panelFactura);
		panelFactura.setLayout(new BorderLayout(0, 0));
		
		panelFactura.add(scrollPane, BorderLayout.CENTER);
		panelLabels.setPreferredSize(new Dimension(10, 30));
		
		scrollPane.setColumnHeaderView(panelLabels);
		panelLabels.setLayout(new GridLayout(1, 0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 20));
		
		panelLabels.add(lblNewLabel);
		
		scrollPane.setViewportView(panelTabla);
		panelTabla.setLayout(new BorderLayout(0, 0));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Cantidad", "Descripcion", "Precio"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"cantidad", "Descripcion", "Precio"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(51);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(57);
		
		panelTabla.add(table);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {

		if(evento.getActionCommand().equals(PIZZA)) {
			this.oculta();
			pizzaTamaño.setVisible(true);

		}else if(evento.getActionCommand().equals(PASTAS)) {
			this.oculta();
			pastas.setVisible(true);
		}else if(evento.getActionCommand().equals(BEBIDAS)) {
			this.oculta();
			bebidas.setVisible(true);
			
		}else if(evento.getActionCommand().equals(CONFIRMAR)) {
			int a = JOptionPane.showConfirmDialog(this, "confimar la compra?","confirmar",JOptionPane.OK_CANCEL_OPTION);
			if(a==JOptionPane.YES_OPTION){
				ct.imprimir();
				// try {
				// 	Thread.sleep(6000);
				// } catch (InterruptedException e) {
				// 	// TODO Auto-generated catch block
				// 	e.printStackTrace();
				// }
				ct.imprimir();
				ct.Nuevo();
				oculta();
			}
		}else if(evento.getActionCommand().equals(NUEVO)) {
			ct.Nuevo();
			
		}else if(evento.getActionCommand().equals(BORRARU)) {
			ct.borrarUltimo();
			ct.mostrar();
		}

		actualizacion();
		
	}
	// para el array
	
	int precioProductos=0;
	String descripcionProcudto = "";
	private final JLabel lblNewLabel_1 = new JLabel("TOTAL");
	

	
	public void oculta() {
		pizzaTamaño.setVisible(false);
		pastas.setVisible(false);
		bebidas.setVisible(false);
		ingrediente.setVisible(false);
		pizzaTamaño.setVisible(false);
		ingrediente.setVisible(false);
		salsas.setVisible(false);
	}
	public void tamanioPizza(int precio, String descripcion) {
		this.precioProductos= precio;
		this.descripcionProcudto = descripcion;
		this.oculta();
		ingrediente.setVisible(true);
		
	}
	public void ingrediente(String descripcionIngrediente) {
		int temp = precioProductos;
		String temps = descripcionProcudto;
		if(this.precioProductos==35)descripcionProcudto= "Pza personal";
		if(this.precioProductos==45)descripcionProcudto= "Pza mediana";
		if(this.precioProductos==65)descripcionProcudto= "Pza grande";
		descripcionProcudto += descripcionIngrediente;
		int a = JOptionPane.showConfirmDialog(this,	" Desea queso extra?");
		if(a == 0) {
			precioProductos+=5;
			descripcionProcudto += "--ext q";
		}
		if(a != JOptionPane.CANCEL_OPTION) {
			int cantidad = Integer.parseInt(comboBoxCantidadPizza.getSelectedItem().toString());
			Producto pd = new Producto(cantidad, (precioProductos*cantidad), descripcionProcudto);
			ct.agreagar(pd);			
		}
		this.descripcionProcudto= temps;
		this.precioProductos=temp;
		actualizacion();
	}
	
	public void actualizacion() {
		lblGasto.setText("Q. "+ct.getTotal()+".00"); //actulaliza el total
		ct.mostrar();
		pizzaTamaño.setBounds(0, 0, this.getWidth(), this.getHeight()-500);
		pastas.setBounds(0, 0, this.getWidth(), this.getHeight()-500);
		bebidas.setBounds(0, 0, this.getWidth(), this.getHeight()-500);
		ingrediente.setBounds(0, 0, this.getWidth(), this.getHeight()-500);
		salsas.setBounds(0, 0, this.getWidth(), this.getHeight()-500);
		comboBoxCantidadPizza.setSelectedIndex(0);
		comboBoxCantidadPastas.setSelectedIndex(0);
		comboBoxCantidadBebidas.setSelectedIndex(0);
	}
	
	public void bebidas(String descripcion) {
		int cantidad = Integer.parseInt(comboBoxCantidadBebidas.getSelectedItem().toString());
		Producto pd = new Producto(cantidad,(cantidad*10),descripcion);
		ct.agreagar(pd);
		this.actualizacion();
	}
	
	public void lasania(String descripcion) {
		int cantidad = Integer.parseInt(comboBoxCantidadPastas.getSelectedItem().toString());
		Producto pd = new Producto(cantidad,(cantidad*40),descripcion);//______------> precio lasania Q.
		ct.agreagar(pd);
		this.actualizacion();
	}
	
	public void spagueti() {
		oculta();
		salsas.setVisible(true);
	}
	
	public void salsas(String descripcion) {
		int cantidad = Integer.parseInt(comboBoxCantidadPastas.getSelectedItem().toString());
		Producto pd = new Producto(cantidad,(cantidad*40),descripcion);//------>precio pastas salsa
		ct.agreagar(pd);
		this.actualizacion();	
	}
}
