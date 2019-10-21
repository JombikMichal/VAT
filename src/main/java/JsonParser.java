import netscape.javascript.JSObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class JsonParser {
    private InputStream inputStream;
    private URL url;
    private HttpURLConnection connection;
    private final String urlQueryString = "http://jsonvat.com/";


    private String streamToString(InputStream inputStream) {
        String text = new Scanner(inputStream, "UTF-8").useDelimiter("\\Z").next();
        return text;
    }


    public String jsonGetRequest(){
        String json = null;
        try {
            url = new URL(urlQueryString);
            connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("charset", "utf-8");
            connection.connect();
            inputStream = connection.getInputStream();
            json = streamToString(inputStream);


        }catch (IOException e){
            e.getStackTrace();
        }

        return json;
    }
}
