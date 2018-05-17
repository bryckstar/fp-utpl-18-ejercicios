/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;
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
        
        int hijos;
        String nombre;
        double sump = 0;
        double sumb = 0;
        double sums= 0;
        double sumt;
        double sueldo;
        String persona;
        double pasaje;
        double bar;
        double salida;
        int i;
        String cadena = String.format("%s\t%s\t%s\t%s\n", "Persona", "Pasajes", "Bar", "Salidas");
        
        System.out.printf("Cual es su sueldo semanal? \n");
        sueldo = entrada.nextDouble();
        System.out.printf("Cuantos hijos tiene?");
        hijos = entrada.nextInt();
        
        for (i = 1; i <= hijos; i++){
            System.out.printf("Cual es la cantidad que destina al pasaje de su hijo %d\n", i);
            pasaje = entrada.nextDouble();
            System.out.printf("Cual es la cantidad que destina al bar de su hijo %d\n", i);
            bar = entrada.nextDouble();
            System.out.printf("Cual es la cantidad que destina a las salidas de su hijo %d\n", i);
            salida = entrada.nextDouble();
            cadena = String.format("%sHijo %d\t%.2f\t%.2f\t%.2f\n", cadena, i, pasaje, bar, salida);
            sump = sump + pasaje;
            sumb = sumb + bar;
            sums = sums + salida;
        }
        System.out.printf("%s\n", "Gastos Familiares");
        System.out.printf("%s", cadena);
        System.out.printf("%s\t%.2f\t%.2f\t%.2f\n", "Totales", sump, sumb, sums);
        
        sumt = sump + sumb + sums;
        if(sumt < sueldo){
            System.out.println("A el padre de familia le sobra dinero\n");
        }else{
            if(sumt > sueldo){
                System.out.printf("A el padre de familia le falta dinero\n");
            }else{
                System.out.printf("A el padre de familia le alcanza con las justas");
            }
        }
        
        
    }
    
}
