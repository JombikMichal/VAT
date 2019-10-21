import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class JsonParser {
    private static InputStream inputStream;
    private static URL url;
    private static HttpURLConnection connection;
    private static final String urlQueryString = "http://jsonvat.com/";


    private static String streamToString(InputStream inputStream) {
        String text = new Scanner(inputStream, "UTF-8").useDelimiter("\\Z").next();
        return text;
    }


    public static String jsonGetRequest() {
        String json = null;
        try {
            url = new URL(urlQueryString);
            connection = (HttpURLConnection) url.openConnection();
            inputStream = connection.getInputStream();

            // input stream to string
            json = streamToString(inputStream);


        } catch (IOException e) {
            e.getStackTrace();
        }

        return json;
    }
}