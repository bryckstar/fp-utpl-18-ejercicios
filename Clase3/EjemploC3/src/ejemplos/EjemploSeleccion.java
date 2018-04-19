/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
    Crear un programa que permita ingrsar una calificación por teclado si la 
    calificación ingresada es mayor o igual a 5 y la calificación es menor
    a 10, se debe presentar un mensaje que diga "Usted esta en supletorios", de
    lo contrario se presenta un mensaje con el valor de la calificaión dividido
    para dos.
*/
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class EjemploSeleccion {
    public static void main(String[] args) {
        double cal;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la calificaión");
        cal = entrada.nextDouble();
        
        if(cal>=5 && cal<10){
            System.out.printf("Usted esta en supeltorios por vago mmv\n");
        }else{
            System.out.printf("%s\n", cal/2);
        }
        
    }
    
}
