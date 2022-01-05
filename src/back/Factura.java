package back;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

public class Factura {

	String encabezado = "        Pizzeria Al forno"+
						"\n"+
						"      gracias por tu compra";
	String fecha;
	String hora;
	String contenido= "hola esta es una prueba";
	String concretado="";
	ArrayList<Producto> nombreArrayList = new ArrayList<Producto>();

	public Factura(String fecha, String hora, String contenido){

		this.fecha=fecha;
		this.hora= fecha;
		this.contenido=contenido;
	}

	DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	public void imp(){
		for (int i = 0; i < 5; i++) {
			concretado +="\n";
		}
		concretado+=encabezado;
		concretado+="\n";
		concretado+="fecha y hora-->"+date.format(LocalDateTime.now());
		concretado+="\n";
		concretado+="\n";
		concretado+="\n";
		concretado+="\n";
		concretado+=contenido;
		concretado+="\n";
		concretado+="         vuelve pronto";
		concretado+="\n";
		concretado+="\n";
		concretado+="==================================";
		concretado+="\n";
		concretado+="==================================";

		// for (int i = 0; i < 75; i++) {
		// 	concretado +="\n";
		// }

		
		DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE;
		PrintService service = PrintServiceLookup.lookupDefaultPrintService();
		DocPrintJob pj = service.createPrintJob();
		byte[]bytes =concretado.getBytes();
		Doc doc = new SimpleDoc(bytes, flavor,null);
		try{
		pj.print(doc,null);
		}catch(Exception e){ }
		System.out.println("final");
	}
	
}

