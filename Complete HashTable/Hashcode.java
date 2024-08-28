import java.util.HashMap;
import java.util.Set;

public class Hashcode {

    public static void main(String[] args) {

        HashMap<String , Integer> country = new HashMap<>();
        country.put("Pakistan",92);
        country.put("India",91);
        country.put("South Africa",101);
        country.put("Australia",9);
        country.put("America",1);
        country.put("Turkey",23);

        System.out.println(country.size());
        System.out.println(country);
        System.out.println();
        Set<String> keys = country.keySet();
        for(String key : keys){
            int postalCode = country.get(key);
            System.out.println(key + " : " + postalCode);

        }

        /*System.out.println("listen".hashCode());
        System.out.println("silent".hashCode());*/
    }


}
