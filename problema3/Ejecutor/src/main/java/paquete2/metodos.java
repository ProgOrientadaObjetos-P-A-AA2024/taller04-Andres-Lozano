package paquete2;

/**
 *
 * @author Usuario iTC
 */
public class metodos {

    private String cedula, marca, anioFabricacion;
    private double valorVehiculo, valorMatricula;
    
    public metodos(String c,String x,String a,double v,double m){
        cedula=c;
        marca=x;
        anioFabricacion= "2006";
        valorVehiculo=v;
        valorMatricula=m;
    }
    @Override
    public String toString(){
        String cadena= String.format("AUTOMOTOR\n"
                + "Cedula del dueño:%s\n"
                + "Marca:%s\n"
                + "Año de fabricacion:%s\n"
                + "Valor del Vehiculo:%3.2f\n"
                + "Valor de Matricula:%3.2f\n",cedula,marca,anioFabricacion,
                valorVehiculo,valorMatricula,
                 cedula);
        return cadena;
    }

    public void establecerCedula(String x) {
        cedula = x;
    }

    public void establecerMarca(String x) {
        marca = x;
    }

    public void establecerAnio(String x) {
        anioFabricacion = x;
    }

    public void establecerValor(double x) {
        valorVehiculo = x;
    }

    public void establecerValorM() {
        valorMatricula = valorVehiculo*0.2;
    }

    public String obtenerMarca() {
        return marca;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerAnioF() {
        return anioFabricacion;
    }

    public double obtenerValor() {
        return valorVehiculo;
    }

}
