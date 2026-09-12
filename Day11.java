import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {

        // Membuat Scanner untuk menerima input dari keyboard
        Scanner input = new Scanner(System.in);

        // Meminta input nama
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        // Menampilkan hasil input
        System.out.println("Halo, " + nama + "!");

        input.close();
    }
}
