public class JsonMapper {
    private String json;

    public JsonMapper() {
        this.json = JsonParser.jsonGetRequest();
    }

    public void print(){
        System.out.println("JsonMapper " + this.json);





    }

}
