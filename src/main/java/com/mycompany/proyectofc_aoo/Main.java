package com.mycompany.proyectofc_aoo;


import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int op, M;
        String[][] _a = null;
        Matriz matriz = new Matriz(); // Creación de una instancia de la clase Matriz para realizar operaciones en matrices.
        Scanner sc = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario.
        do {
            // Menú de opciones para el usuario.
            System.out.println("1.-Insertar Valor 'M' que tendra la matriz MxM");
            System.out.println("2.-Mostrar patron A");
            System.out.println("3.- Mostrar patron B");
            System.out.println("4.-Salir");
            op = sc.nextInt(); // Captura de la opción seleccionada por el usuario.
            switch (op){
                case 1:
                    do {
                        System.out.println("Inserte el valor de M");
                        M = sc.nextInt(); // Captura del tamaño 'M' de la matriz, asegurándose de que sea al menos 1.
                    } while (M < 1);
                    _a = new String[M][M]; // Creación de una nueva matriz cuadrada de tamaño MxM.
                    matriz.llenarMatriz(_a); // Llamada al método llenarMatriz para ingresar valores en la matriz.
                    System.out.println("Matriz "+M+"x"+M+" ingresada");
                    break;
                case 2:
                    if (_a == null) {
                        System.out.println("No existe ninguna matriz");
                    } else {
                        matriz.mostrarA(_a); // Llamada al método mostrarA para mostrar el patrón A en la matriz.
                    }
                    break;
                case 3:
                    if (_a == null) {
                        System.out.println("No existe ninguna matriz");
                    } else {
                        matriz.mostrarB(_a); // Llamada al método mostrarB para mostrar el patrón B en la matriz.
                    }
                    break;
                default:
                    System.out.println(op == 4 ? "Saliendo del Programa..." : "No existe la opcion seleccionada");
            }
        } while (op != 4); // El bucle continúa hasta que el usuario elige la opción 4 para salir del programa.
        
    }
}