import org.json.JSONException;
import org.json.JSONObject;

public class Cookie {

    /**
     * This method is exactly the same, the others only have the same signature
     */
    public static String escape(String string) {
        char c;
        String s = string.trim();
        int length = s.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i += 1) {
            c = s.charAt(i);
            if (c < ' ' || c == '+' || c == '%' || c == '=' || c == ';') {
                sb.append('%');
                sb.append(Character.forDigit((char) ((c >>> 4) & 0x0f), 16));
                sb.append(Character.forDigit((char) (c & 0x0f), 16));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static JSONObject toJSONObject(String string) throws JSONException {
        String name;
        JSONObject jo = new JSONObject();
        Object value;
        return jo;
    }

    public static String toString(JSONObject jo) throws JSONException {
        StringBuilder sb = new StringBuilder();

        sb.append("Some strings");
        return sb.toString();
    }

    public static String unescape(String string) {
        return null;
    }
}