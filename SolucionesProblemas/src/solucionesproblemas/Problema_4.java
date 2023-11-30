/*
Problema 4
Generar una solución que permita ingresar jugadores de fútbol; por cada jugador
se debe solicitar:
- Nombre el jugador
- Posición en el campo de juego
- Edad
- Estatura
- El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. 
Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
Listado de Jugadores
1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
4. Ángel Mena -Delantero-, edad 32, estatura 1.75
5. Michael Estrada -Delantero-, edad 27, estatura 1.93
Promedio de edades:  26.8
Promedio de estaturas: 1.87
 */
package solucionesproblemas;

import java.util.Scanner;

public class Problema_4 {

    public static void main(String[] args) {
        int numjugadores = 0;
        double sumEdades = 0;
        double sumAlturas = 0;
        boolean seguir = true;
        while (seguir) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el nombre del jugador: ");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese la posicion que juega: ");
            String posicion = teclado.nextLine();
            System.out.println("Ingrese la edad del jugador: ");
            int edad = teclado.nextInt();
            System.out.println("Ingrese la altura del jugador: ");
            double estatura = teclado.nextDouble();
            numjugadores = numjugadores + 1;
            System.out.println(numjugadores + ". " + nombre + " -" + posicion + "-. " + "edad " + edad + ", estatura " + estatura);
            System.out.println("Desea seguir con mas jugadores?");
            String respuesta = teclado.next();
            if (respuesta.equals("no")) {
                seguir = false;
            }
            sumEdades = sumEdades + edad;
            sumAlturas = sumAlturas + estatura;
        }
        System.out.println("Promedio edades: " + sumEdades / numjugadores);
        System.out.println("Promedio de estaturas: " + sumAlturas / numjugadores);
    }
}
