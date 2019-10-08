
package ExamenRQC5;
/**
 *
 * @author Rodolfo Quispe Conza
 */
public class lechegloria3 {
    
    public static void main(String[] args) {
        Produc pa = new Produc();
        lechegloria1 pe = new lechegloria1();
        pe.setNombreProducto("LECHE GLORIA");
        pe.setPrecio(3.5);
        pe.setFechaCaducidad(pa.fecha("07-12-2019"));
        
        
        pa.agregarProducto(pe);
        pa.Listaproductos();
        
        System.out.println("");
        System.out.println("El producto no esta vencido ");
    }
}
