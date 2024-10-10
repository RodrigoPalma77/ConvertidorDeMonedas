import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {

    public Monedas buscarMoneda(String monedaBase, String monedaTarget) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/8c686eb640066ef63e7e005c/pair/"+monedaBase+"/"+monedaTarget))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
            }
        catch (Exception e){
            throw new RuntimeException("No Encontré la Moneda");
        }
    }
}
