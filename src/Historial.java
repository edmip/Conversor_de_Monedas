import java.text.DecimalFormat;
import java.util.ArrayList;

public class Historial {

    String moneda1;
    String moneda2;
    double cantidadMonedas;
    double calculo;
    DecimalFormat df = new DecimalFormat("#.00");
    int contadorHistoria = 0;



    public Historial(String moneda1, String moneda2, double cantidadMonedas, double calculo){


        this.moneda1 = moneda1;
        this.moneda2 = moneda2;
        this.cantidadMonedas = cantidadMonedas;
        this.calculo =  calculo;


    }

    public String getMoneda1() {
        return moneda1;
    }

    public String getMoneda2() {
        return moneda2;
    }

    public double getCantidadMonedas() {
        return cantidadMonedas;
    }

    public double getCalculo() {
        return calculo;
    }


    @Override
    public String toString() {
        return
                        "-----------------------------\n" +
                        "  De: " + getMoneda1() + "\n" +
                        "  A: " + getMoneda2() + "\n" +
                        "  Cantidad: " + getCantidadMonedas() + "\n" +
                        "  Resultado: " + df.format(getCalculo())  + "\n" +
                        "-----------------------------\n";
    }
}
