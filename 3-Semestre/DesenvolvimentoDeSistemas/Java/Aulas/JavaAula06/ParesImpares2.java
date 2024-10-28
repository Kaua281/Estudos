public class ParesImpares2 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0 && i <= 50) {
                System.out.println(i);
            } else if (i % 2 != 0 && i > 50) {
                System.out.println(i);
            }
        }
    }
}
