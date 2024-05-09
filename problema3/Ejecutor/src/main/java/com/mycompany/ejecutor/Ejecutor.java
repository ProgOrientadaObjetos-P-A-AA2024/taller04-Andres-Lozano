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
        metodos vehiculo = new metodos("11056700", "Mercedez Venz", "2000", 10.000, 25);
        vehiculo.establecerValorM();
        metodos vehiculo2 = new metodos("1106548", "Ferrari", "2006", 10.500, 45);
        vehiculo2.establecerValorM();
        metodos vehiculo3 = new metodos("1108745", "Chevrolet", "2009", 11.200, 49);
        vehiculo3.establecerValorM();
        System.out.println(vehiculo.toString());
        System.out.println(vehiculo2.toString());
        System.out.println(vehiculo3.toString());
    }
}
