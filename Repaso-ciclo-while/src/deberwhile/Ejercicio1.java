/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberwhile;
import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        boolean opc = true;
        String nombre;
        String cadena;
        String articulo;
        int cantidad;
        double pcu;
        double precio;
        double sub = 0;
        double iva;
        double total;
        
        cadena = String.format("%s\t%s\t%s\t%s\n", "Artículo","Cantidad","Precio Unit","Precio Total");
        System.out.printf("Ingrese el nombre del cliente: \n");
        nombre = entrada.nextLine();
        
        while (opc){

            System.out.printf("Ingrese el nombre del articulo: \n");
            articulo = entrada.nextLine();
            System.out.printf("Ingrese la cantidad de articulos: \n");
            cantidad = entrada.nextInt();
            System.out.printf("Ingrese el precio por unidad del articulo: \n");
            pcu = entrada.nextDouble();
            
            entrada.nextLine();
            System.out.printf("Desea ingresar mas articulos? (S/N)");
            String temp = entrada.nextLine();
            if (temp.equals("N")){
                opc = false;
            }
            
            precio = cantidad*pcu;
            sub = sub+precio;
            cadena = String.format("%s%-11s\t%d\t\t%.2f\t\t%.2f\n", cadena,articulo,cantidad,pcu,precio);
            
        }
        
        iva = (sub*14)/100;
        total = sub+iva;
        
        System.out.printf("\t\tFactura\n");
        System.out.printf("Supermercado \"Todo a Menor Precio\"\n");
        System.out.printf("Nombre del Cliente: %s\n\n", nombre);
        System.out.printf("%s", cadena);
        System.out.printf("\t\t\t\tSubtotal\t%.2f\n", sub);
        System.out.printf("\t\t\t\tIVA 14\t\t%.2f\n", iva);
        System.out.printf("\t\t\t\tTotal\t\t%.2f\n", total);
        
    }
    
}
