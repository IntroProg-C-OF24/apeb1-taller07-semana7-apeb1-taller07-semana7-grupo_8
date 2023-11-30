package taller_7;
import java.util.Scanner;
public class Problema_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String nomEmpleado; 
	int numDias, numEmpleado, contador;
	double costoDia, totalPagar;
        contador = 1;
	numEmpleado = 1;
	while (numEmpleado <= 5) {
            System.out.println("Ingrese el nombre del empleado");
            nomEmpleado = teclado.next();
            System.out.println("Ingrese el numero de dias que se trabajo");
            numDias = teclado.nextInt();
            System.out.println("Ingrese el costo de paga por dia");
            costoDia = teclado.nextDouble();
                System.out.println("Nombre Empleado: " + nomEmpleado);
                System.out.println("Numero de dias trabajados: " + numDias);
                System.out.println("Costo por dia: " + costoDia);
                totalPagar = (numDias * costoDia);
                System.out.println("El total a pagar es: " + totalPagar + " Dolares");
                contador = contador + 1;
            }
        } 
    }
    

       
    

