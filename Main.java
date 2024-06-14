import Clases.Factura;
import GUI.V_IniciarSesion;
public class Main {
	public static void main(String[] args) {
		
		/**
		 * Inicio de la Aplicacion*/

		V_IniciarSesion v = new V_IniciarSesion();
		v.setVisible(true);
        v.setResizable(false);//que no se pueda cambiar el tamaño
        v.setLocationRelativeTo(null);//que se muestre en el centro de la pantalla
	}
}



