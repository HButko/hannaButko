package restObjects;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class OrderObject {
    public JSONObject receiveOrder() throws IOException {
        Request orderRequest = new Request.Builder()
                .url("https://petstore.swagger.io/v2/store/order/1")
                .get()
                .build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(orderRequest).execute();
        JSONObject jsonResponse = new JSONObject(response.body().string());
        return jsonResponse;
    }

    public JSONObject createOrder(int id, int petId, int quantity) throws IOException {
        JSONObject requestJson = new JSONObject("{\n" +
                "  \"id\": \"" + id + "\",\n" +
                "  \"petId\": \"" + petId + "\",\n" +
                "  \"quantity\": \"" + quantity + "\",\n" +
                "  \"shipDate\": \"2022-03-03T16:06:54.815Z\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true\n" +
                "}");
        RequestBody requestBody = RequestBody.create(requestJson.toString().getBytes(StandardCharsets.UTF_8));
        Request orderRequest = new Request.Builder()
                .url("https://petstore.swagger.io/v2/store/order/")
                .addHeader("Content-Type", "application/json")
                .post(requestBody)
                .build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(orderRequest).execute();
        JSONObject jsonResponse = new JSONObject(response.body().string());
        return jsonResponse;
    }

    public JSONObject deleteOrder() throws IOException {
        Request orderRequest = new Request.Builder()
                .url("https://petstore.swagger.io/v2/store/order/1")
                .delete()
                .build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(orderRequest).execute();
        JSONObject jsonResponse = new JSONObject(response.body().string());
        return jsonResponse;
    }
}
