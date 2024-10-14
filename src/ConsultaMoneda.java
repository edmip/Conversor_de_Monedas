
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    //private  Monedas miMoneda = new Monedas();
    private  String URL =  "https://v6.exchangerate-api.com/v6/76447b644d9a49c6a6d8d9d5/latest/";


     String consultaMoneda(Monedas moneda) {
        URL = "https://v6.exchangerate-api.com/v6/76447b644d9a49c6a6d8d9d5/latest/" + moneda;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URL))
                .build();


        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String Json = response.body();
            return Json;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }




    }
}
