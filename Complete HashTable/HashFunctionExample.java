public class HashFunctionExample {
    public static int customHashFunction(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = 31 * hash + key.charAt(i);
        }
        return hash;
    }
    public static void main(String[] args) {
        String key = "example";
        int hashCode = customHashFunction(key);
        System.out.println("Hash code of '" + key + "': " + hashCode);
        System.out.println("example".hashCode());
    }


}
