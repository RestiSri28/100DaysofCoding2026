import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        double luas = Math.PI * jariJari * jariJari;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Jari-jari : " + jariJari);
        System.out.println("Luas lingkaran : " + luas);

        input.close();
    }
}
