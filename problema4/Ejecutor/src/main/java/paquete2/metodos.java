package paquete2;

/**
 *
 * @author Usuario iTC
 */
public class metodos {

    private String nombre, nombreBanco;
    private double valorCheque, comision;

    public metodos(String n, String b, double d, double c) {
        nombre = n;
        nombreBanco = b;
        valorCheque = d;
        comision = c;
    }

    @Override
    public String toString() {
        String cadena = String.format("MANEJO DE CHEQUES\n"
                + "NOMBRE:%s\n"
                + "NOMBRE DEL BANCO:%s\n"
                + "VALOR DEL CHEQUE:%3.2f\n"
                + "COMICION:%3.2f\n", nombre, nombreBanco, valorCheque,
                comision);
        return cadena;
    }

    public void establecerNombre(String x) {
        nombre = x;

    }

    public void establecerNombreBanco(String x) {
        nombreBanco = x;

    }

    public void establecerValor(double x) {
        valorCheque = x;

    }

    public void establecerComicion() {
        comision = (valorCheque * 0.3) * valorCheque;

    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerValor() {
        return valorCheque;
    }

}
