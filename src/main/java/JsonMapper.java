import com.fasterxml.jackson.databind.ObjectMapper;
import vat.Country;
import vat.Rates;

import java.util.List;

public class JsonMapper {
    private String json;
    private List<Country> countries;


    public JsonMapper() {
        this.json = Connection.jsonGetRequest();
    }


    public void print() {

        try {
            ObjectMapper mapper = new ObjectMapper();
            

            System.out.println("Here " + json);


        }catch (Exception e){
            e.getStackTrace();
        }

    }

}




//            SimpleModule module =
//                    new SimpleModule("CountryDeserializer", new Version(1, 0, 0, null, null, null));
//            module.addDeserializer(Country.class, new CountryDeserializer());
//            mapper.registerModule(module);
//
//            Country country = mapper.readValue(json, Country.class);
//
//            System.out.println("uuuu " + country.getName());

