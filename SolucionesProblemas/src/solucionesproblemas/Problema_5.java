/*
Problema 5
Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de 
ellos ingresar el nombre del estudiante, el promedio de ciclo. Presentar el 
siguiente reporte:
 */
package solucionesproblemas;

import java.util.Scanner;

public class Problema_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, resultado;
        double promedio;
        int i = 1;
        while (i <= 4) {
            System.out.println("======================================");
            System.out.println("Ingrese el nombre del estudiante " + i + ":");
            nombre = teclado.next();
            System.out.println("Ingrese el promedio del estudiante: ");
            promedio = teclado.nextDouble();
            if (promedio < 7) {
                resultado = "Reprobado";
            } else {
                resultado = "Aprobado";
            }
            System.out.println("=====================================");
            System.out.println("ESTUDIANTE " + i + ": " + nombre);
            System.out.println("PROMEDIO: " + promedio);
            System.out.println("RESULTADO: " + resultado);
            i++;
        }
    }
}
