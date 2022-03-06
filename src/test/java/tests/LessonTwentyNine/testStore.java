package tests.LessonTwentyNine;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import restObjects.InventoryObject;
import restObjects.OrderObject;

import java.io.IOException;
import java.util.Random;

public class testStore {
    Random random = new Random();

    @Test
    public void getInventory() throws IOException {
        JSONObject response = new InventoryObject().receiveInventory();

        String verifyResponse = response.get("available").toString();
        Assert.assertEquals(verifyResponse, verifyResponse, "Inventory availability is not received");
    }

    @Test
    public void getOrder() throws IOException {
        JSONObject response = new OrderObject().receiveOrder();

        String verifyResponse = response.get("id").toString();
        Assert.assertEquals(verifyResponse, verifyResponse, "Order ID is not received");
    }

    @Test
    public void postOrder() throws IOException {
        int id = random.nextInt(100);
        int petId = random.nextInt(100);
        int quantity = random.nextInt(100);

        JSONObject response = new OrderObject().createOrder(id, petId, quantity);

        String verifyResponse = response.get("id").toString();
        Assert.assertEquals(verifyResponse, verifyResponse, "Order is not created");
    }

    @Test
    public void deleteOrder() throws IOException {
        JSONObject response = new OrderObject().deleteOrder();

        String verifyResponse = response.get("code").toString();
        Assert.assertEquals(verifyResponse, verifyResponse, "Order is not deleted");
    }
}
