
package examenRQC;

import java.util.Scanner;

/**
 *
 * @author Rodolfo Quispe Conza
 */
public class ExamenRQC2 {
    public static void main(String[] args) {
        Scanner scv = new Scanner(System.in);
        System.out.println("Primer Número: ");
        int n1=scv.nextInt();
        System.out.println("Segundo Número: ");
        int n2=scv.nextInt();
        System.out.println("Tercero Número: ");
        int n3=scv.nextInt();
        
        int mayor=n1;
        int menor=n1;
        
        if(mayor>n2){
            mayor=n2;}
        if(mayor>n3){
            mayor=n3;}
        if(menor<n2){
            menor=n2;}
        if(menor<n3){
            menor=n3;}
        
        int Respos = mayor;
        int Resneg = menor;
        
        System.out.println("Mayor: "+Respos);
        System.out.println("Menor: "+Resneg);
    }
    
}