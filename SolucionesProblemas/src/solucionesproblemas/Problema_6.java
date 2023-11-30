/*
Problema 6
Una empresa de comercialización de computadoras realiza el proceso de venta 
haciendo un descuento por tipo de cliente: Si es cliente tipo 1 hay un descuento
del 10% Si es cliente tipo 2 hay un descuento del 20% En caso que sea otro tipo 
de cliente, no hay descuento. Generar un proceso que permita ingresar 7 ventas: 
por cada venta preguntar los siguiente datos:
- Nombre del cliente
- Costo de la computadora (solo se vende una computadora por transacción)
- Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra 
  computadora con precio $100
 */
package solucionesproblemas;

import java.util.Scanner;

public class Problema_6 {

    public static void main(String[] args) {
        int venta = 1, cliente;
        double costComputadora;
        while (venta <= 7) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Nombre del cliente: ");
            String nombre = teclado.nextLine();
            System.out.println("Costo de la computadora");
            double costo = teclado.nextDouble();
            System.out.println("Tipo de cliente: ");
            cliente = teclado.nextInt();
            System.out.println("Nombre: " + nombre);
            System.out.println("Costo computadora: " + costo);
            if (cliente == 1) {
                costo = (costo - (costo * 10) / 100);
                System.out.println("Cliente tipo " + cliente + ", compra computadora con un precio de " + costo + "$");
            } else {
                costo = (costo - (costo * 20) / 100);
                System.out.println("Cliente tipo " + cliente + ", compra computadora con un precio de " + costo + "$");
            }
            venta++;
        }
    }
}
