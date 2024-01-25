
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
            str = sc.next(); //n*ta 
        } while (!this.comprobacionLetra(String.valueOf(str))); //n*tc
        for (int i = 0; i < filas; i++) { //F(tc+to+ta)
            for (int j = 0; j < columnas; j++) { //F*[C*(tc+to+ta)]
                a[i][j] = str; // F*C*(ta+to)
            }
        }
        /* 
          TM = ta + ta + ta + ta + nta + ntc + F(
          TIEMPO ESTIMADO =ta + ta + ta + ta + nta + ntc + Ftc + Fto + Fta + ta + F[C(tc+to+ta)+ta]
                          =5ta + n(ta+tc) + F(tc+to+ta) + F[(Ctc+Cto+Cta)+ta]
                          =5ta + n(ta+tc) + F[(tc+to+ta)+(Ctc+Cto+Cta)+ta]
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
        for (int i = 0; i < filas; i++) {  //F*(ta+to+tc)
            for (int j = 0; j <= i; j++) { //[F(F+1)/2]*(ta+tc+to)
                System.out.print(a[i][j] + " "); // Fto
            }
            System.out.println(""); // Salto de línea al final de cada fila.
        }
        /*
        TIEMPO ESTIMADO = ta+F(ta+to+tc)+ta+F(ta+to+tc)+ta+Fto
                        = 3ta + 2F(ta+to+tc)+to
        */
    }

    // Método para mostrar el patrón B en la matriz.
    public void mostrarB(String a[][]) {
        int controlador = a.length; //ta
        for (int i = 0; i < a.length; i++) {  //F*(ta+tc+to)+ta
            for (int j = 0; j < controlador; j++) { //F*F(ta+tc+to)+ta
                System.out.print(a[i][j] + " "); // F*to
            }
            controlador--; // Controla la cantidad de elementos a mostrar en cada fila.
            System.out.println(""); // Salto de línea al final de cada fila.
        }
    }
}