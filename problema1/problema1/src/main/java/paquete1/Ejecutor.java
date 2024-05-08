

package paquete1;
import paquete2.libretaNotas;
public class Ejecutor {

    public static void main(String[] args) {
        libretaNotas libreta1=new libretaNotas("andres",10,10,10);
        libreta1.establecerPromedio();
        libretaNotas libreta2=new libretaNotas("jose",5,5,5);
        libreta2.establecerPromedio();
        libretaNotas libreta3 =new libretaNotas("fernando",7,7,7);
        libreta3.establecerPromedio();
        System.out.printf("%s\n",libreta1);
        System.out.printf("%s\n",libreta2);
    }
}
