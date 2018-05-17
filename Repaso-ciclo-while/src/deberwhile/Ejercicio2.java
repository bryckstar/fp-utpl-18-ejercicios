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
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double imp;
        int cont = 1;
        int lim;
        int ar = 0;
        int col = 0;
        int ch = 0;
        int otro = 0;
        double precioVenta;
        double impTotal = 0;
        double precioTotal = 0;
        String pais;
        String marca;
        double costo;
        System.out.println("Ingrese el numero de Autos Importados:");
        lim = entrada.nextInt();
        String cadena = String.format("%s\t\t\t%s\t\t\t%s\t\t\t%s\t\t%s\n", "Marca", "Origen", "Costo", "Impuesto", "Precio Venta");
        
        while (cont<= lim){
            entrada.nextLine();
            System.out.printf("Ingrese la marca del vehiculo: \n");
            marca = entrada.nextLine();
            System.out.printf("Ingrese el origen del automovil: \n");
            pais = entrada.nextLine();
            System.out.printf("Ingrese el costo del automovil: \n");
            costo = entrada.nextDouble();
            
            switch (pais){
                case "Argentina":
                    ar = ar +1;
                    imp = costo * 0.2;
                    break;
                case "Colombia":
                    col = col + 1;
                    imp = costo * 0.25;
                    break;
                case "Chile":
                    ch = ch + 1;
                    imp = costo * 0.3;
                    break;
                default:
                    otro = otro + 1;
                    imp = costo * 0.4;
            }
            
            precioVenta = costo + imp;
            impTotal = impTotal + imp;
            precioTotal = precioTotal + precioVenta;
            cadena = String.format("%s%-9s\t\t%-9s\t\t%5.0f\t\t\t%5.0f\t\t\t%5.0f\n", cadena, marca, pais, costo, imp, precioVenta);
            cont += 1;
        }
        
        System.out.printf("\tReporte de Autos Importados\n");
        System.out.printf("%s", cadena);
        System.out.printf("\nTotal Autos\t%d\t\tTot.Imp %.2f\t\tTot.PV %.2f\n", cont-1, impTotal, precioTotal);
        System.out.printf("\nArgentina\t%d\n", ar);
        System.out.printf("Chile    \t%d\n", ch);
        System.out.printf("Colombia\t%d\n",col);
        System.out.printf("Resto de paises\t%d\n", otro);
        
    }
    
}
