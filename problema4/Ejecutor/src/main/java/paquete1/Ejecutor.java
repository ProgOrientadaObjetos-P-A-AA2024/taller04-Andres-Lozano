package paquete1;

import paquete2.metodos;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {

    public static void main(String[] args) {
        metodos cheque = new metodos("Andres", "Banco de Loja", 1.000, 300);
        cheque.establecerComicion();
        metodos cheque2 = new metodos("Jose", "Banco Pichincha", 500, 150);
        cheque2.establecerComicion();
        metodos cheque3 = new metodos("Fernando", "Banco del Guayas", 1.200, 360);
        cheque3.establecerComicion();
        System.out.println(cheque.toString());
        System.out.println(cheque2.toString());
        System.out.println(cheque3.toString());
    }
}
