/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author Usuario iTC
 */
public class metodos {


    private String nombre, apellido, cedula;
    private double sueldoB, sueldoT;
    
    public metodos(String x,String z,String y, double n, double m){
        nombre =x;
        apellido = z;
        cedula= y;
        sueldoB=n;
        sueldoT=m;
    }
    @Override
    public String toString(){
        String cadena =String.format("Libreta de calificaciones\n"
                + "NOMBRE:%s\n"
                + "APELLIDO:%s\n"
                + "SUELDO BASICO:%3.2f\n"
                + "SUELDO TOTAL:%3.2f\n"
                + "CEDULA:%s\n",nombre,apellido,sueldoB,sueldoT,
                cedula);
        return cadena;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerApellido(String x) {
        apellido = x;
    }

    public void establecerCedula(String x) {
        cedula = x;
    }

    public void establecerSueldoB(double x) {
        sueldoB = x;
    }

    public void establecerSueldoT(double x) {
        sueldoT = x;
    }

    public String establecerNombre() {
        return nombre;
    }

    public String establecerApellido() {
        return apellido;
    }

    public String establecerCedula() {
        return cedula;
    }

    public double establecerSueldoB() {
        return sueldoB;
    }

    public double establecerSueldoT() {
        sueldoT = (sueldoB*0.2)+ sueldoB;
        return sueldoT;
    }
    

}

    

