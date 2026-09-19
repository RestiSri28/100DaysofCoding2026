import java.util.Scanner;

public class KonversiOtomatis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah produk: ");
        int jumlahProduk = input.nextInt();

        System.out.print("Masukkan harga produk: ");
        int hargaProduk = input.nextInt();

        System.out.print("Masukkan diskon: ");
        float diskon = input.nextFloat();

        int total = jumlahProduk * hargaProduk;

        long totalLong = total;
        double totalDouble = totalLong;
        double diskonDouble = diskon;

        System.out.println("\n=== HASIL BELANJA ===");
        System.out.println("Jumlah produk : " + jumlahProduk);
        System.out.println("Harga produk  : " + hargaProduk);
        System.out.println("Total (int)   : " + total);
        System.out.println("Total (long)  : " + totalLong);
        System.out.println("Diskon (float): " + diskon);
        System.out.println("Diskon (double): " + diskonDouble);

        input.close();
    }
}
