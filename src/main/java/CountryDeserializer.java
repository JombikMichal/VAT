import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import vat.Country;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountryDeserializer extends StdDeserializer<Country> {
    private List<Country> countries = new ArrayList<>();

    public CountryDeserializer() {
        this(null);
    }

    public CountryDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Country deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        Country country = new Country();
        ObjectCodec objectCodec = jsonParser.getCodec();
        JsonNode jsonNode = objectCodec.readTree(jsonParser);


        try {

            JsonNode nameJson = jsonNode.get("details");
            String name = nameJson.asText();
            country.setName(name);
        } catch (Exception e) {
            e.getStackTrace();
        }


        return country;
    }
}
