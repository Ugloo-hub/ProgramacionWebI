/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author devin
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        //1. Declare los siguientes tipos de datos

        
        int a;
        int x, y;
        double xd;
        double x1, y1;
        int a1 = 5, b = 6, c = 7;
        boolean sw = false;
        String cad = null;
        final double PI = 3.14;


        // 2. Convertir cadena = “200” a un entero en la variable E
        String cadena = "200";
        int E = Integer.parseInt(cadena);

        // 3. Convertir cadena = “ 200 ” a un entero en la variable E1
        String cadena2 = " 200 ";
        int E1 = Integer.parseInt(cadena2.trim());

        // 4. Convertir cadena = “200” a un float en la variable f1
        float f1 = Float.parseFloat(cadena);

        // 5. Convertir el float 23.84f a una cadena en la variable nomb
        float numero = 23.84f;
        String nomb = String.valueOf(numero);

        System.out.println("Valor de E: " + E);
        System.out.println("Valor de E1: " + E1);
        System.out.println("Valor de f1: " + f1);
        System.out.println("Valor de nomb: " + nomb);

        // 6. DATO TIPO REFERENCIA
        String texto = "Hola";
        int[] numeros = {1, 2, 3};

        System.out.println("Texto: " + texto);
        System.out.println("Primer número: " + numeros[0]);
    }
}
