/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int partidos;
        int jugadores;
        int pases;
        int goles;
        int cont = 1;
        int sumP = 0;
        int sumG = 0;
        int totalG = 0;
        int totalP = 0;
        int jugador = 0;
        float promP;
        float promG;
        boolean opc = true;
        String nombre;
        String nivel;
        String cadena = String.format("\n%s\n\n%s\t%s\t\t%s\t%s\n", "Reporte de Jugadores del Equipo \"UTPL\"", "Nombre del jugador", "Total de Pases", "Total Goles", "Nivel de Jugador");

        System.out.printf("Ingrese el numpero de partidos que se jugaron: \n");
        partidos = entrada.nextInt();
        entrada.nextLine();
        do {

            System.out.printf("Ingrese el nombre del jugador: %d\n", cont);
            nombre = entrada.nextLine();

            System.out.printf("Ingrese los pases del partido %d\n", 1);
            pases = entrada.nextInt();
            System.out.printf("Ingrese los goles del partido %d\n", 1);
            goles = entrada.nextInt();
            cadena = String.format("%s\n%10.10s.\t\tP1: %d\t\t\tP1: %d\n", cadena, nombre, pases, goles);
            sumP = pases;
            sumG = goles;

            for (int j = 2; j <= partidos; j++) {
                System.out.printf("Ingrese los pases del partido %d\n", j);
                pases = entrada.nextInt();
                System.out.printf("Ingrese los goles del partido %d\n", j);
                goles = entrada.nextInt();
                cadena = String.format("%s\t\t\tP%d: %d\t\t\tP%d: %d\n", cadena, j, pases, j, goles);
                sumP = sumP + pases;
                sumG = sumG + goles;
            }
            totalP = totalP + sumP;
            totalG = totalG + sumG;
            if (sumP >= 100) {
                nivel = "Excelente";
            } else {
                if (sumP >= 80 && sumP <= 99) {
                    nivel = "Muy Bueno";
                } else {
                    if (sumP >= 60 && sumP <= 79) {
                        nivel = "Bueno";
                    } else {
                        nivel = "Regular";
                    }
                }
            }
            cadena = String.format("%s\n\t\t\tTotal:%d\t\tTotal:%d\t\t%s\n", cadena, sumP, sumG, nivel);
            entrada.nextLine();
            System.out.printf("Desea Ingresar otro Jugador? Digite 'si' o 'no'): \n");
            String temporal = entrada.nextLine();
            if (temporal.equals("no")) {
                opc = false;
            }
            jugador = jugador + 1;
            cont++;
        } while (opc);

        promP = totalP / jugador;
        promG = totalG / jugador;

        System.out.printf("%s\n", cadena);
        System.out.printf("Datos Finales:\n");
        System.out.printf("%d Jugadores Analizados.\n", jugador);
        System.out.printf("Promedio de Pases del equipo es: %.2f\n", promP);
        System.out.printf("Promedio de Goles del equipo es: %.2f\n", promG);
        System.out.printf("Departamento Estadístico\n");
    }
}
