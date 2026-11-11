public class Day71 {
    public static void main(String[] args) {

        for (int baris = 5; baris >= 1; baris--) {

            for (int kolom = 1; kolom <= baris; kolom++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
