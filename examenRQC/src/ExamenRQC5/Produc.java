/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenRQC5;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Rodolfo Quispe Conza
 */
public class Produc {
    ArrayList <lechegloria1> Listaproductos = new ArrayList<>();
    lechegloria1 producto = new lechegloria1();
    
    public void agregarProducto (lechegloria1 p){
        Listaproductos.add(p);
    }
    public Date fecha(String f){
        Date fecha = null;
        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
            fecha=formato.parse(f);
        } catch (ParseException ex){
            Logger.getLogger(Produc.class.getName()).log(Level.SEVERE, null,ex);
        }
        return fecha;
    }
    public void Listaproductos(){
        for(lechegloria1 prod : Listaproductos){
            System.out.println("Nombre: "+prod.getNombreProducto());
            System.out.println("Precio: "+prod.getPrecio());
            System.out.println("Fecha de caducidad: "+prod.getFechaCaducidad());
        }
    }
}
