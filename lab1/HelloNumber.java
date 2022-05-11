public class HelloNumber {
    public static void main (String[] args) {
        int y = 0; //ans
        for (int x = 0; x < 10; x++) {
            y = x + y;
            System.out.print (y + " ");
        }
    }
}