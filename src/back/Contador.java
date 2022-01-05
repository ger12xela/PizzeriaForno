package back;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Contador {
	ArrayList<Producto> lista = new ArrayList<Producto>();
	JTable tabla;
	
	
	public Contador(JTable tabla){
		this.tabla = tabla;
	}
	
	public void agreagar(Producto pd) {
		lista.add(pd);
	}

	
	public void mostrar() {
		
		String[][] matris = new String[lista.size()][3];
		for (int i = 0; i < lista.size(); i++) {
		//for(int i =lista.size(); i==0; i--){

			matris[i][0] = String.valueOf(lista.get(i).getCantidad());
			matris[i][1] = lista.get(i).getDescripcion();
			matris[i][2] = String.valueOf(lista.get(i).getTotal());
		}

		
		tabla.setModel(new javax.swing.table.DefaultTableModel(matris, 
				new String[] { "cantidad", "Descripcion", "Precio" }
		
			));
		tabla.setFont(new Font("Calibri",0,16));
		tabla.setRowHeight(25);
		tabla.getColumnModel().getColumn(0).setPreferredWidth(5);
		tabla.getColumnModel().getColumn(1).setPreferredWidth(250);
		tabla.getColumnModel().getColumn(2).setPreferredWidth(5);
	}
	
	public int getTotal() {
		int total=0;
		for (int i = 0; i < lista.size(); i++) {
			total+= lista.get(i).getTotal();
			
		}
		
		return total;
	}
	
	public void Nuevo() {
		lista.clear();
		tabla.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {
			{"Cantidad", "Descripcion", "Precio"},
			{null, null, null},
			{null, null, null},
			{null, null, null},}
		, 
				new String[] { "cantidad", "Descripcion", "Precio" }
		
			));
		tabla.getColumnModel().getColumn(0).setPreferredWidth(5);
		tabla.getColumnModel().getColumn(1).setPreferredWidth(250);
		tabla.getColumnModel().getColumn(2).setPreferredWidth(5);

	}
	public void borrarUltimo() {
		if(lista.size()>0)
		lista.remove(lista.size()-1);
	}

	public void imprimir(){

		String contenido="";
		if(lista.size()>0){

			for (int i = 0; i < lista.size(); i++) {
				String cantidad = String.valueOf(lista.get(i).getCantidad());
				String descripcion = lista.get(i).getDescripcion();
				String precio = String.valueOf(lista.get(i).getTotal());
				
				String temp = cantidad+"  "+descripcion+"    Q."+precio+".00";
				contenido +=temp+"\n";
				
			}
			
			contenido +="         Total.  "+"Q."+this.getTotal()+".00"+"\n";

			Factura ft = new Factura("31/1/2021","10 am",contenido);
			ft.imp();
		}else{
			JOptionPane.showMessageDialog(null,"no hay pedido en coloa ");
		}

	}
}
