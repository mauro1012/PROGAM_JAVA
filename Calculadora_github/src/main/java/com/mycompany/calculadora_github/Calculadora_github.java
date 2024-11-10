package com.mycompany.calculadora_github;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Calculadora_github {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int op;

        while (!salir) {
            System.out.println("Hello ");
            System.out.println("Choose the operation");
            System.out.println("1. suma");
            System.out.println("2. multiplicacion ");
            System.out.println("3. Salir");
            op = sc.nextInt();
            switch (op) {

                case 1:
                    System.out.println("Enter the number of numbers you want to add:");
                    int cantidad = sc.nextInt();
                    double[] numeros = new double[cantidad];
                    double resultado = 0;

                    for (int i = 0; i < cantidad; i++) {
                        System.out.print("the number enter is " + (i + 1) + ": ");
                        numeros[i] = sc.nextDouble();
                    }
                    for (double num : numeros) {
                        resultado += num;
                    }
                    System.out.println("the result is " + resultado);
                    break;

                case 2:
                    System.out.println("Enter the number of numbers you want to add:");
                    int cant = sc.nextInt();
                    double[] num = new double[cant];
                    double res = 1;

                    for (int i = 0; i < cant; i++) {
                        System.out.print("the number enter is " + (i + 1) + ": ");
                        num[i] = sc.nextDouble();
                    }
                    for (double num1 : num) {
                        res *= num1;
                    }
                    System.out.println("the result is " + res);
                    break;                  
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("only numbers from 1 to 3");

            }

        }
        sc.close();

    }
}
