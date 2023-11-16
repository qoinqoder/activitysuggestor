package com.bored.activity;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import com.google.gson.Gson;
public class ActivityUtils {
    private static final String THIRD_PARTY_API_ENDPOINT = "https://www.boredapi.com/api/activity";

    public static Activity fetchActivity() {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet get = new HttpGet(THIRD_PARTY_API_ENDPOINT);
            CloseableHttpResponse response = client.execute(get);
            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity);

            Gson gson = new Gson();
            Activity activity = gson.fromJson(result, Activity.class);

            System.out.println("Activity fetched: " + activity);
            return activity;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
