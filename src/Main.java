import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner miScaner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        boolean obcionSalida = false;

        ArrayList<Historial> miRegistro = new ArrayList<>();

        Monedas moneda2;
        Monedas moneda1;
        String miMoneda;
        double cantidadMonedas;


        new Mensajes().mensajeBienvenida();

        do  {
            ////////  ELIGIENDO LA PTRIMERA MONEJDA  //////////

            try {//TRY PARA MANEJAR EXCEPCIONES DEL ARRAY
                new Mensajes().mensajeElegir();
                int numeroMonedaElegida1 = miScaner.nextInt();
                if(numeroMonedaElegida1 == 0){
                    System.out.println("USTED HA ELEGIDO SALIR DEL SISTEMA");
                    obcionSalida = false;

                }
                moneda1 = Monedas.values()[numeroMonedaElegida1 - 1];


                ////////  ELIGIENDO LA PTRIMERA MONEJDA  //////////
                new Mensajes().mensajeElegir2();
                int numeroMonedaElegida2 = miScaner.nextInt();
                if(numeroMonedaElegida2 == 0){
                    System.out.println("USTED HA ELEGIDO SALIR DEL SISTEMA");
                    obcionSalida=false;

                }


                moneda2 = Monedas.values()[numeroMonedaElegida2 - 1];

            }catch (ArrayIndexOutOfBoundsException | InputMismatchException e){

                System.out.println("USTED HA ELEGIDO UNA OPCION NO VALIDA, EL PROGRAMA FINALIZARÁ");
                break;
            }

            try {

                ConsultaMoneda miConsulta = new ConsultaMoneda();
                miMoneda = miConsulta.consultaMoneda(moneda1);

            }catch (RuntimeException e){

                System.out.println(e.getMessage());
                System.out.println("FINALIZANDO LA APLICACION");
                break;

            }


            new Mensajes().mensajeCantMonedas(moneda1.toString());
            cantidadMonedas = miScaner.nextDouble();


            // Analizar el JSON y convertirlo en un objeto JsonObject
            JsonParser parser = new JsonParser();
            JsonObject jsonObject = parser.parse(miMoneda).getAsJsonObject();
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");


            // Acceder a las propiedades del objeto JSON
            double monedaCambio2 = conversionRates.get((moneda2.toString())).getAsDouble();

            double miCalculo = new Calculo().calculo(cantidadMonedas, monedaCambio2);

            Historial miHistorial = new Historial(moneda1.toString(), moneda2.toString(), cantidadMonedas, miCalculo);

            miRegistro.add(miHistorial);



//            // Imprimir el resultado
            new Mensajes().mensajeImprimirResultado(cantidadMonedas, moneda1.toString(), miCalculo, moneda2.toString());




        }while (obcionSalida == false);

        System.out.println("\n✨ Historial de tus Operaciones ✨\n ");
        for (Historial listaHistorias : miRegistro){
            System.out.println(listaHistorias);
        }


    }
}