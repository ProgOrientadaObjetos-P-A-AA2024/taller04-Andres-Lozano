package paquete2;

/**
 *
 * @author Usuario iTC
 */
public class libretaNotas {

    private String nombreEstud;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public libretaNotas(String n, double c1, double c2, double c3) {
        nombreEstud = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }
        public libretaNotas(String n, double c1, double c2) {
        nombreEstud = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = 10;
    }
    @Override
    public String toString(){
        String cadena =String.format("Libreta de calificaciones\n"
        +"Nombre del Estudiante: %s\n"
                + "Calificacion 1: %.3f\n"
                + "Ca;ificacion 2: %.3f\n"
                + "Calificacion 3: %.3f\n"
                + "Promedio: %.2f\n",
                nombreEstud,
                calificacion1,
                calificacion2,
                calificacion3,
                establecerPromedio());
       return cadena;
    }
    public void establecerNombreEstud(String x) {
        nombreEstud = x;
    }

    public void establecerCalificacion1(double x) {
        calificacion1 = x;
    }

    public String obtenerNombreEstud() {
        return nombreEstud;
    }

    public void establecerCalificacion2(double x) {
        calificacion2 = x;
    }

    public void establecerCalificacion3(double x) {
        calificacion3 = x;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double establecerPromedio(){
        promedio= (calificacion1+calificacion2+calificacion3)/3;
        
        return promedio;
    }

}
