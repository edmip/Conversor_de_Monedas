import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner miScaner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        boolean obcionSalida = false;

        Monedas moneda2;
        Monedas moneda1;
        String miMoneda;
        double cantidadMonedas;


        new Mensajes().mensajeBienvenida();

        do  {
            ////////  ELIGIENDO LA PTRIMERA MONEJDA  //////////
            try {
            new Mensajes().mensajeElegir();
            int numeroMonedaElegida1 = miScaner.nextInt();
            if(numeroMonedaElegida1 == 0){
                System.out.println("USTED HA ELEGIDO SALIR DEL SISTEMA");
                break;
            }
                moneda1 = Monedas.values()[numeroMonedaElegida1 - 1];


            ////////  ELIGIENDO LA PTRIMERA MONEJDA  //////////
            new Mensajes().mensajeElegir2();
            int numeroMonedaElegida2 = miScaner.nextInt();
            if(numeroMonedaElegida2 == 0){
                System.out.println("USTED HA ELEGIDO SALIR DEL SISTEMA");
                break;
            }


                moneda2 = Monedas.values()[numeroMonedaElegida2 - 1];
            }catch (ArrayIndexOutOfBoundsException | InputMismatchException e){
                System.out.println("USTED HA ELEGIDO UNA OPCION NO VALIDA, EL PROGRAMA FINALIZARÁ");
                break;
            }

            ConsultaMoneda miConsulta = new ConsultaMoneda();
            miMoneda = miConsulta.consultaMoneda(moneda1);

            new Mensajes().mensajeCantMonedas(moneda1.toString());
            cantidadMonedas = miScaner.nextDouble();


        // Analizar el JSON y convertirlo en un objeto JsonObject
        JsonParser parser = new JsonParser();
        JsonObject jsonObject = parser.parse(miMoneda).getAsJsonObject();
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");

        // Acceder a las propiedades del objeto JSON
        double monedaCambio2 = conversionRates.get((moneda2.toString())).getAsDouble();

        double miCalculo = new Calculo().calculo(cantidadMonedas, monedaCambio2);

        // Imprimir las propiedades
        System.out.println("EL VALOR DE " + cantidadMonedas + " " + moneda1 + " A " + moneda2 + " ES DE " + df.format(miCalculo));
    }while (obcionSalida);
    }
}