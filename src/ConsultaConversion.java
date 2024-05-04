import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaConversion {

    public Moneda conversionMoneda (String code_base, String code_target, double cantidad) throws IOException, InterruptedException {

        String direccion = "https://v6.exchangerate-api.com/v6/a3522743e5832adfa94fdaa9/pair/"+code_base+ "/"+code_target+"/"+cantidad;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), Moneda.class);

    }
}
