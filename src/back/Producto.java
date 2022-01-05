package back;

public class Producto {

	int cantidad,total;
	String descripcion;
	
	
	public Producto(int cantidad, int total, String descripcion) {
		this.cantidad = cantidad;
		this.total = total;
		this.descripcion = descripcion;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
