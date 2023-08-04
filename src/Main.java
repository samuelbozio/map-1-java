import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Samuel");
        cookies.put("email", "samuel@");
        cookies.put("phone", "99778822");

        System.out.println("All cookies: ");

        for (String key : cookies.keySet()) {
            System.out.println(key + ": " +cookies.get(key));
        }

    }
}