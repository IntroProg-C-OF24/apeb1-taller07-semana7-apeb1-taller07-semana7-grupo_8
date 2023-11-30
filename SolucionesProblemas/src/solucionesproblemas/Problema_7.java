/*
Problema 7
Generar e imprimir la siguiente serie:
sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 */
package solucionesproblemas;

public class Problema_7 {

    public static void main(String[] args) {
        int num = -1; 
        int num1 = 1;
        do {
            System.out.println(num + " / " + num1);
            num = num * (-1);
            num1++;
        } while (num1 <= 10);
    }
}
