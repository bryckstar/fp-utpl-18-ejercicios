/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberfor;

import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class DeberFor {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        String materia;
        int lim;
        int edad;
        int asignaturas;
        int bim1;
        int bim2;
        double suma = 0;
        double probim = 0;
        double promedio = 0;
        double sumProm = 0;
        int sumaEdad = 0;
        double edadT = 0;
        double promEstudiante = 0;
        String cadena = String.format("\n%s\n", "Reporte calificaciones de estudiantes");
        
        System.out.printf("Digite el Numero de Estudiantes que desea ingresar: \n");
        lim = entrada.nextInt();
        for (int i = 1; i <= lim; i++) {
            entrada.nextLine();
            System.out.printf("Ingrese el nombre del estudiante %d: \n", i);
            nombre = entrada.nextLine();
            System.out.printf("Ingrese la edad del estudiante %d: \n", i);
            edad = entrada.nextInt();
            System.out.printf("Ingrese el numero de asignaturas del estudiante %d: \n", i);
            asignaturas = entrada.nextInt();
            cadena = String.format("%sNombre del Estudiante %d: %s\nEdad: %d\nNumero de Asignaturas: %d\n\n%s\n%s\t\t%s\t\t%s\t\t%s\n", cadena, i, nombre, edad, asignaturas, "Reporte de Notas", "Materia", "Bim-1", "Bim-2", "Promedio");
            for (int j = 1; j <= asignaturas; j++) {
                entrada.nextLine();
                System.out.printf("Ingrese el nombre de la asignatura: \n", j);
                materia = entrada.nextLine();
                System.out.printf("Ingrese la Nota del 1° Bimestre: \n", j);
                bim1 = entrada.nextInt();
                System.out.printf("Ingrese la Nota del 2° Bimestre: \n", j);
                bim2 = entrada.nextInt();
                probim = (bim1 + bim2) / 2;
                cadena = String.format("%s%6.6s.\t\t%d\t\t%d\t\t%.2f\n", cadena, materia, bim1, bim2, probim);
                suma = suma + probim;
            }
            promedio = suma / asignaturas;
            cadena = String.format("%s\t\t\t\t%s\t%.2f\n", cadena, "Promedio:", promedio);
            if (promedio >= 19) {
                cadena = String.format("%s%s%s", cadena, nombre, " Tiene un promedio de SOBRESALIENTE\n\n");
            } else {
                if (promedio >= 16 && promedio < 19) {
                    cadena = String.format("%s%s%s", cadena, nombre, " Tiene un promedio de MUY BUENO\n\n");
                } else {
                    if (promedio >= 13 && promedio < 16) {
                        cadena = String.format("%s%s%s", cadena, nombre, " Tiene un promedio de BUENO\n\n");
                    } else {
                        cadena = String.format("%s%s%s", cadena, nombre, " Tiene un promedio de REGULAR\n\n");
                    }
                }
            }
            sumProm = sumProm + promedio;
            sumaEdad = sumaEdad + edad;
            edadT = sumaEdad / lim;
        }
        promEstudiante = sumProm / lim;
        System.out.printf("%s", cadena);
        System.out.printf("\n\nInformación global de los estudiantes: \n");
        System.out.printf("Promedio de edad es: %.2f \n",edadT);
        System.out.printf("Promedio de Notas de los Estudiantes es: %.2f\n", promEstudiante);
        
    }

}