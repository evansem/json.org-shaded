import org.json.JSONObject;
import org.json.CDL;

public class JsonExample {
    public static JSONObject createJSON() {
        JSONObject person = new JSONObject();
        person.put("name", "Mick");
        person.put("age", 42);

        person.put("favorite_foods", new String[]{"Prosciutto", "Papardelle", "Brezel"});

        new CDL();
        return person;
    }

    public static void main(String[] args) {
        System.out.println(createJSON().toString(4));
    }
}
