
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
        for (int i = 0; i < filas; i++) { //F(ta+to+tc)+ ta + tc
            for (int j = 0; j < columnas; j++) { //F*[C*(ta+to+tc)+(ta + tc)]
                a[i][j] = str; // F*C*(ta)
            }
        }
        /* 
          Tm = ta + ta + ta + ta + (n+1)ta + (n+1)2tc + ta + tc;  
          Tm = 5ta + (n+1)(ta+2tc) + tc 
          Tp = ta + ta + ta + ta + (n+1)ta + (n+1)2tc + F(ta+to+tc)+ ta + tc + F*[C*(ta+to+tc)+(ta + tc)] + F*C*(ta)
          Tp = 5ta + (n+1)(ta+2tc) + F(ta+to+tc) + F*[C(ta+to+tc)+ta+tc] + FC(ta) + tc
          Tp = 5ta + (n+1)(ta+2tc) + F(2ta + 2tc + to + 2Cta + Cto + Ctc) + tc 
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
        // USAREMOS LA VARIABLES F = número de filas
        int filas = a.length;  //ta
        for (int i = 0; i < filas; i++) {  //F*(ta+to+tc)+ta+tc
            for (int j = 0; j <= i; j++) { //[F(F+1)/2]*[(ta+tc+to)+2ta+2tc+to]
                System.out.print(a[i][j] + " "); // [F(F+1)/2]*to
            }
            System.out.println(""); // Salto de línea al final de cada fila.
        }
        /*
        Tm= ta + ta + tc
        Tm = 2ta + tc
                        
        Tp = ta + F(ta+to+tc)+ta+tc + [F(F+1)/2](3ta+3tc+2to) + [F(F+1)/2]to
        Tp = 2ta + tc + F(ta+to+tc) + [F(F+1)/2](3ta+3tc+3to)
        */
    }

    // Método para mostrar el patrón B en la matriz.
   // USAREMOS LA VARIABLES F = número de filas
    public void mostrarB(String a[][]) {
        int controlador = a.length; //ta
        for (int i = 0; i < a.length; i++) {  //F*(ta+to+tc)+ta+tc
            for (int j = 0; j < controlador; j++) { //[F(F+1)/2]*[(ta+tc+to)+2ta+2tc+to]
                System.out.print(a[i][j] + " "); // [F(F+1)/2]*to
            }
            controlador--; //F(ta+to)
            System.out.println(""); // Salto de línea al final de cada fila.
                    /*
        Tm= ta + ta + tc 
        Tm= 2ta + tc 
        Tp= ta + F(2ta+to+2tc) + [F(F+1)/2]*(2ta+to+2tc) + [F(F+1)/2]*to + F(ta+to)
        Tp= ta + F(3ta+2to+2tc) + [F(F+1)/2]*[(2ta+2to+2tc)]
        */
        }
    }
}