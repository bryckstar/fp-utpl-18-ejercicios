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
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int hijos;
        int a;
        String nombre;
        int padres;
        double sump = 0;
        double sumb = 0;
        double sums = 0;
        double sumt;
        double sueldo;
        double pasaje;
        double bar;
        double salida;
        int i;
        String cadena2 = String.format("%s\n\n", "Reporte de Gastos de Padres de Familia");

        System.out.printf("Ingrese que numero de padres que desea evaluar\n");
        padres = entrada.nextInt();
        entrada.nextLine();

        for (a = 1; a <= padres; a++) {
            System.out.printf("Ingrese el nombre del padre de familia %d\n", a);
            nombre = entrada.nextLine();
            System.out.printf("Ingrese el sueldo semanal\n");
            sueldo = entrada.nextDouble();
            System.out.printf("Ingrese el numero de hijos\n");
            hijos = entrada.nextInt();
            cadena2 = String.format("%sNombre del Padre de Familia: %s\nSueldo Semanal $%.2f\nNumero de Hijos: %d\n\n%s\n%s\t%s\t%s\t%s\n", cadena2, nombre, sueldo, hijos, "Reporte de Gastos", "Persona", "Pasaje", "Bar", "Salidas");
            for (i = 1; i <= hijos; i++) {
                System.out.printf("Cual es la cantidad que destina al pasaje de su hijo %d\n", i);
                pasaje = entrada.nextDouble();
                System.out.printf("Cual es la cantidad que destina al bar de su hijo %d\n", i);
                bar = entrada.nextDouble();
                System.out.printf("Cual es la cantidad que destina a las salidas de su hijo %d\n\n", i);
                salida = entrada.nextDouble();
                cadena2 = String.format("%sHijo %s\t\t%.2f\t\t%.2f\t\t%.2f\n", cadena2, i, pasaje, bar, salida);
                sump = sump + pasaje;
                sumb = sumb + bar;
                sums = sums + salida;
            }
            cadena2 = String.format("%s%s\t\t%.2f\t\t%.2f\t\t%.2f\n", cadena2, "Total:", sump, sumb, sums);

            sumt = sump + sumb + sums;
            if (sumt < sueldo) {
                cadena2 = String.format("%sA el padre de familia %s le sobra dinero\n\n", cadena2, nombre);
            } else {
                if (sumt > sueldo) {
                    cadena2 = String.format("%sA el padre de familia %s le falta dinero\n\n", cadena2, nombre);
                } else {
                    cadena2 = String.format("%sA el padre de familia %s le alcanza el dinero\n\n", cadena2, nombre);
                }
            }
            entrada.nextLine();
        }

        System.out.printf("%s\n", cadena2);

    }

}
