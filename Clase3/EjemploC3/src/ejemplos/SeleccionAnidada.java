/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class SeleccionAnidada {

    public static void main(String[] args) {
        // documentacion

        int calificacion;
        String nombre;
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("Ingrese el nombre del estudiante:");
        nombre = entrada.nextLine();
        
        System.out.printf("Ingrese la calificacion:");
        calificacion = entrada.nextInt();

        if (calificacion >= 90) {
            System.out.printf("El estudiante %s está aprobado (excelente) con %d\n",nombre, calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 100) {
                System.out.printf("El estudiante %s está aprobado (muy buena) con %d\n", nombre, calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("El estudiante %s está (regular) con %d\n", nombre, calificacion);

                } else {
                    System.out.printf("El estudiante %s está reprobado con %d\n", nombre, calificacion);
                }
            }
        }
    }
}
