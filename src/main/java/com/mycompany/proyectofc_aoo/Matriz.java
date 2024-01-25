
package com.mycompany.proyectofc_aoo;

import java.util.Scanner;

public class Matriz {
    
    // Constructor vacío de la clase Matriz.
    public Matriz() {
    }
    
    // Método para llenar la matriz con el símbolo dado.
     public String[][] llenarMatriz(String a[][]) {
        //USAREMOS 2 VARIABLES, F = número de filas, C = Número de columnas
        Scanner sc = new Scanner(System.in); //ta
        String str; //ta
        int filas = a.length;  //ta 
        int columnas = a[0].length;//ta 
        do {
            System.out.println("Elija con que caracter se llenara la matriz"); 
            str = sc.next(); //ta 
        } while (!this.comprobacionLetra(String.valueOf(str))); //n*tc
        for (int i = 0; i < filas; i++) { //F(tc+to+ta)+ta
            for (int j = 0; j < columnas; j++) { //F*C*(tc+to+ta)+ta
                a[i][j] = str; // F*C*(ta+to)
            }
        }
        /* ta + ta + ta + ta + ta + ntc + Ftc + Fto + Fta + ta + FCtc + FCto + FCta + ta+FCta + FCto 
           6ta +ntc + m(tc+to+ta+Ctc+Cto+Cta+Cta+Cto)
           6ta + ntc + F[C(2ta+2to+tc)+tc+to+ta] 
           TIEMPO ESTIMADO = 7ta + to + tc + ntc + F[C[2ta+2to+tc)] 
        */
        return a; // Devuelve la matriz llena.
    }

    private boolean comprobacionLetra(String str) {
        if (str.length() != 1) {  //tc
            System.out.println("Porfavor ingrese tan solo un caracter");  
            return false; 
        } else {
            return true;
        }
        //TIEMPO ESTIMADO = tc
    }
    // Método para mostrar el patrón A en la matriz.
    public void mostrarA(String a[][]) {
        int filas = a.length;  //ta
        for (int i = 0; i < filas; i++) {  //
            for (int j = 0; j <= i; j++) {
                System.out.print(a[i][j] + " "); // Muestra cada posición de la matriz según el patrón A.
            }
            System.out.println(""); // Salto de línea al final de cada fila.
        }
    }

    // Método para mostrar el patrón B en la matriz.
    public void mostrarB(String a[][]) {
        int controlador = a.length;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < controlador; j++) {
                System.out.print(a[i][j] + " "); // Muestra cada posición de la matriz según el patrón B.
            }
            controlador--; // Controla la cantidad de elementos a mostrar en cada fila.
            System.out.println(""); // Salto de línea al final de cada fila.
        }
    }
}