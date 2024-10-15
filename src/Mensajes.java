import java.text.DecimalFormat;

public class Mensajes {
    DecimalFormat df = new DecimalFormat("#.00");

    public void mensajeBienvenida() {
        String mensaje = "\n" +
                "*************************************************\n" +
                "*        🌟 BIENVENIDO AL SISTEMA  🌟           *\n" +
                "*      🌟  DE CONVERSIÓN DE MONEDAS 🌟          *\n" +
                "*************************************************\n";

        System.out.println(mensaje);
    }



    public void mensajeElegir() {

        System.out.println( "        >>>> SELECCIONE EL NUMERO DE LA MONEDA QUE DESEA CONSULTAR\n" +
                            "            O SELECCIONE EL  NUMERO 0 SI DESEA SALIR DEL SISTEMA <<<<\n");
        String mensaje =
                        "   1. USD: Dólar estadounidense - Estados Unidos\n" +
                        "   2. ARS: Peso argentino - Argentina\n" +
                        "   3. VES: Bolívar venezolano - Venezuela\n" +
                        "   4. EUR: Euro - Unión Europea\n" +
                        "   5. BRL: Real brasileño - Brasil\n" +
                        "   6. UYU: Peso uruguayo - Uruguay\n" +
                        "   7. CLP: Peso chileno - Chile\n" +
                        "   8. CAD: Dólar canadiense - Canadá\n" +
                        "   9. JPY: Yen japonés - Japón\n" +
                        "   10. BOB: Boliviano - Bolivia\n" +
                        "   11. COP: Peso colombiano - Colombia\n" +
                        "   12. MXN: Peso mexicano - México\n" +
                        "   13. NZD: Dólar neozelandés - Nueva Zelanda\n" +
                        "   14. RUB: Rublo ruso - Rusia\n" +
                        "   0. SALIR DEL SISTEMA";

        System.out.println(mensaje);

    }

    public void mensajeElegir2() {

        System.out.println( "        >>>> SELECCIONE EL NUMERO DE LA MONEDA CON LA QUE DESEA COMPARAR\n" +
                            "            O SELECCIONE EL  NUMERO 0 SI DESEA SALIR DEL SISTEMA <<<<\n");
        String mensaje =
                        "   1. USD: Dólar estadounidense - Estados Unidos\n" +
                        "   2. ARS: Peso argentino - Argentina\n" +
                        "   3. VES: Bolívar venezolano - Venezuela\n" +
                        "   4. EUR: Euro - Unión Europea\n" +
                        "   5. BRL: Real brasileño - Brasil\n" +
                        "   6. UYU: Peso uruguayo - Uruguay\n" +
                        "   7. CLP: Peso chileno - Chile\n" +
                        "   8. CAD: Dólar canadiense - Canadá\n" +
                        "   9. JPY: Yen japonés - Japón\n" +
                        "   10. BOB: Boliviano - Bolivia\n" +
                        "   11. COP: Peso colombiano - Colombia\n" +
                        "   12. MXN: Peso mexicano - México\n" +
                        "   13. NZD: Dólar neozelandés - Nueva Zelanda\n" +
                        "   14. RUB: Rublo ruso - Rusia\n" +
                        "   0. SALIR DEL SISTEMA";

        System.out.println(mensaje);

    }

    public void mensajeCantMonedas(String nombreMoneda) {
        String mensaje = "\nINSERTE LA CANTIDAD DE " + nombreMoneda + " A CONVERTIR";

        System.out.println(mensaje);
    }

    public void mensajeImprimirResultado(double cantidadMonedas, String moneda1, double miCalculo , String moneda2) {
        String mensaje = "\nEL VALOR DE " + cantidadMonedas + " [" + moneda1 + "], CORRESPONDE AL VALOR FINAL DE ---> " +
                df.format(miCalculo) + " [" +moneda2 + "].\n";

        System.out.println(mensaje);
    }

}

