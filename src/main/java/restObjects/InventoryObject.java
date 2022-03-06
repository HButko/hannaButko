package restObjects;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;

public class InventoryObject {
    public JSONObject receiveInventory() throws IOException {
        Request inventoryRequest = new Request.Builder()
                .url("https://petstore.swagger.io/v2/store/inventory")
                .get()
                .build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(inventoryRequest).execute();
        JSONObject jsonResponse = new JSONObject(response.body().string());
        return jsonResponse;
    }
}
