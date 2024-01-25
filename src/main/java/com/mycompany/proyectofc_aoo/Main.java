package com.mycompany.proyectofc_aoo;


import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int op = 0, M = 0; //2ta
        String[][] _a = null; //ta
        Matriz matriz = new Matriz(); // ta
        Scanner sc = new Scanner(System.in); //ta
        do {
            // Menú de opciones para el usuario.
            System.out.println("1.-Insertar Valor 'M' que tendra la matriz MxM");
            System.out.println("2.-Mostrar patron A");
            System.out.println("3.- Mostrar patron B");
            System.out.println("4.-Salir");
            op = sc.nextInt(); // W+ta
            switch (op){
                // A = Numero de veces que se repite el caso 1
                case 1: //
                    do {
                        //x = Veces que se repite el "do" del caso 1
                        System.out.println("Inserte el valor de M");
                        M = sc.nextInt(); // WA(x+ta)
                    } while (M < 1); // WA(x + tc) 
                    _a = new String[M][M]; // WAta 
                    matriz.llenarMatriz(_a); // WA(5ta + (n+1)(ta+2tc) + F(2ta + 2tc + to + 2Cta + Cto + Ctc) + tc) 
                    System.out.println("Matriz "+M+"x"+M+" ingresada"); //WA(2to)
                    break;
                case 2:
                    //B = Numero de veces que se repite el caso 2
                    if (_a == null) { // WBtc
                        System.out.println("No existe ninguna matriz");
                    } else {
                        matriz.mostrarA(_a); // WB[2ta + tc + F(ta+to+tc) + [F(F+1)/2](3ta+3tc+3to)].
                    }
                    break;
                case 3:
                    // C = Numero de veces que se repite el caso 3 
                    if (_a == null) { //WCtc
                        System.out.println("No existe ninguna matriz");
                    } else {
                        matriz.mostrarB(_a); // WC{ta + F(3ta+2to+2tc) + [F(F+1)/2]*[(2ta+2to+2tc)}
                    }
                    break;
                default:
                    // D = Numero de veces que se repite el caso default
                    System.out.println(op == 4 ? "Saliendo del Programa..." : "No existe la opcion seleccionada"); // WDtc
            }
        } while (op != 4); // W = Número de veces que se repite el menu.            W+tc
        
        /*
            Tm = 2ta + ta + ta + ta + ta + tc 
            
            Tp = 5ta + W{ta+A[x+ta+x+tc+ta+ 5ta + (n+1)(ta+2tc) 
                + F(2ta + 2tc + to + 2Cta + Cto + Ctc) + tc) +2to] 
                + B[tc+2+ta+tc+ F(ta+to+tc) + (F(F+1)/2](3ta+3tc+3to))]
                + C[ta+F(3ta+2to+2tc) + (F(F+1)/2)(2ta+to+2tc)]} + 1 + tc
        */ 
    }
}