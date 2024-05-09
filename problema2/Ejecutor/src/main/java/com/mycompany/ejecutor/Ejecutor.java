/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejecutor;
import paquete2.metodos;
/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {

    public static void main(String[] args) {
        metodos sueldo = new metodos("Andres", "lozano", "1105691370", 1.000, 1.300);
        sueldo.establecerSueldoT();
        metodos sueldo2 = new metodos("Jose", "perez", "11091234", 500, 760);
        sueldo2.establecerSueldoT();
        metodos sueldo3 = new metodos("Fernando", "reyes", "11089", 1.200, 1.450);
        sueldo3.establecerSueldoT();
        System.out.println(sueldo.toString());
        System.out.println(sueldo2.toString());
        System.out.println(sueldo3.toString());
    }
}
