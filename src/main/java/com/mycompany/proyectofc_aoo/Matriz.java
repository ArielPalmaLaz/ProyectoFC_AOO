
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
            str = sc.next(); //(n+1)*ta 
        } while (!this.comprobacionLetra(String.valueOf(str))); //(n+1)*2tc 
        for (int i = 0; i < filas; i++) { //F(2tc+to+2ta)
            for (int j = 0; j < columnas; j++) { //F*[C*(2tc+to+2ta)]
                a[i][j] = str; // F*C*(ta)
            }
        }
        /* 
          TIEMPO ESTIMADO = ta + ta + ta + ta + nta + 2ntc + F(tc+2ta+to) + F*[C*(to+2tc+2ta)] + F*(Cta)
                          = 4ta + nta + (n+1)*2tc + F[2tc+2ta+to+Cto+2Ctc+3Cta}
                          Al no existir una una condición de Búsqueda no existen ni mejor ni peor Tiempo,
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
        for (int i = 0; i < filas; i++) {  //F*(2ta+to+2tc)
            for (int j = 0; j <= i; j++) { //[F(F+1)/2]*(2ta+2tc+to)
                System.out.print(a[i][j] + " "); // [F(F+1)/2]*to
            }
            System.out.println(""); // Salto de línea al final de cada fila.
        }
        /*
        TIEMPO ESTIMADO = ta + F(2ta+to+2tc) + [F(F+1)/2]*(2ta+to+2tc) + [F(F+1)/2]*to
                        = ta + F(2ta+to+2tc) + [F(F+1)/2]*[(2ta+to+2tc) + to]
                        Al no existir una una condición de Búsqueda no existen ni mejor ni peor Tiempo,
        */
    }

    // Método para mostrar el patrón B en la matriz.
    public void mostrarB(String a[][]) {
        int controlador = a.length; //ta
        for (int i = 0; i < a.length; i++) {  //F*(2ta+to+2tc)
            for (int j = 0; j < controlador; j++) { //[F(F+1)/2]*(2ta+2tc+to)
                System.out.print(a[i][j] + " "); // [F(F+1)/2]*to
            }
            controlador--; // Controla la cantidad de elementos a mostrar en cada fila.
            System.out.println(""); // Salto de línea al final de cada fila.
                    /*
        TIEMPO ESTIMADO = ta + F(2ta+to+2tc) + [F(F+1)/2]*(2ta+to+2tc) + [F(F+1)/2]*to
                        = ta + F(2ta+to+2tc) + [F(F+1)/2]*[(2ta+to+2tc) + to]
                        Al no existir una una condición de Búsqueda no existen ni mejor ni peor Tiempo,
        */
        }
    }
}