/*
20. Leer un número y determinar su factorial.

La función factorial (símbolo: !) sólo quiere decir que se multiplican una serie 
de números que descienden. Ejemplos:

4! = 4 × 3 × 2 × 1 = 24
7! = 7 × 6 × 5 × 4 × 3 × 2 × 1 = 5040
1! = 1
 */
package factorialnumero;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class FactorialNumero {

    public static void main(String[] args) {

        int num_fac;
        int resultado = 1;

        num_fac = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        System.out.println("Numero factorial : " + factorial(num_fac));
    }

    public static int factorial(int numero) {
        int f = 1;
        for (int i = 2; i <= numero; i++) {
            f = f * i;
        }
        return f;

    }
}
