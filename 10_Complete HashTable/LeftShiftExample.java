
    public class LeftShiftExample {
        public static void main(String[] args) {
            int hash = 3;
            int result = (hash << 5) - hash; // it's working in that pattern (hash*(hash << 5))-hash
            System.out.println("Result: " + result);
        }
    }


